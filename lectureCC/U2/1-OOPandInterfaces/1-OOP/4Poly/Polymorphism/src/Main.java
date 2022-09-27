// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

class Car {
    // fields
    private String name;
    private int cylinders;
    private int wheels;

    // constructor 
    public Car(String name, int cylinders ) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    // methods
    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public String color() {
        return "The color of this car is unknown!";
    }

    public String popular() {
        return "This car is not popular!";
    }

    // getters
    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Volvo extends Car {
    // constructor
    public Volvo() {
        super("Volvo", 6);
    }

    // methods

    @Override
    public String color() {
        return "This car is red!";
    }

    @Override
    public String popular() {
        return "This car is popular!";
    }
}

class BMW extends Car {
    // constructor
    public BMW() {
        super("BMW", 6);
    }

    // methods
    @Override
    public String color() {
        return "This car is blue!";
    }

    @Override
    public String popular() {
        return "There are a lot of BMW's on the road!";
    }
}

class Audi extends Car {
    // constructor
    public Audi() {
        super("Audi", 4);
    }

    // methods
    @Override
    public String color() {
        return "This car is black!";
    }

    @Override
    public String popular() {
        return "The Audi is a popular car!";
    }
}

class Buick extends Car {
    // constructor
    public Buick() {
        super("Buick", 8);
    }

    // methods
    @Override
    public String color() {
        return "This car is white!";
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        for (int i = 1; i < 11; i++) {
            
            Car car = randomCar();
            
            System.out.println("Car #" + i + " : " + car.getName() + "\n" 
                                + "Color: " + car.color() + "\n"
                                + "Popularity: " + car.popular() + "\n");
        }
    }


    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Volvo();
            case 2:
                return new BMW();
            case 3:
                return new Audi();
            case 4:
                return new Buick();
            default:
                return null;
        }
    }
    
}
