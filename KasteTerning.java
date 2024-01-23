import java.util.Random;

public class KasteTerning {

    Random tilfeldig = new Random();
    private int sum;
    public int sum() {
        sum = tilfeldig.nextInt(6)+ 1;

        return sum;
    }
}
