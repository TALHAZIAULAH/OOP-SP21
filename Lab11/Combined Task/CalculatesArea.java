
package calculatesarea;

import java.util.Scanner;

public class CalculatesArea {

    public static void main(String[] args) {
                Shape[] object = new Shape[5];
        object[0] = new Rectangle(10,20);
        object[1] = new Circle(5);
        object[2] = new Triangle(5,10);
        object[3] = new Rectangle(8,4);
        object[4] = new Circle(2.5);
        double[] area = Area(object);

        System.out.println();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number for which object you want area of: ");
        int selection = userInput.nextInt();
        System.out.println("Area of selected object is: "+area[selection-1]);

    }

    public static double[] Area(Object[] shape){
        double[] area = new double[shape.length];
        for(int i = 0; i< area.length;i++){
            if(shape[i] instanceof Rectangle){
                area[i] = ((Rectangle) shape[i]).area();
                System.out.println((i+1)+". Object is a Rectangle with area "+area[i]);
            } else if(shape[i] instanceof Circle){
                area[i] = ((Circle) shape[i]).area();
                System.out.println((i+1)+". Object is a Circle with area "+area[i]);
            } else {
                area[i] = ((Triangle) shape[i]).area();
                System.out.println((i+1)+". Object is a Triangle with area "+area[i]);
            }
        }
        return area;
    }
    
}
