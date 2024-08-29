public class eighth {
    public static void main(String[] args){
        int a=5;
        for(int i=2;i<(a/2);i++){
            if(a%i==0){
                System.out.println("the number is not a prime number.");
                break;
        } else { 
            System.out.println(" prime number");
                     break; 
                    }
}

    if(a%2==0){
    System.out.println("it is a even number");
   }else{
    System.out.println("it is a odd number");
   }

int f=1;
    for(int i=1;i<=a;i++){
        f*=i;
    }
    System.out.println("factorial of number is: ");
    System.out.println(f);
}
}
