
package l3_homeactivity1;

public class Circle {
    public double radius;
    public double diameter;
    
    public Circle(){
     int radius =5;
     int diameter=5;
     
    }   
    public Circle(double a,double b){
        radius=a;
        diameter=b;
        
    }
   
    public void display(double a,double b)
    {
        System.out.print("AREA IS : "+ 3.14*a*a);
        System.out.print("Circumfrance IS : "+ 2*3.14*a);
        
    }
}
