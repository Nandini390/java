import java.util.Scanner;
public class question_4 {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       int x=sc.nextInt();
       int y=sc.nextInt();
       System.out.println("numbers before swapping are: " + x + " , " + y);
       int temp=x;
       x=y;
       y=temp;
       System.out.println("number aftyer swapping are: " + x + " , " + y);
    }
}
