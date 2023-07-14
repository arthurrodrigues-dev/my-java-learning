package string;

public class StringsInternally {
    public static void main(String[] args) {
        // a and b are pointing to one object only.
        String a = "Jim";
        String b = "Jim";

        System.out.println(a);
        // here it is not modifying the string, since strings are immutable, is creating a new string object in String pool called "Pam"
        a = "Pam";
        System.out.println(a);
    }
}
