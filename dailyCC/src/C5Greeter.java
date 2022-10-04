public class C5PGreeter {

    // greet method
        // if person is null, return null
        // if person is a professor, return "Hi Professor Geoff"
        // if person is a student, return "Hey Friendly, you are not alone!"
        // if person is a staff, return "Thanks Chuchu for all your help with advising"

    public static String greet(Person person) {
        if (person instanceof Professor) {
            String name = person.getName();
            return "Hi Professor " + name;
        } else if (person instanceof Student) {
            String name = person.getName();
            return "Hey " + name + ", you are not alone!";
        } else if (person instanceof Staff) {
            String name = person.getName();
            String role = ((Staff) person).getRole();
            return ("Thanks " + name + " for all your help with " + role);
        } else {
            return null;
        }
    }
}

