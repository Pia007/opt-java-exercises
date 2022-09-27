// write some code that calculates the gross profit (total revenue minus total expenses) for monthly financial reports.
// function - calculateGrossProfit - takes 2 [] of integers, daily reven and daily expenses
// returns an integer, that is the gross profit for the month
// gross profit = total revenue - total expenses
// How? 
// define gross profit variable
// loop through the both arrays?
// they are the same length - can I loop through one and use the index to access the other?
// at each interations, gross profit for that day get the difference between the revenue and expenses
// add that difference to the gross profit
// at the end of the loop - will have the gross profit
// return the difference

// Here's an example of how your class should behave:
// int grossProfit = calculateGrossProfit(new int[] { 30, 20, 50, 10 }, new int[] { 20, 30, 10, 20 });
// System.out.println(grossProfit); // 30



public class C1Profit {
    public static void main(String[] args) {
        // call the calculateProfit function
        int grossProfit = calculateGrossProfit(new int[] { 30, 20, 50, 10 }, new int[] { 20, 30, 10, 20 });
        System.out.println(grossProfit);
    }

    // write the calculateGrossProfit function here
    static int calculateGrossProfit(int[] revenue, int[] expenses) {
        int grossProfit = 0;
        for (int i = 0; i < revenue.length; i++) {
            grossProfit += revenue[i] - expenses[i];
        }
        return grossProfit;
    }
}