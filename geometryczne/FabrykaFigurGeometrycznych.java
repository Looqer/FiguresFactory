package geometryczne;

import java.io.IOException;
import java.util.Arrays;

public class FabrykaFigurGeometrycznych {


    public static FiguraGeometryczna dajFigure(String jakatofigura) throws NieznanaFiguraException {
        try{


        FiguraGeometryczna figura = null;

        System.out.println("To będzie: " + jakatofigura);
            System.out.println("To będzie: " + jakatofigura);
            byte[] ba = jakatofigura.getBytes();
            System.out.println("To będzie w bytach : " + Arrays.toString(ba));
            System.out.println("To będzie: " + "TRÓJKĄT");
            byte[] bb = "TRÓJKĄT".getBytes();
            System.out.println("To będzie w bytach : " + Arrays.toString(bb));

        if (jakatofigura.contentEquals("TRÓJKĄT")){
            figura = new Trojkat();
            System.out.println("Dany figura trojkat");
        }

        else if(jakatofigura.equals("KWADRAT")){
            figura = new Kwadrat();
            System.out.println("Dany figura kwadrat");
        }

        else if(jakatofigura.equals("KOŁO")){
            figura = new Kolo();
            System.out.println("Dany figura koło");
        }

        if(figura == null){
            System.out.println("nie działa bo figura to null");
        }
        return figura;
    }

    catch(Exception exception ){
        System.out.println("Nieznananfiguraexception");
        return null;
    }
}
}
