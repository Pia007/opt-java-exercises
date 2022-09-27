// Create a public class PingPonger. A PingPonger is in one of two states: ping or pong. 
// You should provide a constructor accepting a String argument that sets the initial state. 
// If the passed String is "ping", the initial state is ping. 
// If the passed String is "pong", the initial state is pong. 
//If the passed String is not ping or pong, 
    //you should throw an IllegalArgumentException.

// Once the PingPonger has been created, the user should call pong if the state is ping and ping if the state is pong. 
// ping takes no arguments and returns true. pong takes no arguments and returns false. If ping or pong is called out of order, 
    //you should throw an IllegalStateException.


public class C3PingPonger {

    public static void main(String[] args)  {

        // create a new PingPonger object and call the ping method
        PingPonger first = new PingPonger("ping");
        
        first.pong(); // returns false
        // first.ping(); // returns true
        // first.ping(); // throws IllegalStateException

        // create a new PingPonger object and call the pong method
        PingPonger second = new PingPonger("pong");
        second.ping(); // returns true
        // second.pong(); // throws IllegalStateException
        
        // create a new PingPonger object and call the pong method
        // PingPonger third = new PingPonger("whoops");  // throwsIllegalArgumentException
        
    }

}

class PingPonger {
    private String state;

    public PingPonger(String state) {
        if (!state.equals("ping") && !state.equals("pong")) {
            throw new IllegalArgumentException();
        }
        this.state = state;
    }
    public boolean ping() {
        if (!state.equals("pong")) {
            throw new IllegalStateException();
        } 

        state = "ping";
        System.out.println("true");
        return true;
    }
    public boolean pong() {
        if (!state.equals("ping")) {
            throw new IllegalStateException();
        } 

        state = "pong";
        System.out.println("false");
        return false;
    }
}