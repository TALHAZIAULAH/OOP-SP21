
package l9_homeactivity1_runner;


public class Comedy extends Movie {
        public Comedy(){
        super();
    }

    public Comedy(String MPAA, int idNum, String movieTitle){
        super(MPAA,idNum,movieTitle);
    }

    @Override
    public double calcLateFees(int numOfDays){
        return 2.5*numOfDays;
    }
    
}
