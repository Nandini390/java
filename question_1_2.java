public class question_1_2 {
    public static void merge(int[] arr1, int n1, int [] arr2, int n2, int[] arr3){
        int a=0;
        int b=0;
        int c=0;
        while(a<n1 && b<n2){
            if(arr1[a]<arr2[b]){
              arr3[c++]=arr1[a++];
            }else{
                arr3[c++]=arr2[b++];
            }
        }
        while(a<n1){
            arr3[c++]=arr1[a++];
        }
        while(b<n2){
            arr3[c++]=arr2[b++];
        }
    }
    public static void main(String[] args){
        int [] A = {2,4,6,8};
        int [] B={1,3,5,7};
        int n1=A.length;
        int n2=B.length;
        int n3=n1+n2;
        int[] C=new int[n3];
        merge(A,n1,B,n2,C);
        System.out.println("the merged array is: ");
        for(int i=0;i<n3;i++){
           System.out.print(C[i] + " ");
        }
    }
}
