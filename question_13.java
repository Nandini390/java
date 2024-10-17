import java.util.Scanner;
public class question_13 {
   public static int sum(int x){
        if(x==1){
            return 1;
        }
        int ans=x+sum(x-1);
        return ans;
   }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number: ");
        int x=sc.nextInt();
        System.out.println("sum of natural numbers till "+x+" is: "+sum(x) );
    }
}