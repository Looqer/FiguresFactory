package geometryczne;

public abstract class FiguraGeometryczna {

    String opisfigury;

    public abstract String dajTyp();

    public abstract double dajPole();

    public String dajOpis() {
        return opisfigury;
    }

    public int[] dajIloscParametrow() {
        return new int[]{1};
    }

    public void ustawParametry (double[] parametry, String opis) throws NiepoprawnyOpisFiguryException {
        opisfigury = opis;
        System.out.println(parametry.length);
    }

}
