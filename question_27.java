import java.util.*;
public class question_27 {
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner (System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element: ");
            int x=sc.nextInt();
            arr[i]=x;
        }
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("the smallest element in given array is: " + smallest);
    }
}
