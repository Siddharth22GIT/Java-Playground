public class transaction {
    public static void main(String[] args) {
        Bank b = new Bank();
        Thread t1 = new Thread(){
            public void run(){
                
            }
        };

        Thread t2 = new Thread(){
            public void run(){

            }
        };
        
    }
}

class Bank{
    int amount = 1000;
    public void withdraw(int amount){
        if (this.amount < amount) {
            System.out.println("Insufficient Balance");
        } else {
            this.amount -= amount;
            System.out.println("Withdrawn " + amount + ", remaining balance " + this.amount);
        }
    }

    public void deposit(int amount){
        System.out.println("Deposit started...");
        this.amount = this.amount + amount;
        System.out.println(amount + "Deposited successfully");
        System.out.println(this.amount + " Current balance");
    }
}

