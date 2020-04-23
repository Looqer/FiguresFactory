package one;

import io.FiguryReader;

import java.io.*;

public class Uruchom {

    public static void main(String[] args) throws IOException {

        BufferedReader inputfileread = new BufferedReader(new FileReader("figures.txt"));
        FiguryReader figuresset = new FiguryReader(inputfileread);
        figuresset.nastepnaFigura();
    }

}