import java.util.Scanner;

public class celtofr {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int cel = s.nextInt();
        double fr = (cel * 9.0 / 5.0) + 32.0;
        System.out.println("The temperature in Fahrenheit is: " + fr);
    }
}
