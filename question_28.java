import java.util.Scanner;

public class question_28 {
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
        int sum=0;
        for(int i=0;i<n;i++){
            int ans=arr[i];
            if(ans%2!=0){
              sum=sum+ans;
            }
        }
        System.out.println("the sum of all odd number of array is: " + sum);
    }
}
