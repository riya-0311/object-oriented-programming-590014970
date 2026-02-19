import java.io.FileWriter;
import java.io.IOException;

public class fileAppendexample {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("charfile.txt", true); // true = append mode
            fw.write("\nThis line is appended.");
            fw.close();

            System.out.println("Data appended successfully.");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}