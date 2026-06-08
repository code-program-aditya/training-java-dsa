public class main31 {
    public static void main(String[] args) {
        System.out.println("Main thread starts...");
        Thread t1 = new Thread(new unable());
        Thread t2 = new Thread(new unable());
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("the main thread ends...");
    }
    }

class unable implements Runnable {
    @Override
    public void run(){
        for(int i = 0; i<=3; i++){
            System.out.println("Myrunnable(runnable Interface) is running" + i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("MyRunnable interrupted");
            }
        }
    }
}