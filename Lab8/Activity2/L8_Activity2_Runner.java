
package l8_activity2_runner;


public class L8_Activity2_Runner {


    public static void main(String[] args) {
        Regular regularObj = new Regular("Ahmed","090078601","Islamabad",15000,60000);
        regularObj.Display();
        Adhoc adhocObj = new Adhoc("Ali","03333333333","Rawalpindi",500,23,1500);
        adhocObj.Display();
    }
    
}
