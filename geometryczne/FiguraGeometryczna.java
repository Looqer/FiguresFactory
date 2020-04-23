package geometryczne;

public abstract class FiguraGeometryczna {

    abstract String dajTyp();

    abstract double dajPole();

    public int[] dajIloscParametrow() {
        return new int[]{1};
    }

    //public void ustawParametry(double[], String){

    //}
}
