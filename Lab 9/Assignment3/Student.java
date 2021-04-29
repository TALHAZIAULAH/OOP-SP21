
package l9_assignment3_runner;



abstract class Student {
     private String name,program;
    private int rollNumber;

    public Student(String name,String program, int rollNumber){
        this.name = name;
        this.program = program;
        this.rollNumber = rollNumber;
    }

    void display(){
        System.out.print("Student: "+name+", Roll Number: "+rollNumber+", Program: "+program+": ");
    }

    abstract void takeExam();
    
}
