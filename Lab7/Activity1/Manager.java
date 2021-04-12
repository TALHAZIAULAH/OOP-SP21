
package l7_activity1_runner;


public class Manager {
    private String title;
    private double dues;
    private employeeRecord emp;
    private studentRecord stu;
    
    public Manager(String t,double d,employeeRecord e,studentRecord s){
        title = t;
        dues = d;
        emp = e;
        stu = s; 
    }

    Manager(String finance_Manager, int i, employeeRecord e, studentRecord s) {
        title = finance_Manager;
        dues = i;
        emp = e;
        stu = s;
    }
    
    public void display(){
        System.out.println("Title is : " + title);
        System.out.println("Dues are : " + dues);
        System.out.println("Emplyoyee record is as under:" );
        System.out.println("EmployeeId is : " + emp.getEmp_id());
        System.out.println("EmployeeId is : " + emp.getSalary());
        System.out.println("Student record is as under:" );
        System.out.println("Degree is : " + stu.getDegree());
    }
    
}
