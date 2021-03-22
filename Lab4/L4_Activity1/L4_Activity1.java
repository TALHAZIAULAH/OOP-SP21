
package l4_activity1;


public class L4_Activity1 {


    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("circumference of Circle 1 is ");
        c1.CalculateCircumfrance( );
        int r = c1.getRadius(); 
        Circle c2 = new Circle(r);
        c2.setRadius(5);
        System.out.println("circumference of Circle 2 is ");
        c2.CalculateCircumfrance( );
        }
    }
    
