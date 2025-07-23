public class format {
    
    public static void main(String[] args) {
        
        int x  = 509, y = 507;
        System.out.format("Value of x is %d\n", x);

        float f = (float) Math.PI;

        System.out.println(f);

        System.out.format("Value of  PI = %.2f\n", f);
        System.out.format("Value of PI = %5.2f\n", f);
        System.out.format("Value of PI = %05.2f\n", f);
        System.out.printf("x = %d, y = %d", x, y);

    }

}
