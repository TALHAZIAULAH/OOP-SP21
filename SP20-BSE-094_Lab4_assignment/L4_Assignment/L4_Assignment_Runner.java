
package l4_assignment_runner;


public class L4_Assignment_Runner {


    public static void main(String[] args) {
        HotDogStand h1 = new HotDogStand(123,1);
        HotDogStand h2 = new HotDogStand(456,2);
        HotDogStand h3 = new HotDogStand(789,3);
        h1.justSold();
        h2.justSold();
        h3.justSold();
        h1.display();
    }
    
}
