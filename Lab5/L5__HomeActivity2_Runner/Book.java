
package l5_homeactivity2_runner;

public class Book {
    private String authorName;
    private String[] chapterName = new String[100];

    public Book(){
        authorName = "abc";
        chapterName = new String[]{"def"};
    }

    public Book(String name, String[] chapter){
        authorName = name;
        chapterName = chapter;
    }

    public void setAuthorName(String authorNames) {
        authorName = authorNames;
    }

    public void setChapterName(String[] chapterNames) {
        chapterName = chapterNames;
    }

    public boolean compareBooks(Book sb){
        String firstbook = authorName;
        String secondbook = sb.authorName;
        if (firstbook.equals(secondbook)){
            return true;
        } else{
            return false;
        }
    }

    public boolean compareChapter(Book chap){
        int first_Array=0, Second_Array=0;

         first_Array= chapterName.length;
         Second_Array= chap.chapterName.length;

        if (first_Array > Second_Array){
            return true;
        } else{
            return false;
        }
    }
    
}
