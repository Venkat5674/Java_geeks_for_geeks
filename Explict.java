public class Explict {
    
    public static void main(String[] args) {
        
        double d = 65.5;
        int i =  (int) d;
        char c = (char) i;
        System.out.println(i);
        System.out.println(c); // This will print 'A' since 65 corresponds to 'A' in ASCII

    }
}
