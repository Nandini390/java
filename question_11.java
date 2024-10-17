import java.util.Scanner;
public class question_11 {
    public static int reverse(int x){
        int ans=0;
        int n=0;
        while(x>0){
            ans=ans*10;
            n=x%10;
            ans=ans+n;
            x=x/10;
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number: ");
        int x=sc.nextInt();
        System.out.println("the reverse of given number is " + reverse(x));
    }
}
