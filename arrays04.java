import java.util.Scanner;

class arrays{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the Number of elements: ");
        int size = sc.nextInt();

        int [] numbers = new int[size]; // Declaration and initialization of an array

        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Array elements: "); // Print the elements of the array
        for(int num : numbers){
            System.out.print(num + " ");
        }

    }
}
