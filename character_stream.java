import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class character_stream {
    public static void main(String[] args) {
        System.out.println(" BEFORE UPDATING ");
        try {
            FileReader fr = new FileReader("charfile.txt");
            int i;
            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println(e)
            
            System.out.println("AFTER UPDATING");
            try {
            FileWriter fw = new FileWriter("charfile.txt");
            fw.write("Java I/O Streams Example");
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

        }
    


