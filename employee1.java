public class employee1{
    float salary=40000;
}
class programmer extends employee1{
    int bonus=10000;
    public static void main(String [] args){
        programmer p=new programmer();
        System.out.println("programmer salary is: " + p.salary);
        System.out.println("Bonus of programmer is "+ p.bonus);
    }
}


