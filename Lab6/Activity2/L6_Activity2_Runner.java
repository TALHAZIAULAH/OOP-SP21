
package l6_activity2_runner;

public class L6_Activity2_Runner {


    public static void main(String[] args) {
        
    NoOfObjects o1=new NoOfObjects(10);
    NoOfObjects o2=new NoOfObjects(122);
    NoOfObjects o3=new NoOfObjects(150);
    System.out.println("Objects created:"+ NoOfObjects.getObjsCreated());
    System.out.println("Objects created:"+ o1.getObjsCreated());

    }
    
}
