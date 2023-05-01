package Dz10.Ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("File.txt");
            FileOutputStream fos = new FileOutputStream("FileCopy.txt")){
            byte[] buff = new byte[256];
            int i;
            while((i=fis.read(buff))!= -1){
                fos.write(buff,0,i);
            }
            System.out.println("File is copied");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
