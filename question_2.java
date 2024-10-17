import java.util.Scanner;
public class question_2 {
    public static void main(String[] args){
     int x;
     System.out.println("enter a number: ");
     Scanner sc=new Scanner(System.in);
     x=sc.nextInt();
     if(x>0){
        System.out.println("the entered number is positive ");
     }else if(x<0){
      System.out.println("the entered number is negative ");
     }else{
        System.out.println("the entered number is zero");
     }
    }
}
