package geometryczne;

import java.io.IOException;
import java.util.Arrays;
import geometryczne.NieznanaFiguraException;

public class FabrykaFigurGeometrycznych {


    public static FiguraGeometryczna dajFigure(String jakatofigura) throws NieznanaFiguraException {


        FiguraGeometryczna figura = null;
        NieznanaFiguraException e = new NieznanaFiguraException("coto sie stalo");
try{


        switch (jakatofigura) {
            case "TRÓJKĄT":
                figura = new Trojkat();
                break;
            case "KWADRAT":
                figura = new Kwadrat();
                break;
            case "KOŁO":
                figura = new Kolo();
                break;
            case "HEPTAGON":
                figura = new Heptagon();
                break;
            case "TRAPEZ":
                figura = new Trapez();
                break;
            case "PROSTOKĄT":
                figura = new Prostokat();
                break;
            default:
                throw e;
        }

   
        }
catch(NieznanaFiguraException err){
    System.out.println("Figura nierozpoznana");
    figura = null;
        }
        return figura;
}
}
