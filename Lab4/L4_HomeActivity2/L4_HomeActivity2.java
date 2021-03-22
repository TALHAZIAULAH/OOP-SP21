
package l4_homeactivity2;


public class L4_HomeActivity2 {


    public static void main(String[] args) {
        Account a =new Account (10000);
        Account b =new Account (10000);
        
        System.out.println(a.display());
        System.out.println(b.display());
        
        a.deposit(1000);
        b.withdraw(500);
        
        System.out.println("New Amount : "+ a.display());
        System.out.println("New Baance : "+ b.display());
    }
    
}
