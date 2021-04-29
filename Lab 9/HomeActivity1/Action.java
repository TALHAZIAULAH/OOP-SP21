
package l9_homeactivity1_runner;


public class Action extends Movie{
        public Action(){
        super();
    }

    public Action(String MPAA, int idNum, String movieTitle){
        super(MPAA,idNum,movieTitle);
    }

    @Override
    public double calcLateFees(int numOfDays){
        return 3*numOfDays;
    }
    
}
