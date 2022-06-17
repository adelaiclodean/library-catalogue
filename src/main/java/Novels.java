public class Novels {
    private String name;
    private final int numberOfpages;
    private final String type;

    public Novels(String name, int numberOfpages, String type) {
        this.name = name;
        this.numberOfpages = numberOfpages;
        this.type = type;
            }

    public int getNumberOfpages() {
        return numberOfpages;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getNovels() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void AdddBooks(String name) {
        this.name = getName();
    }
}
