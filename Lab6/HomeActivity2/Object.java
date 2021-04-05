
package l6_homeactivity2_runner;


public class Object {
        public static int Objectsnum;

    public Object(){
        Objectsnum++;
    }

    public Object(int someValue){
        Objectsnum++;
    }

    public static int getObjects(){
        return Objectsnum;
    }

    public static void destroy(Object object){
        object = null;
        Objectsnum--;
    }
    
}
