class Vehicle{
    String vehicle_number;
    String owners_name;
    String company_name;
    Vehicle(String vehicle_number, String owners_name,String company_name){
        this.vehicle_number=vehicle_number;
        this.owners_name=owners_name;
        this.company_name=company_name;
    }
    public void showdata(){
        System.out.println("your vehicle number is "+ vehicle_number);
        System.out.println("owners name is "+ owners_name);
        System.out.println("the company name of your vehicle is: "+ company_name);
    }
}
public class question_15_2 {
    public static void main(String[] args){
        Vehicle v1= new Vehicle("MP09WA5634","aditya","Toyota");
        v1.showdata();
    }
}
