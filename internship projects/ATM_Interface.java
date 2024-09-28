import java.util.Scanner;

class ATM {

    float Balance;
    int PIN = 2345;

    public void checkpin() {
        System.out.println("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter valid pin number ");

        }
    }

    public void menu() {
        System.out.println("Enter your choice ");
        System.out.println("1. CheckA/C Balance ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money ");
        System.out.println("4. Exit ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter valid choice ");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        if (Amount > Balance) {
            System.out.println("Insufficient Balance ");
        } else {
            Balance = Balance - Amount;
            System.out.println("Money Withdrawl Successful");

        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter Amount");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        Balance = Balance + Amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }

}

public class ATM_Interface {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}