import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        FileWriter writer = new FileWriter("src/test.txt");

        FileReader reader =  new FileReader("src/file IO.txt");
        int data = reader.read();
        while(data != -1){
            writer.write((char)data);
            //System.out.print((char)data);
            data = reader.read();
        }
        reader.close();
        writer.close();
    }
}