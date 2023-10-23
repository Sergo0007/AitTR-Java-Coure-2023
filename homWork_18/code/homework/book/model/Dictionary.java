package homework.book.model;

public class Dictionary extends Book {
    private String language;
    private String specialisation;

    public Dictionary(String title, String author, int yearsPublished, String isbn, String language, String specialisation) {
        super(title, author, yearsPublished, isbn);
        this.language = language;
        this.specialisation = specialisation;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }


    public void display() {
        super.display();
        System.out.println("Dictionary: " +
                "Language: " + language + ", Specialisation: "
                + specialisation);
    }

}
