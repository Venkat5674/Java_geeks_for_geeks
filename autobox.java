public class autobox {
    public static void main(String [] args){
        int x1 = 509;
        Integer x2 = x1; // Autoboxing: converting primitive int to Integer object
        int x3 = x2; // Unboxing: converting Integer object back to primitive int
        System.out.println("x1: " + x1); // x1 remains unchanged
        System.out.println("x2: " + x2); // x2 is an Integer object
        System.out.println("x3: " + x3); // x3 is the unboxed primitive int from x2
    }
}
