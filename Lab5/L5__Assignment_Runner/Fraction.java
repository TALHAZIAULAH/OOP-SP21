
package l5_assignment_runner;


public class Fraction {
    private int int1;
    private int int2;
    
    Fraction(){
        int1 = 0;
        int2 = 0;
        
    }
    
    Fraction(int a, int b){
        
        int1 = a;
        int2 = b;
        
    }
    
    public void set(int int1, int int2){
        this.int1 = int1;
        this.int2 = int2;
    }
    public double get(){
        return (double) int1/(double) int2;
    }
    public void display(){
        double ratio;
        System.out.println("Integer 1 is: "+ int1);
        System.out.println("Integer 2 is: "+ int2);
        ratio = (double) int1/(double) int2;
        System.out.println("The ratio of two integers is: "+ ratio);
    }
    
    public boolean equals(double frac){
        double f;
        f = int1/int2;
        return f == frac;
        
        
    }
    
}
