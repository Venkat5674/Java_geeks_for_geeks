import java.util.Scanner;

class Test{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println(getMax(x, y));
  }
public static int getMax(int x, int y){
  if(x > y){
    return x;
  }
  else{
    return y;
  }
}
}
