
package l3_assignment_2;
//write a class Time with three data members to store hr, min and seconds. Create two 
//constructors and apply checks to set valid time. Also create display function which displays 

import java.util.Scanner;

//all data members.

public class Time {
       Scanner scanner = new Scanner (System.in);
    public int hours;
    public int mins;
    public int secs;
    
    public Time(){
        hours=0;
        mins=0;
        secs=0;
        
    }
    public Time(int x,int y,int z){
        hours=x;
        mins=y;
        secs=z;
        
    }
    public void input ()
    {
        System.out.println("Enter Hours : ");
        hours = scanner.nextInt();
        System.out.println("Enter Minutes : ");
        mins = scanner.nextInt();
        System.out.println("Enter Seconds : ");
        secs = scanner.nextInt();
        
    }
    public void display(){
        System.out.println("Time : "+hours+" : "+mins+" : "+ secs);
        
    }
    
}
