
package l3_homeactivity2;


public class L3_HomeActivity2 {


    public static void main(String[] args) {
        Account a =new Account();
        a.deposit(100);
        System.out.println(a.getBal());
        a.deposit(10);
        System.out.println(a.getBal());
        a.WDraw(20);
        System.out.println(a.getBal());
        
                
    }
    
}
