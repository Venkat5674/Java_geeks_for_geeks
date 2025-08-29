//String Literal Pool in java
class StringLP{
    public static void main(String [] args){
        String str1 = "Venkatesh";
        String str2 = "Venkatesh";
        
        if(str1 == str2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        String str3 = new String("Venkatesh");
        
        if(str1 == str3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
