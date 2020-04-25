package geometryczne;

public class Kolo extends FiguraGeometryczna {

    double promien;

    public String dajTyp(){
        return "KOŁO";
    }

    public double dajPole(){
        return promien * promien * 3.14159265359;
    }

    @Override
    public void ustawParametry(double[] parametry, String opis) {
        super.ustawParametry(parametry, opis);
        promien = parametry[0];
    }
}
