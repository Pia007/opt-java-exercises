public class DeluxeBurger extends Hamburger {
    
    // fields
    // no additions allowed

    // constructor
    // comes with chips and drinks
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 17.99, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    //additions are not allowed, so override the addHamburgerAddition1 and addHamburgerAddition2 methods
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nCannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nCannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nCannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nCannot add additional items to a deluxe burger");
    }
}
