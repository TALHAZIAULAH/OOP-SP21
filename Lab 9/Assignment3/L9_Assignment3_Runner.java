
package l9_assignment3_runner;


public class L9_Assignment3_Runner {


    public static void main(String[] args) {
        
        PhdStudent studentOne = new PhdStudent("Ali","Foreign Relation",5);
        studentOne.display();
        studentOne.takeExam();

        GraduateStudent studentTwo = new GraduateStudent("Taha","Computer Science",77);
        studentTwo.display();
        studentTwo.takeExam();

    }
    
}
