class MyThreadDemo extends Thread{
    public void run(){
        try{
            sleep(10000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Hello child thread is running...");
    }
    public static void main(String[] args){
        MyThreadDemo t = new MyThreadDemo();
        t.start();
        try{
            t.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Hello Main parent thread...");
        System.out.println("Bye Parent");

    }
}