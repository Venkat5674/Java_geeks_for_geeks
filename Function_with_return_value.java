import java.util.Scanner;

class Solution {
    // code here
    public static int returnValueFunction(int n){
        return n *2;
    }
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        int result = returnValueFunction(n);
        System.out.println("Output: " + result);
        
    }
}
