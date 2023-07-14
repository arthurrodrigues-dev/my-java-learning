package string;

public class Performance {
    public static void main(String[] args) {
       String series = "";
       for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
       } 
       // all of the strings created in order to concatenate the characters lose its references, the performance is bad
       System.out.println(series);
    }
}
