 class employee {
    String name;
    int date_of_joining;
    int total_experience;
    double salary;
    String department_name;
    int year=0;
    public void set(String n,int date,int years,float salary,String department){
        name=n;
        date_of_joining=date;
        total_experience=years;
        //this.salary=salary*0.05;
        if(year==0){
          this.salary=salary;
        }
        else{
          this.salary=salary*0.05;
        }
        department_name=department;
    }
    public String getname(){
      return name;
    }
    public int getdate_of_joining(){
      return date_of_joining;
    }
    public double get_salary(){
      return salary;
    }
    public String getdepartment_name(){
      return department_name;
    }
}

public class employee_class{
  public static void main(String[] args){
    employee E1 = new employee();
    E1.set("Akash",05102005,10,3400,"Sales");
    String s=E1.getname();
    System.out.println(s);
    int y=E1.getdate_of_joining();
    System.out.println(y);
    double w=E1.get_salary();
    System.out.println(w);
    String q=E1.getdepartment_name();
    System.out.println(q);
  }
}