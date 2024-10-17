import java.util.Scanner;
public class question_18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int x=sc.nextInt();
        int count=0;
        System.out.println("the total number of digits in "+x+" is: ");
        while(x>0){
            x=x/10;
            count++;
        }
        System.out.println(count);
    }
}
