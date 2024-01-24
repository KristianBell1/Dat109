import java.util.ArrayList;
import java.util.List;

public class Brett {

    private final List<Rute> ruter;


   public Brett() {

       ruter = new ArrayList<>(100);
       for(int i = 0; i <= 100; i++) {
           ruter.set(i, new Rute(i));
       }

   }
    public Rute getRute(int pos) {
        return ruter.get(pos);
    }

    public Rute flytt(Rute rute, int trilt){
       return new Rute(rute.getPosisjon()  + trilt);
    }


}