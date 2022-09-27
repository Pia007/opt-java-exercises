import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Implement copy method (it is present in Collections by the way) that's able to copy the items from a source list into a destination list. 
// Use wildcards with the appropriate bounds!

// Hint: you have to copy the items from one of the lists into another list (so there are read and write operations accordingly).

public class Wildcards {

    // method
    // will have 2 list
        // one extends a generic type, src list
        // other is the destination list, dest
    public static <T> void copy(List<? extends T> src, List<? super T> dest) {
        // iterate through the src list
        for( T item : src) {
            // add the item to the dest list
            dest.add(item);
        }
    }

    public static void main(String[] args) throws Exception {
        
        // create a list 
            // list must be of the same type to copy from one to another
        List<String> src = Arrays.asList("Mary", "Lee", "John");
        List<String> dest = new ArrayList<>();
        
        copy(src, dest);
        System.out.println(dest);
    }
}
