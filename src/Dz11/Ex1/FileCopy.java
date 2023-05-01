package Dz11.Ex1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fileIn = new FileInputStream("src\\io\\file.txt");
            FileOutputStream fileOut = new FileOutputStream("src\\io\\copied_file.txt")) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
