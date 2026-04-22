class threading{
    public static void main(String[] args) throws InterruptedException{
        // Hi o1 = new Hi();
        // Hello o2 = new Hello();

        // o1.start();
        // try{Thread.sleep(500);}catch(Exception e){}
        // o2.start();
 

        // Hi o1 = new Hi();
        // Hello o2 = new Hello();
        // Thread x = new Thread(o1);
        // Thread y = new Thread(o2);
        // x.start();
        // try{Thread.sleep(500);}catch(Exception e){}
        // y.start();


        // Runnable o1 = new Runnable(){
        //     public void run(){
        //         for(int i = 1; i<6; i++){
        //             System.out.println("HI");
        //             try{Thread.sleep(500);}catch(Exception e){}
        //         }
        //     }
        // };

        // Runnable o2 = new Runnable() {
        //     public void run(){
        //         for(int i = 1; i<6; i++){
        //             System.out.println("HELLO");
        //             try{Thread.sleep(500);}catch(Exception e){}
        //         }
        //     }
        // };

        // o1.run();
        // o2.run();


        Thread o1 = new Thread(){
            public void run(){
                for(int i = 1; i<6; i++){
                    System.out.println("HI");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            }
        };
        Thread o2 = new Thread(){
          public void run(){
                for(int i = 1; i<6; i++){
                    System.out.println("HELLO");
                    try{Thread.sleep(1000);}catch(Exception e){}
                }
            }  
        };
        o1.start();
        try{Thread.sleep(500);}catch(Exception e){}
        o2.start();
        o1.join();
        o2.join();

        System.out.println(o1.isAlive());
        System.out.println(o2.isAlive());
        System.out.println(o1.getName());
        System.out.println(o2.getName());
        o1.setName("Hi method");
        o2.setName("Hello method");
        System.out.println(o1.getName());
        System.out.println(o2.getName());
        System.out.println("Good morning...");
        System.out.println("Good night...");

    }
}

// class Hi extends Thread{
//     public void run(){
//         for(int i = 1; i<6; i++){
//             System.out.println("h1");
//             try{Thread.sleep(1000);}catch(Exception e){}
//         }
//     }
// }

// class Hello extends Thread{
//     public void run(){
//         for(int i =1 ; i<6; i++){
//             System.out.println("Hello");
//             try{Thread.sleep(1000);}catch(Exception e){}
//         }
//     }
// }

// class Hi implements Runnable{
//     public void run(){
//         for(int i = 1; i<6; i++){
//             System.out.println("Hi");
//             try{Thread.sleep(1000);}catch(Exception e){}
//         }
//     }
// }

// class Hello implements Runnable{
//     public void run(){
//         for(int i = 1 ;i<6; i++){
//             System.out.println("Hello");
//              try{Thread.sleep(1000);}catch(Exception e){}
//         }
//     }
// }
