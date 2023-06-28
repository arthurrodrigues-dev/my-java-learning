package collections.LinkedList.challenges;

import java.util.LinkedList;

// Write a Java program to append the specified element to the end of a linked list.


public class Exercise1 {
    public static void main(String[] args) {
        LinkedList<String> emails = new LinkedList<>();
        emails.add("@google.com.br");
        emails.add("@random.email.com");
        
        String element = "@rodrigues.arthur";
        
        emails.add(element);

        System.out.println(emails);

    }
}