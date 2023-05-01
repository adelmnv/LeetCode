package Dz13;

public class Solution3 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        SuperThread[] threads = new SuperThread[]{new SuperThread(sb), new SuperThread(sb), new SuperThread(sb)
        };
        for (SuperThread thread : threads) {
            thread.start();
        }
    }
}

class SuperThread extends Thread{
    private StringBuilder sb;
    public SuperThread(StringBuilder s){
        this.sb = s;
    }
    public void run(){
        synchronized (sb){
            for (int i=0;i<100;i++){
                System.out.println(sb);
            }
            System.out.println();
            char ch = sb.charAt(0);
            sb.setCharAt(0, ++ch);
        }
    }
}
