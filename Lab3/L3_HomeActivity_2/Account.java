
package l3_homeactivity2;

public class Account {
    public double balance;
    
    public Account(){
        balance=0;
        
    }
    public Account(int x ,int y){
        balance =x;
        
    }
    public void deposit (double DA){
        if (DA>0)
        balance = balance +DA;
    }
     public void WDraw (double WD){
        if (WD>0)
        balance = balance -WD;
    }
    public double getBal()
    {
        return balance;
    }
    }
    
    

