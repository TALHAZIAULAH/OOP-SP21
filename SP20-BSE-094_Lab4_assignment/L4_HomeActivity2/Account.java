
package l4_homeactivity2;


public class Account {
    private int bal;
    
    public Account(){
        bal=0;
        
    }
    public Account(int b){
        bal=b;
        
    }
    public void withdraw (int wdamount){
        bal=bal-wdamount;
    }
    public void deposit (int dpamount){
        bal=bal+dpamount;
    }
    public int display (){
        return bal;
    }
    
}
