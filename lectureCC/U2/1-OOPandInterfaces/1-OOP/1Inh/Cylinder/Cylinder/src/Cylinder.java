public class Cylinder extends Circle{
    
    // fields
    private double height;

    // constructor
    public Cylinder( double radius, double height) {
        // inherit from parent class
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    // Methods: getters
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
