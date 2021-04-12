
package l7_homeactivity1_runner;


public class Person {
       private Address address;
    
    Person(Address address){
        this.address = address;
    }
    
    public void setAddress(Address a){
        this.address = address;
    }
    
    public void getAddress(){
        address.Display();
    }
    
}
