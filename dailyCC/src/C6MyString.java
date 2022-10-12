public class C6MyString implements Comparable<C6MyString> {
    /*
    Create a public class named MyString. MyString should provide a public
    constructor that accepts a single String argument.
    You should reject null Strings in your constructor using assert.
     * 
    MyString should also implement the Java Comparable<MyString> interface,
    returning 1 for a positive result and -1 for a negative result. Normally
    Strings are compared lexicographically: "aaa" comes before "z". MyString
    should compare instances based on the length of its stored String. So
    MyString("aaa") should come after MyString("z"), since "aaa" is longer than
    "z"
    
        Challenge can be found here:
        https://www.learncs.online/practice/java/string-length-comparable-parameterized?returnTo=implementinginterfaces#string-length-comparable-parameterized
     */

    
    // init string
    private String init;  

    // constructor
    public C6MyString(String str) {
        // is passed string null?
        assert str != null;
        // if not, set init to passed string
        init = str;
    }

    /* check if passed string is longer than init
            if so, return 1
        othewise if passed string is shorter than init
            return -1
        otherwise return 0
    */

    public int compareTo(C6MyString str) {
        // use a ternary operator to return 1, -1, or 0
        return this.init.length() > str.init.length() ? 1 : this.init.length() < str.init.length() ? -1 : 0;
        
    }

    // test
    public static void main(String[] args) {
        C6MyString a = new C6MyString("aaa");
        C6MyString z = new C6MyString("z");
        System.out.println(a.compareTo(z));
    }


}
