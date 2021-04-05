
package l6_activity2_runner;


public class NoOfObjects {
    private static int objs=0;
    private int a;
    
    public NoOfObjects(int x){
    a=x;
    objs++;
    }
    public static int getObjsCreated (){
    return objs;
    }
}
