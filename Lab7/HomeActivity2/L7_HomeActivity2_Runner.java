
package l7_homeactivity2_runner;


public class L7_HomeActivity2_Runner {

    public static void main(String[] args) {
        Book b = new Book("Math","Star Book Organization ",153,1133,"Islamabad","44000");
        b.display();

        b.setStreetNumber(152);
        b.setHouseNumber(1144);
        b.setCity("Lahore");
        b.setCode("55000");

        System.out.println("MODIFIED ADDRESS.");
        b.display();
    }
    
}
