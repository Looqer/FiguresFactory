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
            String testfigury = linesplitted[0];
            FiguraGeometryczna figurateraz = geometryczne.FabrykaFigurGeometrycznych.dajFigure(testfigury);
            System.out.println("Tu koniec FiguryReader");
            return figurateraz;
        }
        catch(Exception exception ){
            System.out.println("Nieznananfiguraexception");
            return null;
        }

        }
    }
