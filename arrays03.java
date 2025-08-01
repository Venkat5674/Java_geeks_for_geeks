class arrays{
    public static void main(String[] args) {
        int [] a = new int[10];

        int x = 10;

        for(int i = 0; i < a.length; i++){
            a[i] = x;
            x = x + 10;
        }

        System.out.print("Array Elements: ");

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] +" ");
        }
    }
}
