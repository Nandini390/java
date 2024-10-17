class temp{
    int x;
    int y;
    int z;
    int add(int a, int b){
        x=a;
        y=b;
        return a+b;
    }
    int add(int a,int b, int c){
        x=a;
        y=b;
        z=c;
        return a+b+c;
    }
}
public class question_6_2 {
    public static void main(String[] args){
    temp t1= new temp();
    System.out.println(" the sum of 2 digits is: " + t1.add(4,5));
    System.out.println("the sum of 3 digits is : " + t1.add(3,6,5));
    }
}
