
package l7_assignment1_runner;

public class L7_Assignment1_runner {


    public static void main(String[] args) {
        Pizza p1 = new Pizza("small",2,2,2);
        Pizza p2 = new Pizza("medium",2,2,2);
        p1.getDescription();
        System.out.println("your bill : "+ p1.calcCost());
        
        PizzaOrder o = new PizzaOrder();
        o.setNumOfPizza(2);
        o.setP1(p1);
        o.setP2(p2);
        System.out.println("Ammount of order of "+o.getNumOfPizza()+" Pizza is " + o.calcTotal());
    }
    
}
