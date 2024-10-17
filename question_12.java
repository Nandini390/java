import java.util.Scanner;
public class question_12 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of students: ");
        int n=sc.nextInt();
        while(n>=0){
        System.out.println("enter marks of mathematics: ");
        int x=sc.nextInt();
        System.out.println("enter marks of physics: ");
        int y=sc.nextInt();
        System.out.println("enter marks of chemistry: ");
        int z=sc.nextInt();
        int sum=x+y+z;
        if(x>=60 && y>=50 && z>=40 && (sum>=200 || x+y>=150)){
            System.out.println("student is eligible for admission.");
        }
        else{
            System.out.println("student is not eligible for admission");
        }
        n--;
    }
    }
}
