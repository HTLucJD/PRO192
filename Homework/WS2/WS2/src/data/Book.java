
package data;


public class Book {
    
    public String publisher;
    private String language;
    private int paperback;

    public Book(String publisher, String language, int paperback) {
        this.publisher = publisher;
        this.language = language;
        this.paperback = paperback;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPaperback() {
        return paperback;
    }

    public void setPaperback(int paperback) {
        this.paperback = paperback;
    }

    
    
    public void print() {
        System.out.println("Publisher ‏ : ‎ " + publisher);
        System.out.println("Language ‏ : ‎ " + language);
        System.out.println("Paperback ‏ : ‎ " + paperback);
    }
    
}
