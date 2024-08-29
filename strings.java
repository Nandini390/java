//write a program that take input from a user in form of string and convert all the consonents with dollar and all the vowels with hash
import java.util.Scanner;
public class strings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        StringBuilder result = new StringBuilder();
        int y=s1.length();
        System.out.println("the length of string is: " + y);
        //String vowels="AEIOUaeiou";
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < y; i++) {
            if (vowels.indexOf(s1.charAt(i)) >= 0) {
                result.append('#');
            } else if (Character.isLetter(s1.charAt(i))) {
                result.append('$');
            } else {
                result.append(s1.charAt(i));
        System.out.println("Modified string: " + result.toString());
    }
}
    }
}
