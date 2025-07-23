import java.io.*;

class buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a Name: ");

        String name  = br.readLine();

        System.out.println("Hello " + name + "!");

    }     
     
}