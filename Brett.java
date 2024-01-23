import java.util.ArrayList;
import java.util.List;

public class Brett {

    private final List<Rute> ruter;
    private final Rute startPosisjon;

   public Brett() {
       this.startPosisjon = new Rute(0);
       ruter = new ArrayList<>(100);
       for(int i = 0; i <= 100; i++) {
           ruter.set(i, new Rute(i));
       }

   }

}