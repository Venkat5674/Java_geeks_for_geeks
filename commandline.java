class commandline{
  public static void main(String [] args){
    if(args.length > 0){
      System.out.println("Arguments passed to the program : ");
      for(String x : args){
        System.out.println(x + " ");
      }
    }
    else{
      System.out.println("No arguments were passed.");
    }
  }
}
