
package lab12_assignment_runner;


public class Lab12_Assignment_Runner {

    public static void main(String[] args) {

        HumanResource HR = new HumanResource();
        HR.add(new Teacher("Sir Usman",111));
        HR.add(new Teacher("Maam Rubina Adnan", 222));
        HR.add(new Student("Talha", 94));
        HR.add(new Student("Tahir", 72));
        HR.add(new Student("Saqib", 69));
        HR.add(new Student("Ali Uzair",80));


        HR.delete("Maam Rubina Adnan");
        HR.delete("Talha");
        HR.delete("Saqib");


        System.out.println("Record: ");
        System.out.println(HR);
    }
}
    
    

