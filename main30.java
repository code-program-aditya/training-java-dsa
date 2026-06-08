public class main30 {
    public static void main(String[] args) {
        System.out.println("Main thread starts...");
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();
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
// 1. extending from thread class
class Mythread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<=3; i++){
            System.out.println("Mythread(thread class)i is running" +i);
            try{
                Thread.sleep(6);
            }
            catch(InterruptedException e){
                System.out.println("thread interrupted");
            }
        }
    }
}