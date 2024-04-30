package interfaceinabox;

public class Book implements Packable {
    private String author;
    private String name;
    private double weight;

    public  Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    public String toString() {
        return author + ": " + name;
    }

}
