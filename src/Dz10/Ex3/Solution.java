package Dz10.Ex3;

import java.io.File;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File file= new File(path);
        check(file);
    }

    public static void check(File dir){
        if(dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    check(item);
                } else {
                    System.out.println("Каталог - " + dir.getName()+"\tФайл - "+item.getName());
                }
            }
        }
    }
}
