
package lab12_assignment_runner.association.array;


import java.util.Scanner;


public class Teacher extends Person implements Association{
        private String designation;
    private String department;

    public Teacher(String name, int IdCard){
        super(name,IdCard);
    }

    @Override
    public void associate(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Designation of "+getName()+": ");
        designation = userInput.next();
        System.out.print("Enter Department of "+getName()+": ");
        department = userInput.next();
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString() + ", Designation: " + designation + ", Department: " + department;
    }
    
}
