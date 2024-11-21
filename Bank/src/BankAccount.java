public class BankAccount {

    //Encapsulation -- Propierties
    private String Owner;
    private double Balance;

    //Constructor
    public BankAccount(String owner, double balance) {
        Owner = owner;
        Balance = balance;
    }

    //Getter and Setter

    //Getter
    public String getOwner() {
        return Owner;
    }


    public double getBalance() {
        return Balance;
    }

    //Setter
    public void setOwner(String owner) {
        Owner = owner;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }


    //Alternativ und much better we can set public double and return it
    public void Withdraw(double Withdraw){

        setBalance(this.Balance - Withdraw);

    }

    public  void  Deposit(double deposit){

        setBalance(this.Balance + deposit);


    }

}
