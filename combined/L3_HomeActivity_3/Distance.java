
package l3_homeactivity3;


public class Distance {
    public int feets;
    public int inches;
    
    public Distance(){
    feets=5;
    inches=10;
    
}
    public Distance (int x,int y){
        feets=x;
        inches=y;
        
    }
    public void Display(){
        System.out.print("Feets Are : "+feets);
        System.out.print("inches Are : "+inches);
    }
    
}
