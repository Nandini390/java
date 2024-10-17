import java.util.Scanner;
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "radius can not be negative";
    }
    @Override
    public String getMessage(){
        return "enter a positive radius";
    }
}
public class question_19_2 {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double ans=3.14*r*r;
        return ans;
    }
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a radius: ");
        n=sc.nextInt();
        try{
            double a=area(n);
            System.out.println("area is : " + a);
        }
        catch(Exception e){
             System.out.println(e);
        }
        finally{
            System.out.println("this is the end of the program");
        }
    }
}
