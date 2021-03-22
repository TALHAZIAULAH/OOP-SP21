
package l5_activity1_runner;


public class L5_Activity1_Runner {


    public static void main(String[] args) {        
        

        {
        ObjectPass p = new ObjectPass();
        p.value = 5;
        System.out.println("Before calling: " + p.value);
        ObjectPass.increment(p);
        System.out.println("After calling: " + p.value);
}

    }
    
}
