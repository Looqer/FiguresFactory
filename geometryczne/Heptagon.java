package geometryczne;

public class Heptagon extends FiguraGeometryczna {

    double bok;

    public String dajTyp(){
        return "HEPTAGON";
    }

    public double dajPole(){
        return (bok * bok * 3.63391);
    }

    @Override
    public void ustawParametry(double[] parametry, String opis) {
        super.ustawParametry(parametry, opis);
        bok = parametry[0];
    }
}
