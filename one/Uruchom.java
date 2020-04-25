package one;

import geometryczne.FiguraGeometryczna;
import geometryczne.NieznanaFiguraException;
import io.FiguryReader;
import java.net.*;
import java.io.*;

public class Uruchom {

    public static void main(String[] args) throws NieznanaFiguraException, IOException {

        boolean work = true;

        URL oracle = new URL("http://zts.p.lodz.pl/ajwzp/?227796");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));

        BufferedReader inputfileread = new BufferedReader(in);
        FiguryReader figuresset = new FiguryReader(inputfileread);
        FiguraGeometryczna figuraprezentowana;

        while (work){
            figuraprezentowana = figuresset.nastepnaFigura();
            try{System.out.println("Figura " + figuraprezentowana.dajOpis() + " typu " + figuraprezentowana.dajTyp() + " o polu " + figuraprezentowana.dajPole());}
            catch(NullPointerException err){work = false;}
        }
    }
}