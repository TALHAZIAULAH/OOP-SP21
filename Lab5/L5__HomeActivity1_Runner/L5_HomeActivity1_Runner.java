
package l5_homeactivity1_runner;


public class L5_HomeActivity1_Runner {


    public static void main(String[] args) {
        Distance D1 = new Distance(10,20);

        Distance D2 = new Distance();
        D2.setFeet(5);
        D2.setInches(10);

        Distance D3;
        D3=D1.Add(D2);
        D3.Display();
    }
    
}
