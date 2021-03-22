
package l4_assignment_runner;


public class HotDogStand {
    private int Id_num;
    public int sold_items;
    
    public HotDogStand(){
        Id_num=0;
        sold_items=0;
    }
    
    public HotDogStand(int Id_num,int sold_items){
        this.Id_num=Id_num;
        this.sold_items=sold_items;
    }
    public void justSold(){
        sold_items=sold_items+1;
        
    }
    public int display(){
        System.out.println("The total HotDog stand sold are : ");
        return sold_items;
    }
    
}
