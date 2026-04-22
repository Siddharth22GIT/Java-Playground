
class Counter{
    int count;
    public synchronized void increment() {
        count = count + 1;
    }
    public void getCount(){
        System.out.println(count);
    }
}

class Sync{
    public static void main(String[] args) throws Exception{

        Counter c = new Counter();
        Thread o1 = new Thread(){
            public void run(){
                for(int i = 1; i<3000; i++){
                    c.increment();
                }
            }
        };

        Thread o2 = new Thread(){
            public void run(){
                for(int i = 1; i<3000; i++){
                    c.increment();
                }
            }
        };

        o1.run();
        o2.run();
        c.getCount();
    }
}