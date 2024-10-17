import java.util.*;
class NegativeArrayIndexException extends Exception{
    public String toString(){
        return "array index can not be negative";
    }
    public String getMessage(){
        return "enter a positive index";
    }
}
public class question_20_2 {
    public static void main(String[] args){
        int [] box= new int[3];
        box[0]=34;
        box[1]=45;
        box[2]=89;
        int idx;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a index: ");
        idx=sc.nextInt();
        System.out.println("enter a number from which you wish to divide: ");
        int n=sc.nextInt();
        try{
               if(idx<0){
                try{
                    throw new NegativeArrayIndexException();
                }
                catch(Exception e){
                       System.out.println(e);
                }
               }else{
                System.out.println("the value at index " + idx + " is " + box[idx]);
                System.out.println("the value after dividing is: " + box[idx]/n);
               }
        }catch(ArithmeticException e){
             System.out.println(e);
        }
    }
}
