package one;

import geometryczne.FiguraGeometryczna;
import geometryczne.NieznanaFiguraException;
import io.FiguryReader;

import java.io.*;

public class Uruchom {

    public static void main(String[] args) throws NieznanaFiguraException, FileNotFoundException {

        BufferedReader inputfileread = new BufferedReader(new FileReader("figures.txt"));
        FiguryReader figuresset = new FiguryReader(inputfileread);
        FiguraGeometryczna figuraprezentowana = figuresset.nastepnaFigura();
        System.out.println("koniec uruchoma 1: " + figuraprezentowana.dajTyp());
        //figuraprezentowana = figuresset.nastepnaFigura();
        //System.out.println("koniec uruchoma 2: " + figuraprezentowana.dajTyp());
        //System.out.println("koniec uruchoma 3: " + figuresset.nastepnaFigura());

    }

}