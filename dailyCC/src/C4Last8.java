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
    private int[] last8 = new int[8];
    private int index = 0;
    
    public void add(int value) {
        last8[index] = value;
        index = (index + 1) % 8;
    }
    
    public int[] last() {
        return last8;
    }
}
