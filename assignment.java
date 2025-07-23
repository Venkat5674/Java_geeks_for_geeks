public class assignment {
    
    public static void main(String[] args) {
        
    int x = 10, y = 5, z;
    
    x += y; // x = x + y
    System.out.println(x); //15

    x -= y; // x = x - y
    System.out.println(x); //10

    x *= y; // x = x * y
    System.out.println(x); //50

    x /= y; // x = x / y
    System.out.println(x); //10

    x %= y; // x = x % y
    System.out.println(x); //0

    z = x = y; // z = x = y from right to left
    System.out.println(z); //5
    }
}
