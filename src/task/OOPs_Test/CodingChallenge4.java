package task.OOPs_Test;

public class CodingChallenge4 {
    public static void main(String[] args){
        BankAccount bc = new BankAccount(1000);

        bc.deposit(500);
        System.out.println("Balance after deposit: " + bc.getBalance());

        bc.withdraw(200);
        System.out.println("Balance after withdrawal: " + bc.getBalance());

    }
}

class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        if(initialBalance<0){
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance=0;
        }else{
            this.balance=initialBalance;
        }
    }

    public void deposit(double depositAmount){
        if(depositAmount>0){
            balance += depositAmount;
        }else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double withdrawalAmount){
        if(withdrawalAmount>0 && withdrawalAmount<=balance){
            balance -= withdrawalAmount;
        }else{
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance(){
        return balance;
    }

}