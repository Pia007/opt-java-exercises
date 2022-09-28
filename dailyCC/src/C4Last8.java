import java.util.Arrays;

// Create a public class called Last8. You should expose two public methods:

// add: adds a value, does not return a value
// last: returns an array containing the last 8 values that were added, in any order.
// You do not need a constructor, but you can add an empty one if you need. Until 8 values have been added you should return 0s in their place.

public class C4Last8 {
    
    public static void main(String[] args) {
        Last8 example = new Last8();
        System.out.println(Arrays.toString(example.last())); // prints [0, 0, 0, 0, 0, 0, 0, 0]
        example.add(1);
        System.out.println(Arrays.toString(example.last())); // prints [0, 0, 0, 0, 0, 0, 0, 1] 
        // could print [ 0, 0, 0, 0, 0, 0, 1] or [0, 1, 0, 0, 0, 0, 0, 0] 
        example.add(8);
        System.out.println(Arrays.toString(example.last())); // prints [8, 1, 0, 0, 0, 0, 0, 0]
        // or [8, 0, 0, 0, 0, 0, 0, 1] or [0, 1, 0, 0, 0, 0, 8, 0]
    }

}

class Last8 {

    // init array with 8 items
    private int[] last8 = new int[8];

    // init index to 0
    private int index = 0;
    
    // add method 
        // add value to array
        // increment index to the sum of the index + 1 and the remainder of dividing by 8
    public void add(int value) {
        last8[index] = value;
        // ensures that the last eight values are return
        index = (index + 1) % 8;
    }
    
    // last method
        // return array
    public int[] last() {
        return last8;
    }
}
