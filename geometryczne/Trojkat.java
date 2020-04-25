package geometryczne;

public class Trojkat extends FiguraGeometryczna {

    double bok_a, bok_b = 0, bok_c = 0;

    public String dajTyp(){
        return "TRÓJKĄT";
    }
    public double dajPole(){
        double pole;
        if (bok_c != 0){
            double p = 0.5 * (bok_a + bok_b + bok_c);
            pole = Math.sqrt(p * (p-bok_a) * (p-bok_b) * (p-bok_c));
        }
        else if (bok_b != 0){
            pole = bok_a * bok_b * 0.5;
        }
        else{
            pole = 0.433 * bok_a * bok_a;
        }
        return pole;
    }

    @Override
    public int[] dajIloscParametrow() {
        ileparametrow = new int[]{1,2,3};
        return ileparametrow;
    }

    @Override
    public void ustawParametry(double[] parametry, String opis) {
        super.ustawParametry(parametry, opis);
        if (parametry.length == 1){
            bok_a =  parametry[0];
        }
        else if (parametry.length == 2){
            bok_a = parametry[0];
            bok_b = parametry[1];
        }
        else if (parametry.length == 3){
            bok_a = parametry[0];
            bok_b = parametry[1];
            bok_c = parametry[2];
        }
    }
}
