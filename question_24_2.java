import java.util.*;
class TooOlderException extends Exception{
    @Override
    public String toString(){
        return "TooOld";
    }
    @Override
    public String getMessage(){
        return "age is too old";
    }  
}
class TooYoungerException extends Exception{
    @Override
    public String toString(){
        return "TooYoung";
    }
    @Override
    public String getMessage(){
        return "age is too young";
    }
}
public class question_24_2 {
    public static void main(String [] args){
        String name;
        int age;
        Scanner sc= new Scanner(System.in);
        name=sc.next();
        age=sc.nextInt();
        try{
            if(age>45){
                throw new TooOlderException();
            }
            else if(age<20){
                throw new TooYoungerException();
            }else{
                System.out.println("Eligible..");
                System.out.println("name of the candidate is: " + name);
            }
        }catch(Exception e){
            System.out.println("exception caught: " + e.getMessage());
        }
    }
}
