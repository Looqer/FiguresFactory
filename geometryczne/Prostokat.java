package geometryczne;

public class Prostokat extends FiguraGeometryczna {

    double bok_a, bok_b;

    public String dajTyp(){
        return "PROSTOKĄT";
    }

    public double dajPole(){
        return bok_a * bok_b;
    }

    @Override
    public int[] dajIloscParametrow() {
        ileparametrow = new int[]{1,2};
        return ileparametrow;
    }

    @Override
    public void ustawParametry(double[] parametry, String opis) {
        super.ustawParametry(parametry, opis);
        if (parametry.length == 1){
            bok_a = bok_b = parametry[0];
        }
        else if (parametry.length == 2){
            bok_a = parametry[0];
            bok_b = parametry[1];
        }
    }
}
