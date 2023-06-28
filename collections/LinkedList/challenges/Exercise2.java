package collections.LinkedList.challenges;

// import java.util.Iterator;
import java.util.LinkedList;

//  Write a Java program to iterate through all elements in a linked list.

public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<String> emails = new LinkedList<>();
        emails.add("@google.com.br");
        emails.add("@random.email.com");
        emails.add("@rodrigues.arthur");    

        emails.stream().forEach(System.out::println);
        
        // Iterator<String> it = emails.iterator();
        
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
    
    }
}
