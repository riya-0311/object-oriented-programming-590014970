import java.util.Scanner;
class firstcode{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Hello coder");

        int n;
        String [] a = new String[100];
        System.out.println("Enter the value of  n");
        n = s.nextInt();
         s.nextLine();

        System.out.println("Enter characters in array");
        for(int i=0;i<5;i++){
            a[i] = s.nextLine();
        }

        System.out.println("The value of n is: " + n);
         System.out.println("The elements in the array are:");
         for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

       


        s.close();
    }
}

    
