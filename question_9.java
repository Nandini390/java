import java.util.Scanner;
public class question_9 {
    public static int factorial(int x){
        if(x==1 || x==0){
            return 1;
        }
        return x*factorial(x-1);
    }
    public static void main(String[] args){
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("factorial of " + x + " is " + factorial(x) );
    }
}
