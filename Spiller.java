public class Spiller {

    private final String navn;
    private final Brikke brikke;

    public Spiller(String spillerNavn, Brikke brikke) {
        this.navn = spillerNavn;
        this.brikke = brikke;
    }

    public String getNavn() {
        return navn;
    }
    public Brikke getBrikke() {
        return brikke;
    }
}
