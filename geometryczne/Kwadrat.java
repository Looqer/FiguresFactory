package geometryczne;

public class Kwadrat extends FiguraGeometryczna {

    double bok;

    public String dajTyp(){
        return "KWADRAT";
    }
    public double dajPole(){
        return bok * bok;
    }

    @Override
    public void ustawParametry(double[] parametry, String opis) {
        super.ustawParametry(parametry, opis);
            bok = parametry[0];
    }
}
