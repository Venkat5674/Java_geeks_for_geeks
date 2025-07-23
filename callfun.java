public class callfun {
    public static void main(String [] args){
        System.out.println("Before Call");

        fun();
        fun();

        System.out.println("After Call");
    }

    public static void fun(){
        System.out.println("Inside Fun");
}
}