package io;

import geometryczne.FiguraGeometryczna;
import geometryczne.NieznanaFiguraException;

import java.io.BufferedReader;

public class FiguryReader {

    BufferedReader memory;

    public FiguryReader(BufferedReader input){
        memory = input;
    }

    public FiguraGeometryczna nastepnaFigura() throws NieznanaFiguraException {
        try{
            String line;
            line = memory.readLine();
            System.out.println(line);
            String[] linesplitted = line.split("\t");
            System.out.println("FiguryReader działa");
            FiguraGeometryczna figurateraz = geometryczne.FabrykaFigurGeometrycznych.dajFigure(linesplitted[0]);
            System.out.println("Tu koniec FiguryReader");
            return figurateraz;
        }
        catch(Exception exception ){
            System.out.println("Nieznananfiguraexception");
            return null;
        }

        }
    }
