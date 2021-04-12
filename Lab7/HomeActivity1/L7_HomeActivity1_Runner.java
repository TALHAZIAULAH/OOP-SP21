
package l7_homeactivity1_runner;


public class L7_HomeActivity1_Runner {


    public static void main(String[] args) {
        Address address = new Address("153","14","Islamabad",123);
        Person person = new Person(address);
        person.getAddress();
    }
    
}
