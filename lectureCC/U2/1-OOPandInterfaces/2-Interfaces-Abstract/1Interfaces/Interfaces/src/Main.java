import java.util.ArrayList;
import java.util.Scanner;

// Override the toString() method for each of your classes so that they can be easily printed to enable
// the program to be tested easier.
//
// In Main, write a method that takes an object that implements the interface as a parameter and
// "saves" the values e.g. calls the method defined in the interface.

// We haven't covered I/O yet, so your method should just print the values to the screen.
// Also in the Main class, write a method that restores the values to a Saveable object
// e.g. calls the method from the interface for populating fields (see above).

// Again, we are not going to use Java file I/O; instead use the readValues() method below to
// simulate getting values from a file – this allows you to type as many values as your class
// requires, and returns an ArrayList.
// There is a whole Java I/O section later in the course where you will get to use files, etc.

public class Main {
    public static void main(String[] args) throws Exception {
       
        // instantiate a new player object
        Player mark = new Player("Mark", 10, 15);
        System.out.println(mark.toString());
        saveObject(mark);

        mark.setHitPoints(8);
        System.out.println(mark);
        mark.setWeapon("Stormbringer");
        saveObject(mark);
        
        // loadObject(mark);  removed instantiating the monster object
        System.out.println(mark);

        // instantiate a new monster object
        ISaveable werewolf = new Monster("Werewolf", 20, 50);
        // werewolf.getStrength();  will, not work werewolf has a getStrength() method, but it is not in the ISaveable interface
        // will only work if:
            //  Monster werewolf = new Monster("Werewolf", 20, 50);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());  // this will work bc we are casting werewolf to a Monster object

        System.out.println(werewolf);
        saveObject(werewolf);
        // System.out.println("Strength = " + ((Monster) werewolf).getStrength());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        try (Scanner scan = new Scanner(System.in)) {
            boolean quit = false;
            int index = 0;
            System.out.println("Choose\n" +
                    "1 to enter a string\n" +
                    "0 to quit");

            while (!quit) {
                System.out.print("Choose an option: ");
                int choice = scan.nextInt();
                scan.nextLine();
                switch (choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        System.out.print("Enter a string: ");
                        String stringInput = scan.nextLine();
                        values.add(index, stringInput);
                        index++;
                        break;
                }
            }
        }
        return values;
    }

    // save the object
    // passing in the ISaveable interface as a parameter
        // enable to use any object thats using the ISaveable interface
    public static void saveObject(ISaveable objectToSave) {

        // interating over all of the entries by using the .write() method
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    // loading the object
    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}


// werewolf.getStrength(); will, not work although werewolf has a getStrength()
    // method, but it is not in the ISaveable interface, and werewolf is an ISaveable object
// will only work if:
    // Monster werewolf = new Monster("Werewolf", 20, 50);

