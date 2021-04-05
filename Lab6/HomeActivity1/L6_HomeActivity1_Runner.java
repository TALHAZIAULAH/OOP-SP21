
package l6_homeactivity1_runner;

public class L6_HomeActivity1_Runner {


    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);
        System.out.println("Setting annual interest rate at 3");
        saver1.modifyInterestRate(3);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Balance with monthly interest for saver1: "+saver1.displayBalance());
        System.out.println("Balance with monthly interest for saver2: "+saver2.displayBalance());

        System.out.println();
        System.out.println("Setting annual interest rate at 4");
        saver2.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Balance with monthly interest for saver1: "+saver1.displayBalance());
        System.out.println("Balance with monthly interest for saver2: "+saver2.displayBalance());

    }
        
    }
    

