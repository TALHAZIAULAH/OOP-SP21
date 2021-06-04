
package lab12_assignment_runner;

public class Person {
        private String name;
    private int IdCard;

    public Person(String name, int IdCard){
        this.name = name;
        this.IdCard = IdCard;
    }

    public String getName() {
        return name;
    }

    public int getIdCard() {
        return IdCard;
    }

    @Override
    public String toString() {
        return "Name: "+name+", IdCard Number: "+IdCard;
    }
    
}
