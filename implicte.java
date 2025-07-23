public class implicte {
    
    public static void main(String[] args) {
        
        int x1 = 509;
        float x2 = x1;
        double x3 = x1;
        System.out.println("x1: " + x1); // x1 remains unchanged
        System.out.println("x2: " + x2); // x2 is a float representation of x1
        System.out.println("x3: " + x3); // x3 is a double representation of x1
    }
}
