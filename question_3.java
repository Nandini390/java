import java.util.Scanner;
public class question_3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3 numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>y){
            if(x>z){
                System.out.println(x + " is the maximun number.");
            }
            else{
                System.out.println(z + " is the maximum number. ");
            }
        }else{
             if(y>z){
                System.out.println(y + " is the maximum number.");
             }
             else{
                System.out.println(z + " is the maximum number");
             }
        }
    }
}
