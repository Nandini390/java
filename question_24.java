public class question_24 {
    public static int sum(int [] arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static double average(int [] arr){
        int n=arr.length;
        double avg=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        avg=sum/n;
        return avg;
    }
    public static void main(String args[]){
       int [] arr={1,5,3,6,8,3};
       System.out.println("the average of array is: " + sum(arr));
       System.out.println("the sum of array is: " + average(arr));
    }
}
