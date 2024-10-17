import java.util.Scanner;
public class question_15 {
    public static void table(int x){
        System.out.println("the table of "+x+" is ");
        for(int i=1;i<=10;i++){
            System.out.println(i*x);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number whole table is to be printed: ");
        int x=sc.nextInt();
        table(x);
    }
}
