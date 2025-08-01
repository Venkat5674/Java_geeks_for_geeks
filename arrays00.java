// Method 1 of creating an array in Java
class arrays{
    public static void main(String [] args){
        int [] a ; // Declaration of an array
        a = new int[5]; // Creation of an array with size 5
        // Initializing the array elements
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        System.out.print("Array elements: "); // Print the elements of the array
        for(int i =0; i<a.length; i++){ // Loop through the array
            System.out.print(a[i] + " ");
        }
    }
}
