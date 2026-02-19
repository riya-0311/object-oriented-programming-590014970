import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class merged_file {
    public static void main(String[] args) {

        try {
            FileReader fr1 = new FileReader("sample1.txt");
            FileReader fr2 = new FileReader("sample2.txt");

            FileWriter fw = new FileWriter("merged.txt");

            int i;
            while ((i = fr1.read()) != -1) {
                fw.write(i);
            }

            fw.write('\n');

            while ((i = fr2.read()) != -1) {
                fw.write(i);
            }

            fr1.close();
            fr2.close();
            fw.close();

            System.out.println("Files merged successfully into merged.txt");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}