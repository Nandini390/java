import java.util.Scanner;

public class question_30 {
    public static void main(String[] args){
         int n;
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the size of array: ");
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element: ");
            int x=sc.nextInt();
            arr[i]=x;
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
