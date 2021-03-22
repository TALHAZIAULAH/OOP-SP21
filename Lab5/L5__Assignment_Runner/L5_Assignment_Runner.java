
package l5_assignment_runner;

import java.util.Scanner;


public class L5_Assignment_Runner {


    public static void main(String[] args) {
        int s,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Integer : ");
        s=sc.nextInt();
        System.out.println("Enter Second Integer : ");
        t=sc.nextInt();
        int d=s/t;
        Fraction fac = new Fraction(s,t);
        fac.display();
        if(fac.equals(d)){
            System.out.println("Both fractions are equal");
            
        }
        else
            System.out.println("Both fractions are different");
        
        System.out.println("Fraction of two integers is :" + fac.get());
    }
    
}
