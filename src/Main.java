import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Listatk leer = new Listatk();
        System.out.println(" lista de lineas= " + leer.getListaTokens());
        ArrayList<String> x = leer.getListaTokens();
        System.out.println("la o es: " + x.get(0));

        int longitud = x.size();
        ArrayList<ArrayList<String>> pila = new ArrayList<>();

        for (int i = 0; i < longitud; i++) {
            Analisistk uwu = new Analisistk();
            uwu.Analisistk2(x.get(i));
            pila.add(uwu.getPila());
        }
        System.out.println("pila = " + pila);


        ///////////////////////// ya tengo los tokens ahora el
        ArrayList<Boolean> pilafinal = new ArrayList<>();

        Derivacion dev = new Derivacion();
        for (int i = 0; i < pila.size(); i++) {
            boolean correcto = dev.Derivacion(pila.get(i));
            pilafinal.add(correcto);
           // token = String.valueOf(pila.get(i));
        }


    }
}