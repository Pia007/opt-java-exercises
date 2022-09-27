public class Vehicle {

    //fields 
    private String name;
    private String size;

    private int velocity;
    private int direction;

    // constructor
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.velocity = 0;
        this.direction = 0;
    }

    // methods all vehicles have
    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Vehicle.steer(): Steering at " + direction + " angle.");
    }

    public void move(int velocity, int direction) {
        this.velocity = velocity;
        this.direction = direction;
        System.out.println("Vehicle.move(): Moving at " + velocity + " in direction " + direction);
    }

    public void stop() {
        this.velocity = 0;
        System.out.println("Car.stop(): Stopped.");
    }
    
    // getter
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDirection() {
        return direction;
    }


}
