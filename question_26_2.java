import java.util.*;
class NegativeAgeException extends Exception{
    @Override
    public String toString(){
        return "NegativeAge";
    }
    @Override
    public String getMessage(){
        return "age can not be negative";
    }  
}
public class question_26_2 {
    public static void main(String [] args){
        String name;
        int age;
        Scanner sc= new Scanner(System.in);
        name=sc.next();
        age=sc.nextInt();
        try{
            if(age<0){
                throw new NegativeAgeException();
            }
            else{
                System.out.println("name is: " + name);
                System.out.println("age is: " + age);
            }
        }catch(Exception e){
            System.out.println("exception caught: " + e.getMessage());
        }
    }
}
