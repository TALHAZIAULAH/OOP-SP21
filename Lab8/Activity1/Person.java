
package l8_activity1_runner;


public class Person {
      protected String name ;
    protected String id ;
    protected int phone ;
    
    public Person() {
        name = "NaginaNazar" ;
        id = "sp14bcs039" ;
        phone = 12345 ;
    }

    public Person(String a , String b , int c) {
        name = a ;
        id = b ;
        phone = c ;
    }

    public void setName(String a){
        name = a ;
    }

    public void setId(String j){
        id = j ;
    }

    public void setPhone(int a) {
        phone = a ;
    }

    public String getName() {
        return name ;
    }

    public String getid() {
        return id ;
    }

    public int getPhone() {
        return phone ;
    }

    public void display( ) {
        System.out.println("Name : " + name + " ID : " + id + " Phone : " + phone ) ;
    }
    
}
