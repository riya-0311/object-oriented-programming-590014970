import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Byte_stream {
public static void main(String[] args) {
    System.out.println("BEFORE UPDATING THE FILE : ");
try {
FileInputStream fis = new FileInputStream("\nsample.txt");
int i;
while((i = fis.read()) != -1) {
System.out.print((char)i);
}
fis.close();
} catch (IOException e) {
System.out.println(e);
}
try {
FileOutputStream fos = new FileOutputStream("sample.txt");
String data = "I study in dehradun .";
fos.write(data.getBytes());
fos.close();
System.out.println("Data written successfully.");
} catch (IOException e) {
System.out.println(e);
}
}

}



