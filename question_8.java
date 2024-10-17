import java.util.Scanner;
public class question_8 {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     System.out.println("enter a number: ");
     int x=sc.nextInt();
     System.out.println("enter a divisor: ");
     int y= sc.nextInt();
     if(x%y==0){
        System.out.println(x + " is divisible by " + y);
     }else{
        System.out.println(x+ " is not dicvisible by " + y);
     }
    }
}
