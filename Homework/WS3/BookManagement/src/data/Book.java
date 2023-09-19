
package data;


public class Book {
    private String name;
    private String language;
    private int paperback;

    public Book(String name, String language, int paperback) {
        this.name = name;
        this.language = language;
        this.paperback = paperback;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", language=" + language + ", paperback=" + paperback + '}';
    }
    
    public void showBook() {
        System.out.printf("|%-25s|%-10s|%4d|\n",
                                    name, language, paperback);
    }
    
    
}
