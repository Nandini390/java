import java.util.*;
class Employee {
    private int emp_id;
    private String emp_name;
    private double basic_salary;
    private double gross_salary;
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        emp_id = scanner.nextInt();
        
        scanner.nextLine(); 
        
        System.out.print("Enter Employee Name: ");
        emp_name = scanner.nextLine();
        
        System.out.print("Enter Basic Salary: ");
        basic_salary = scanner.nextDouble();
        gross_salary = basic_salary + (0.2 * basic_salary);
    }
    public void displayGrossSalary() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.printf("Basic Salary: %.2f\n", basic_salary);
        System.out.printf("Gross Salary: %.2f\n", gross_salary);
    }
}
public class question_14_2 {
    public static void main(String [] args){
      Employee E1= new Employee();
      E1.inputDetails();
      E1.displayGrossSalary();
    }
}
