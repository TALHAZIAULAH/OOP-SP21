
package l4_homeactivity3_runner;

public class L4_HomeActivity3_Runner {


    public static void main(String[] args) {
        Student s = new Student ("abc", new int[] {5,15,10,20,25});
        Student s1 = new Student ("def", new int[] {1,5,9,14,19});
        System.out.println(s.average());
        System.out.println(s1.average());
        if(s.average()>s1.average())
            System.out.println("abc has greater average.");
        if(s1.average()>s.average())
            System.out.println("def has greater average.");
        
        
    }
    
}
