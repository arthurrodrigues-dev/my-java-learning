package string;

public class Comparison {
    public static void main(String[] args) {
        String a = "Arthur";
        String b = "Arthur"; // that is equivalent to doing b = a
    
        // checking if the two variables are pointing to the same object (== operator).

        System.out.println(a == b); // true bc they are pointing to the same object in String pool

        String c = new String("Pam");
        String d = new String("Pam");

        System.out.println(c == d); // false bc they are not pointing to the same object, and both are in heap

        // .equals() method compare the values.
        System.out.println("using equals: ");
        System.out.println(c.equals(d));
    }
}
