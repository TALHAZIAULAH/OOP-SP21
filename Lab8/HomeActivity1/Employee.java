
package l8_homeactivity_1;

import java.util.Date;


public class Employee extends Person {
    protected String office;
    protected int salary;
    protected Date date;


    public Employee(String office, int salary, String name, String address, String email) {
        super(name, address, email);
        this.office = office;
        this.salary = salary;
        this.date = new Date();
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOffice() {
        return office;
    }

    public int getSalary() {
        return salary;
    }

    public Date getDate() {
        return date;
    }
    
    public void display(){
        super.display();
        System.out.println("Office: " + office + " Salary" + salary + " Date: " + date);
    }

    
    
}
