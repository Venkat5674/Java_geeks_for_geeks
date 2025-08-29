//String Concat()
class StringConcat{
    public static void main(String [] args){
        String str1 = "Venkatesh";
        String str2 = str1;
       
        str1 = str1.concat("Pamudurti");
        
        System.out.println(str1);
        System.out.println(str1 == str2);
       
    }
}
