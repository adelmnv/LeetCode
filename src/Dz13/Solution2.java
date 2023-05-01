package Dz13;

public class Solution2 {
    public static void main(String[] args){
        Thread t1 = new Thread(new MyThread(),"t1");
        Thread t2 = new Thread(new MyThread(),"t2");
        Thread t3 = new Thread(new MyThread(),"t3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread implements Runnable{
    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            for(int i=0;i<100;i++){
                if(i%10==0){
                    System.out.println(i);
                }
            }
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
