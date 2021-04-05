
package l6_activity3_runner;


public class ABC {
    
    public static int i ;
    public String s;

    public static void displayStatic() //Static method
    {
    System.out.println("i:"+i);
    }
    public void display() //non static method
    {
    System.out.println("i:"+i);
    System.out.println("s:"+s);

    }    
}
