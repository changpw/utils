public class MyThread implements Runnable{
    private static int count=5;
    @Override
    public void run() {
        System.out.print(count--+"\t");
    }
}
