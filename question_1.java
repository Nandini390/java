import java.util.*;
public class question_1 {
    public static double celsius_to_fahrenheit(double x){
        double ans=1.8*(x-32);
        return ans;
    }
    public 
    static double fahrenheit_to_celsius(double x){
        double ans=0.556*(x-32);
     return ans;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number ");
       int x=sc.nextInt();
       System.out.println("enter for 'C' for celsius and 'F' for fahrenheit: ");
       String y=sc.next();
       if(y == "C"){
        double a=celsius_to_fahrenheit(x);
        System.out.println(a);
       }
       else{
        System.out.println(fahrenheit_to_celsius(x));
       }

    }
}
