import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;


/// Esta pendejada lee el archivo de conf.txt
// va linea por linea y agrupa los and, not, or ... para que no seab caracateres "a" , "n" ...
// las lineas vacias las retorna como Null
public class Listatk {

    String documento = System.getProperty("user.dir") + "\\src\\conf.txt";



    ArrayList<String> listaTokens = new ArrayList<String>();
    public Listatk() throws FileNotFoundException {
        File doc = new File(documento);
        Scanner obj = new Scanner(doc);
        try {
            while (obj.hasNextLine()){
                String linea = obj.nextLine();
                //System.out.println(linea);
                if (!linea.isEmpty()) {
                    listaTokens.add(linea);
                }
                else{
                    listaTokens.add("Null");
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("No se encontraron más líneas para leer.");
        }
        //System.out.println("lista = " + listaTokens);
    }

    public ArrayList<String> getListaTokens() {
        return listaTokens;
    }
}
