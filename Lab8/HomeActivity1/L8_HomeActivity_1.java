
package l8_homeactivity_1;


public class L8_HomeActivity_1 {


    public static void main(String[] args) {
        Faculty faculty = new Faculty(1,"a","b",2,"d","e","f");
        Student student = new Student("regular","a","b","c");
        Staff staff = new Staff("a","b",1,"d","e","f");
        System.out.println("Student");
        student.display();
        System.out.println("Faculty");
        faculty.display();
        System.out.println("Staff");
        student.display();
    }
    
}
