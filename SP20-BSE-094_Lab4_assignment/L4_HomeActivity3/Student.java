
package l4_homeactivity3_runner;


public class Student {
    private String name ;
    private int[] Result_array =new int [5];
    
    public Student (String name, int[] Result_array){
        this.name=name;
        Result_array = Result_array;
    }
    public double average (){
        int s=0;
        System.out.println("Average of Student "+ name);
        for (int i=0;i<5;i++){
            s=s+Result_array[i];
        }
        return(s/5);
    }
}
