package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FiguryReader {

    BufferedReader memory;

    public FiguryReader(BufferedReader input){
        memory = input;
    }

    public void nastepnaFigura() throws IOException {
        String line;
        line = memory.readLine();
        System.out.println(line);
        String[] linesplitted = line.split("\t");
        System.out.println(linesplitted[0]);
        System.out.println(linesplitted[1]);
        System.out.println(linesplitted[2]);

        //return line;
        }
    }
