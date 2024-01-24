public class Brikke {

    private final String farge;
    private Rute posisjon;

    public Brikke(String farge, Brett brett){
        this.farge = farge;

        this.posisjon = brett.getRute(0);
    }

    public Rute getRute() {
        return posisjon;
    }
}
