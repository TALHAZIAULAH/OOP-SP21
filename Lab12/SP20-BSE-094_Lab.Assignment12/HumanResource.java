
package lab12_assignment_runner;
import java.util.ArrayList;

public class HumanResource {
    
    private ArrayList<Association> resources;

    public HumanResource(){
        resources = new ArrayList<Association>();
    }

    public void add(Association resources){
        this.resources.add(resources);
        resources.associate();
    }

    public boolean delete(String name){
        boolean deleteStatus = false;
        for(int i = 0;i<resources.size();i++){
            if(name.equals(resources.get(i).getName())){
                resources.remove(i);
                deleteStatus = true;
                break;
            }
        }
        return deleteStatus;
    }

    public String toString(){
        if(resources.isEmpty()){
            return "Record Empty!";
        } else{
            String s="";
            for(int i=0;i<resources.size();i++){
                s = s+resources.get(i)+"\n";
            }
            return s;
        }
    }
    
}
