public class Circle {
    
    // fields 
    private double radius;

    // constructor
    public Circle (double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    // Methods: getters
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}
