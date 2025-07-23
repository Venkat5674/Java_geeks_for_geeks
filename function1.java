class Test {
  public static void main(String[] args) {
    System.out.println("Main Begins");
    fun1();
    System.out.println("Main Ends");
  }

  public static void fun1() {
    System.out.println("Function 1 Starts");
    fun2();
    System.out.println("Function 1 Ends");
  }

  public static void fun2() {
    System.out.println("Function 2 Starts");
    System.out.println("Inside the Function 2");
    System.out.println("Function 2 Ends");
  }
}
