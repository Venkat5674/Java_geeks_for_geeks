class Test{
    int x;
    int y;
}
public class nonprimit {
    public static void main(String[] args) {
       
        Test T = new Test();
        T.x = 509; T.y = 507;
        Test T2 = T;
        T2.y = 509;
        System.out.println(T.x);
        System.out.println(T2.x);
    }
}
