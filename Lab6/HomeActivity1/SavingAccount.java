
package l6_homeactivity1_runner;


public class SavingAccount {
    private static double annualInterestRate;
    private double savingBalance;

    public SavingAccount(double savingBalance){
        this.savingBalance = savingBalance;
    }
    public void modifyInterestRate(double annualInterestRate_){
        annualInterestRate = annualInterestRate_;
    }

    public void calculateMonthlyInterest(){
        double total;
        total = savingBalance * (annualInterestRate/12);
        savingBalance = savingBalance + total;
    }

    public double displayBalance(){
        return savingBalance;
    }
    
}
