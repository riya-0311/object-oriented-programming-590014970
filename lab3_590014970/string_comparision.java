
    import java.util.Scanner;
public class string_comparision {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("enter the 1st string: ");
        String s1=s.nextLine();

        System.out.print("enter the 2nd string: ");
        String s2=s.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Both strings are same");
        } else {
            System.out.println("Both strings are not same");
        }

        s.close();
    }
}

    

