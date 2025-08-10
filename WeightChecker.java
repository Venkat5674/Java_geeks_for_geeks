import java.util.Scanner;

class Weight{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    int person = sc.nextInt();
    int cargo = sc.nextInt();

    boolean result = (person > 0 && cargo > 0) && (person + cargo <= 1000);
    System.out.println(result);
    }
}
