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

        NiepoprawnyOpisFiguryException e = new NiepoprawnyOpisFiguryException("coto sie stalo");

        opisfigury = opis;
        try{
            if(IntStream.of(dajIloscParametrow()).anyMatch(a -> a == parametry.length)){
                System.out.println("super");
            }
            else{
                throw e;
            }
        }
        catch(NiepoprawnyOpisFiguryException err){
            System.out.println("niesuper");
        }
    }

}
