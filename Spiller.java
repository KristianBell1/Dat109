public class Spiller {

    private final String navn;
    private final Brikke brikke;

    private final Brett brett;

    public Spiller(String spillerNavn, Brikke brikke, Brett brett) {
        this.navn = spillerNavn;
        this.brikke = brikke;
        this.brett = brett;
    }

    public String getNavn() {
        return navn;
    }
    public Brikke getBrikke() {
        return brikke;
    }

    public void spillTrekk(KasteTerning terning) {
        int trilt = terning.sum();
        Rute rute = brikke.getRute();
        rute = brett.flytt(rute, trilt);
    }
}
