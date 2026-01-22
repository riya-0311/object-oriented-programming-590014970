import java.util.Scanner;

public class arraysum {
    int sum = 0 ;
   int arr[] = new int[5];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            arraysum as = new arraysum();
            System.out.println("Enter 5 numbers:");
            for(int i = 0;i<5;i++){
                as.arr[i] = s.nextInt();
                as.sum  += as.arr[i];


        }
        System.out.println("Sum of array elements: " + as.sum);
    s.close();
    }
    
}
