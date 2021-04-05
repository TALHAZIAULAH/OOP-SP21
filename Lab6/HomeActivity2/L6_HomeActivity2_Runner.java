
package l6_homeactivity2_runner;


public class L6_HomeActivity2_Runner {

    public static void main(String[] args) {
        Object object1 = new Object(1);
        Object object2 = new Object(2);
        Object object3 = new Object();
        Object object4 = new Object(4);

        System.out.println("Initial Objects: "+Object.Objectsnum);
        Object.destroy(object1);
        Object.destroy(object3);

        System.out.println("Final Objects: "+Object.Objectsnum);
    }
    
}
