class Counter {
    static int count = 0;
    public Counter() {
        count++; 
    }
    static void displayCount() {
        System.out.println("Current count: " + count);
    }
    static {
        count = 0; 
        System.out.println("Static block executed. Count initialized.");
    }
}

public class question_16_2 {
    public static void main(String[] args) {
        Counter.displayCount(); 
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter.displayCount(); 
    }
}
