import java.util.Scanner;
public class question_10 {
    public static int fibonacci(int x){
       if(x==1 || x==0){
        return 1;
       }
        int ans=fibonacci(x-1)+ fibonacci(x-2);
       return ans;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int x=sc.nextInt();
        System.out.println("fibonacci series for " + x + " is " + fibonacci(x));
    }
}
