public class main {

    public static void main(String[] args) {

        //Creating BanK Account object
        BankAccount bc = new BankAccount("Maria" , 1000);

        bc.Withdraw(100);
        bc.Deposit(500);
        bc.Withdraw(10);

        System.out.println(bc.getBalance());


    }


}
