
package l5_homeactivity2_runner;


public class L5_HomeActivity2_Runner {


    public static void main(String[] args) {
        Book Calculas = new Book();
        Calculas.setAuthorName("Talha");
        Calculas.setChapterName(new String[] {"Chap 1","Chap 2","Chap 3","Chap 4","Chap 5"});

        Book dld = new Book("Rehan",new String[] {"Chap 1","Chap 2","Chap 3","Chap 4"});

        Boolean compareName = Calculas.compareBooks(dld);
        if (compareName){
            System.out.println("Same Authors.");
        } else{
            System.out.println("Different Authors.");
        }

        Boolean compareChapter = Calculas.compareChapter(dld);
        if (compareChapter){
            System.out.println("Calculas has more chapters.");
        } else{
            System.out.println("Dld has more chapters.");
        }
    }
    }
    

