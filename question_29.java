import java.util.Scanner;

public class question_29 {
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
        int freq=1;
        for(int i=0;i<n;i++){
            int ele=arr[i];
            for(int j=i+1;j<n;j++){
                if(ele==arr[j]){
                    freq++;
                }
            }
            if(freq!=1){
                System.out.println("the element "+ ele + " is duplicate element present in array with frequency " + freq);
            }
            freq=0;
        }
    }
}
