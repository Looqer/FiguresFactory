package io;

import geometryczne.FiguraGeometryczna;
import geometryczne.NiepoprawnyOpisFiguryException;
import geometryczne.NieznanaFiguraException;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class FiguryReader {

    BufferedReader memory;

    public FiguryReader(BufferedReader input){
        memory = input;
    }

    public FiguraGeometryczna nastepnaFigura() throws NieznanaFiguraException,  IOException {

            String line;
            String[] linesplitted = new String[0];
            line = memory.readLine();
            System.out.println(line);
            try{linesplitted = line.split("\t");}
            catch(NullPointerException err){System.out.println("Koniec pliku");}

            FiguraGeometryczna figurateraz = geometryczne.FabrykaFigurGeometrycznych.dajFigure(linesplitted[0]);

            double[] jakisarrayd = Arrays.stream(linesplitted[2].split(" ")).mapToDouble(Double::parseDouble).toArray();

            try{figurateraz.ustawParametry(jakisarrayd,linesplitted[1]);}
            catch(NullPointerException err){}

            return figurateraz;
        }
    }
