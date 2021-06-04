
package lab12_assignment_runner.association.array;


public class Lab12_Assignment_RunnerAssociationArray {

    public static void main(String[] args) {
         HumanResource HR = new HumanResource();
         
        HR.addEntity("Sir Usman", 111, "Teacher");
        HR.addEntity("Maam Rubina Adnan", 222, "Teacher");

        HR.addEntity("Talha", 94, "Student");
        HR.addEntity("Tahir", 72, "Student");
        HR.addEntity("Saqib", 69, "Student");
        HR.addEntity("Ali Uzair",80, "Student");

        HR.delete("Maam Rubina Adnan");
        HR.delete("Talha");
        HR.delete("Saqib");


        System.out.println("Record: ");
        System.out.println(HR);
         
    }
    
}
