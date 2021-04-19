
package l8_assignment1_runner;


public class L8_Assignment1_Runner {


    public static void main(String[] args) {
        
        Tape t = new Tape( "abc" ,9000 ,90);
        Book b = new Book("abc" ,9000 ,12);

        System.out.println(t.display() + b.display());
    }
    
}
