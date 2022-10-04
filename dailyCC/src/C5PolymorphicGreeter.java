public class C5PolymorphicGreeter {

    public static void main(String[] args) throws Exception {
        Person[] people = new Person[3];
        people[0] = new Professor();
        people[1] = new Student();
        people[2] = new Staff("reading");
        for (Person person : people) {
            System.out.println(greet(person));
        }
    }

    // greet method
        // if person is null, return null
        // if person is a professor, return "Hi Professor Geoff"
        // if person is a student, return "Hey Friendly, you are not alone!"
        // if person is a staff, return "Thanks Chuchu for all your help with advising"

    public static String greet(Person person) {
        if (!(person instanceof Person)) {
            return null;
        } else if (person instanceof Professor ) {
            if (person.getName().equals("Geoff")) {
                return "Hi Professor Geoff";
            }
        } else if (person instanceof Student) {
            if (person.getName().equals("Friendly")) {
                return "Hey Friendly, you are not alone!";
            }
        } else if (person instanceof Staff) {
            String staffRole = ((Staff) person).getRole();
            if (staffRole.equals("advising")) {
                if (person.getName().equals("Chuchu")) {
                    return "Thanks Chuchu for all your help with advising";
                }
            }
        }
        return null;
    }
}

class Person {

    // fields
    private String name;

    public String getName() {
        return this.name;
    }
}

class Professor extends Person {

    @Override
    public String getName() {
        return "Mike";
    }
}

class Student extends Person {

    @Override
    public String getName() {
        return "Friendly";
    }
}

class Staff extends Person {

    // fields
    private String role;

    public Staff(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    @Override
    public String getName() {
        return "Chuchu";
    }
}