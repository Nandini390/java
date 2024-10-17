class Num {
    protected int number;
    public Num(int number) {
        this.number = number;
    }
    public void shownum() {
        System.out.println("Number: " + number);
    }
}
class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }
    private String toHex(int num) {
        String hex = "";
        if (num == 0) return "0";
        while (num > 0) {
            int remainder = num % 16;
            if (remainder < 10) {
                hex = remainder + hex; 
            } else {
                hex = (char) ('A' + (remainder - 10)) + hex; 
            }
            num /= 16;
        }
        return hex;
    }
    private String toOct(int num) {
        String octal = "";
        if (num == 0) return "0";
        while (num > 0) {
            int remainder = num % 8;
            octal = remainder + octal;
            num /= 8;
        }
        return octal;
    }
    @Override
    public void shownum() {
        super.shownum(); 
        System.out.println("Hexadecimal: " + toHex(number));
        System.out.println("Octal: " + toOct(number));
    }
}
public class question_11_2{
    public static void main(String[] args) {
        Num num = new Num(255);
        System.out.println("Using Num class:");
        num.shownum();

        System.out.println();
        HexNum hexNum = new HexNum(255);
        System.out.println("Using HexNum class:");
        hexNum.shownum();
    }
}
