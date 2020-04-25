package geometryczne;

import java.util.Arrays;
import java.util.stream.IntStream;

public abstract class FiguraGeometryczna {

    String opisfigury;
    int[] ileparametrow;

    public abstract String dajTyp();

    public abstract double dajPole();

    public String dajOpis() {
        return opisfigury;
    }

    public int[] dajIloscParametrow() {
        ileparametrow = new int[]{1};
        return ileparametrow;
    }

    public void ustawParametry (double[] parametry, String opis) throws NiepoprawnyOpisFiguryException {

        NiepoprawnyOpisFiguryException e = new NiepoprawnyOpisFiguryException(String.format("Powinno byc %s parametrow, a jest %d.", Arrays.toString(dajIloscParametrow()), parametry.length));

        opisfigury = opis;
            if(!IntStream.of(dajIloscParametrow()).anyMatch(a -> a == parametry.length)){
                throw e;
            }
    }
}
