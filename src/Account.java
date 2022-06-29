public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){

        return this.id;
    }
    public String getName(){

        return this.name;
    }
    public double getBalance(){

        return this.balance;
    }
    public void credit(double amount){

        this.balance += amount;
    }
    public boolean debit(double amount){

        if (this.balance - amount <= 0){
            System.out.println("Amount exceeded");
            return false;
        }
        else
        {
            this.balance -= amount;
            return true;
        }
        // returns false if no balance, "amount exceeded"
    }
    public void transferTo(Account another, double amount){
        boolean fundsAvailable = debit(amount);
        if (fundsAvailable) {
            // this.balance is already subtracted in debit()
            another.balance += amount;
            System.out.println("Transfer completed.");
        }
    }
    public String accountDetails(){
        return String.format("%s, the current balance in your account %s is $%f", this.name, this.id, this.balance);
    }
}
