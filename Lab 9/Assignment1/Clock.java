
package l9_assignment1_runner;

public class Clock {
        private int hr,min,sec;

    public Clock(int hr, int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getHr() {
        return hr;
    }

    public void DisplayTime(){
        System.out.print(hr+":"+min+":"+sec);
    }
    
}
