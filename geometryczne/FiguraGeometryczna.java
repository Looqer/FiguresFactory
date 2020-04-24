package geometryczne;

public abstract class FiguraGeometryczna {

    public abstract String dajTyp();

    public abstract double dajPole();

    public int[] dajIloscParametrow() {
        return new int[]{1};
    }

    public void ustawParametry (double[] parametry, String opis) throws NiepoprawnyOpisFiguryException {
        String memopis = opis;
        System.out.println(parametry.length);
    }

    //public void ustawParametry(double[], String){

    //}
}
