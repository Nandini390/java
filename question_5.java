import java.util.Scanner;
public class question_5 {
    public static double miles_to_kilometers(double x){
        double ans=1.609344*x;
        return ans;
    }
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       int x=sc.nextInt();
       double ans=miles_to_kilometers(x);
       System.out.println(x + " in kilometers is " + ans);
    }
}

