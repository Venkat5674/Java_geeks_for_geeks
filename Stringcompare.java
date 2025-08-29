//String CompareTo()
class Stringcompare{
    public static void main(String [] args){
        String str1 = "Venkatesh";
        String str2 = "Venkat";
        int res = str1.compareTo(str2);
        if(res==0){
        System.out.println("Same");
        }
        if(res>0){
        System.out.println("S1 Greater");
        }
        if(res<0){
        System.out.println("S1 Smaller");
        }
    }
}
