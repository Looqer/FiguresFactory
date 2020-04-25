package geometryczne;


public class Trapez extends FiguraGeometryczna {

    double podstawa_a, podstawa_b, wysokosc, ramie_a, ramie_b = 0;

    public String dajTyp(){
        return "TRAPEZ";
    }

    public double dajPole(){
        double pole;
        if (ramie_b == 0){
            pole = 0.5 * (podstawa_a + podstawa_b) * wysokosc;
        }
        else{
            pole = 0.25 * ((podstawa_b + podstawa_a)/(podstawa_b - podstawa_a)) * Math.sqrt((podstawa_b - podstawa_a)+ramie_a+ramie_b) * Math.sqrt((podstawa_b - podstawa_a)+ramie_a-ramie_b) * Math.sqrt((podstawa_b - podstawa_a)-ramie_a+ramie_b) * Math.sqrt(-(podstawa_b - podstawa_a)+ramie_a+ramie_b);
        }
        return pole;
    }

    @Override
    public int[] dajIloscParametrow() {
        ileparametrow = new int[]{3,4};
        return ileparametrow;
    }

    @Override
    public void ustawParametry(double[] parametry, String opis) {
        super.ustawParametry(parametry, opis);
        if (parametry.length == 3){
            podstawa_a = parametry[0];
            podstawa_b = parametry[1];
            wysokosc = parametry[2];
        }
        else if (parametry.length == 4){
            podstawa_a = parametry[0];
            podstawa_b = parametry[1];
            ramie_a = parametry[2];
            ramie_b = parametry[3];
        }
    }
}
