package Dz13;

public class Solution1 {
    public static void main(String[] args){
        NewThread nt = new NewThread();
        nt.start();
    }
}

class NewThread extends Thread{
    public void run(){
        for(int i=0; i < 100; i++){
            System.out.println("i");
        }
    }
}
