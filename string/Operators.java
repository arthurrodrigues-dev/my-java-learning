package string;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));

        // this is same as after a few steps: "a" + "1"
        // int will be converted to Integer that calls toString()
        System.out.println("a" + 1);

        // always call the toString method for objects
        System.out.println("Arthur" + new ArrayList<>());
        // System.out.println("Arthur" + new Integer(47));

        // + in java you can use only in primitives, you can use in objects as well but the condition is at least one of the objects should be string type. 
        // System.out.println(new Integer(47) + new ArrayList<>()); // error


        // that works bc one of the objects is String!
        String ans = 56 + "" + new ArrayList<>();

        System.out.println(ans);

        // if any of the data type is string, answer is string!
        System.out.println("a" + 'b');
    }
}
