import java.util.Scanner;
public class question_16 {
    public static int findHCF(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
  
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int hcf = findHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
    }
} 
