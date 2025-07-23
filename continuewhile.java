public class continuewhile {
    
    public static void main(String [] args)
    {
        int i = 0;
        while(i<3){
          i++;
          System.out.println("Before" + i);
          if (i == 2)
            {
                continue; // Skip the rest of the loop when i is 2
            }  
        System.out.println("After" + i);
        }
    }
}
