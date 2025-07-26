class MultiplicationThread extends Thread{
    int m;
    public MultiplicationThread(int m,String name){
        this.m = m;
        setName(name);
    }
    public void run(){
        for(int i=0;i<= 10;i++){
           System.out.println(m*i+","+getName());
        }
    }
    public static void main(String[] args){
        MultiplicationThread t1,t2,t3;
        t1 = new MultiplicationThread(11,"pavani");
        t2 = new MultiplicationThread(13,"thanu");
        t3 = new MultiplicationThread(17,"suneetha");

        t1.start();
        t2.start();
        t3.start();
    }
}