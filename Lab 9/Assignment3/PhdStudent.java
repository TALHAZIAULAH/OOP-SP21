
package l9_assignment3_runner;

public class PhdStudent extends Student {
    
    public PhdStudent(String name,String program, int rollNumber){
        super(name,program,rollNumber);
    }

    public void takeExam(){
        System.out.println("Give Final Defence Presentation.");
    }
    
}
