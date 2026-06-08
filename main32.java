public class main32 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Main thread starts...");
        Thread oddThread = new Thread(() -> {
            for(int i = 1; i<=9; i+=2){
                System.out.println("odd" + i);
                try{Thread.sleep(300);}catch(InterruptedException e){}
            }
        });
        Thread evenThread = new Thread(()-> {
            for (int i = 2; i<=10; i+=2){
                System.out.println("even" + i);
                try{Thread.sleep(300);}catch(InterruptedException e){}
            }
        });
        oddThread.start();
        evenThread.start();

        oddThread.join();
        evenThread.join();
    }
}