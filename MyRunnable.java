class MyRunnable implements Runnable{
    public void run(){
        for(int i =0;i<=5;i++){
            System.out.println("Runnable Thread: " + i);
            try{
                Thread.sleep(400);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args){
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r); 
        t.start();
    }

}