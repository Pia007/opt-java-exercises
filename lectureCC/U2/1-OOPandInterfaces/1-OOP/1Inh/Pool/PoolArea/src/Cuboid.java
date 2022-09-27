public class Cuboid extends Rectangle {
    
    // fields
    private double height;

    // constructor
    public Cuboid( double width, double length, double height ) {
        super( width, length );
        this.height = ( height < 0 ) ? 0 : height;
    }
    
    // methods getters
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
