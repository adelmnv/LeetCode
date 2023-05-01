package Dz12;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        //1
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File dir= new File(path);
        if(dir.isDirectory()){
            for(File t : dir.listFiles()){
                System.out.println(t.getName());
            }
        }

        //2
        String folder = in.nextLine();
        String extension = in.nextLine();
        File dir2 = new File(folder);
        if(dir2.isDirectory()){
            ArrayList<File> files = new ArrayList<File>();
            for(File t : dir2.listFiles()){
                if(t.getName().endsWith(extension)){
                    files.add(t);
                    System.out.println(t.getName());
                }
            }
        }

        //3
        String path3 = in.nextLine();
        File dir3 = new File(path3);
        System.out.println("is file/directory exist: "+dir3.exists());

        //4
        String path4 = in.nextLine();
        File dir4 = new File(path4);
        System.out.println("does file have read permission: "+dir4.canRead());
        System.out.println("does file have write permission: "+dir4.canWrite());

        //5
        String path5 = in.nextLine();
        File dir5 = new File(path5);
        if(dir.isDirectory()){
            System.out.println("This is a directory");
        }
        else if(dir5.isFile()){
            System.out.println("This is a file");
        }



    }
}
