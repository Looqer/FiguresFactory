package io;

import geometryczne.FiguraGeometryczna;
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
            try{linesplitted = line.split("\t");}
            catch(NullPointerException err){System.out.println("Koniec pliku");}

            FiguraGeometryczna figurateraz = geometryczne.FabrykaFigurGeometrycznych.dajFigure(linesplitted[0]);

            double[] arrayd = Arrays.stream(linesplitted[2].split(",")).mapToDouble(Double::parseDouble).toArray();

            figurateraz.ustawParametry(arrayd,linesplitted[1]);

            return figurateraz;
        }
    }
