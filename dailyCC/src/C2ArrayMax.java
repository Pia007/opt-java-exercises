// Write a function that can determine the maximum of any number of double values stored in an array.
// It should accept an array of doubles as its single argument, and return the maximum value stored in the array.
// If the array is empty or null, you should return 0.0.



public class C2ArrayMax {

    public static void main(String[] args) {
        // call the arrayMax function
        double max = arrayMax(new double[] { -3.2, -1.2, -8.6, -7.8, -2.3 });
        System.out.println(max);  
    }

    static double arrayMax(double[] arr) {
        //define max variable
        double max = arr[0];

        // check if the array is empty or null
        if (arr == null || arr.length == 0) {
            return 0.0;
        }

        // iterate over array and compare each element to max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}