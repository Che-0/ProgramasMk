import java.util.ArrayList;
import java.util.Arrays;

public class Derivacion {

    ArrayList<ArrayList<String>> tokens = new ArrayList<>();

    int posicion = 0;
    public Derivacion(ArrayList tokens) {
        this.tokens = tokens;

        // Imprime el arreglo de strings
        System.out.println("mamada");
        //System.out.println(Arrays.toString(new ArrayList[]{this.tokens}));
        System.out.println(this.tokens);
        System.out.println(this.tokens.get(1));
        //System.out.println(this.palabra[2]);
        estadoS(posicion);
        if (posicion == this.tokens.size()){
            System.out.println("cadena chida");
            return;
        }
        else{
            System.out.println("huevos");
        }
    }

    public int estadoS(int x){
        System.out.println("uwu");

         estadoE(posicion);
         return 0;
    }

    public int estadoE(int x){
        if (this.tokens.get(posicion).toString().equals("true") || this.tokens.get(posicion).equals("false")|| this.tokens.get(posicion).equals("(")|| this.tokens.get(posicion).equals(")") || this.tokens.get(posicion).equals("not")){

            estadoT(posicion);
        }
        if(this.tokens.get(posicion).equals("or")){
            posicion+=1;
            return estadoE(posicion);
        }
        return estadoS(posicion);
    }

    public int estadoT(int x) {
        if (this.tokens.get(posicion).equals("true") || this.tokens.get(posicion).equals("false") || this.tokens.get(posicion).equals(")") || this.tokens.get(posicion).equals("not")) {
            estadoF(posicion);
        }
        if(this.tokens.get(posicion).equals("and")){
            posicion+=1;
            estadoT(posicion);
        }
        return estadoE(posicion);
    }


    public int estadoF(int x){
        if (this.tokens.get(posicion).equals("true") || this.tokens.get(posicion).equals("false") || this.tokens.get(posicion).equals(")") || this.tokens.get(posicion).equals("not")) {
            posicion+=1;
            estadoF(posicion);
        }
        if (this.tokens.get(posicion).equals("(")) {
            posicion += 1;
            estadoE(posicion);
        }
        return estadoT(posicion);
    }
}
