import java.util.Scanner;

    public class frequency_array {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency of " + key + " = " + count);
    }
}
    

