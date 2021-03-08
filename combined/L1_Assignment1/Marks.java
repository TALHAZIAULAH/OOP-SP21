
package l3_assignment1;
import java.util.Scanner;


public class Marks {
    Scanner scanner = new Scanner (System.in);
    public int marks1;
    public int marks2;
    public int marks3;
    
    public Marks(){
        marks1=0;
        marks2=0;
        marks3=0;
        
    }
    public Marks(int x,int y,int z){
        marks1=x;
        marks2=y;
        marks3=z;
        
    }
    public void input ()
    {
        System.out.println("Enter M1 : ");
        marks1 = scanner.nextInt();
        System.out.println("Enter M2 : ");
        marks2 = scanner.nextInt();
        System.out.println("Enter M3 : ");
        marks3 = scanner.nextInt();
        
    }
    public void display(){
        int sum= marks1+marks2+marks3;
        System.out.println("Sum of marks are : "+sum);
        
    }
            
    
}
