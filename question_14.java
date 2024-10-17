import java.util.Scanner;
public class question_14 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a range: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=1;
        System.out.println("all multiples of 10 between "+x +" and "+y+" is ");
        for(int i=x; i<=y;i++){
           if(i%10==0){
            System.out.println(i);
           }
        }
    }
}
