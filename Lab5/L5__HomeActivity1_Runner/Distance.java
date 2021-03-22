
package l5_homeactivity1_runner;


public class Distance {
    private double feet;
    private double inches;

    public Distance(){
        feet = 0;
        inches = 0;
    }

    public Distance(double x, double y){
        feet = x;
        inches = y;
    }

    public void setFeet(double feets){
        feet = feets;
    }

    public void setInches(double inchess){
        inches = inchess;
    }

    public void Display(){
        System.out.println("Feet: "+feet);
        System.out.println("Inches: "+inches);
    }

    public Distance Add(Distance dis){
        Distance addedDistance = new Distance(feet+dis.feet,inches+dis.inches);
        return addedDistance;
    }
    
}
