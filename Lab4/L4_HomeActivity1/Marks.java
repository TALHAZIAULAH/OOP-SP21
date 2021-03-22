
package l4_homeactivity_1;


public class Marks {
    private int Marks1,Marks2,Marks3;
        public Marks()
        {
        Marks1 = 0; Marks2 = 0; Marks3=0;
        }
        public Marks(int M1, int M2, int M3)
        {
        Marks1= M1;
        Marks2= M2;
        Marks3= M3;
        } 
        public void setM1(int M1) 
        {
        Marks1 = M1;
        } 
        public void setM2(int M2) 
        {
        Marks2 = M2; 
        } 
        public void setM3(int M3) 
        {
        Marks3 = M3; 
        } 
        public void getM1() 
        {
        int Marks1;
        } 
        public void getM2() 
        {
        int Marks2;
        } 
        public void getM3() 
        {
        int Marks3;
        } 
        public int sum () 
        {
        return (Marks1+Marks2+Marks3);
        } 
    
}
