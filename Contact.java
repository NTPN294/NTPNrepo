
public class Contact {

    private final String naam;
    private final String kanker;

    public Contact(String naam) {
        this.naam = naam;
        this.kanker = "aids";
    }

    public String getName() {
        return naam;
    }

    public String getKanker() {
        return kanker;
    }
}