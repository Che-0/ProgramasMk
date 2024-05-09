import java.util.ArrayList;
import java.util.Arrays;

public class Derivacion {

    //boolean banderaBien;
    //ArrayList<ArrayList<String>> tokens = new ArrayList<>();
    ArrayList<String> tokens = new ArrayList<String>();
    int posicion = 0;
    boolean banderaBien;

    public Derivacion() {
    }

    public boolean Derivacion(ArrayList tokens) {


        this.tokens = tokens;

        // Imprime el arreglo de strings
        System.out.println("mamada");
        //System.out.println(Arrays.toString(new ArrayList[]{this.tokens}));
        System.out.println(this.tokens);
        System.out.println(this.tokens.get(1));

        if (this.tokens.get(1).toString().equals("(")){
            System.out.println(tokens.get(1));
            System.out.println("chdio");
        }

        int mal = estadoS(posicion);
        if (mal == 0){
            banderaBien = false;
            return banderaBien;
        }
        else{
            //banderaBien = true;
            return banderaBien;
        }

    }

    public int estadoS(int x){
        System.out.println("uwu");

         estadoE(posicion);
         return 0;
    }

    public int estadoE(int x){
        if (this.tokens.get(posicion).toString().equals("true") || this.tokens.get(posicion).toString().equals("false")|| this.tokens.get(posicion).toString().equals("(")|| this.tokens.get(posicion).toString().equals(")") || this.tokens.get(posicion).toString().equals("not")){

            return estadoT(posicion);

        }
        if(this.tokens.get(posicion).equals("or")){
            comprobar();
            posicion+=1;
            return estadoE(posicion);
        }
        return estadoS(posicion);
    }

    public int estadoT(int x) {
        if (this.tokens.get(posicion).equals("true") || this.tokens.get(posicion).equals("false") || this.tokens.get(posicion).equals(")") || this.tokens.get(posicion).equals("not")) {
            return estadoF(posicion);
            //System.out.println(posicion);
        }
        if(this.tokens.get(posicion).equals("and")){
            comprobar();
            posicion+=1;
            return estadoT(posicion);
        }
        return estadoE(posicion);
    }


    public int estadoF(int x){
        if (this.tokens.get(posicion).equals("true") || this.tokens.get(posicion).equals("false") || this.tokens.get(posicion).equals(")") || this.tokens.get(posicion).equals("not")) {
            //if (posicion <= this.tokens.size()){
                //System.out.println("cadena chida");
            //return estadoS(posicion);
            //}
            //else {
            // clase true para saber si la longitud aun no se ha pasado
            comprobar();
            posicion+=1;
            return estadoF(posicion);

            //}



        }
        if (this.tokens.get(posicion).equals("(")) {

            //posicion += 1;
            comprobar();

            posicion += 1;
            return estadoE(posicion);


            //return estadoE(posicion);


        }
        return estadoT(posicion);
    }

    public void estadoX(){

    }

    public void comprobar(){
        if (posicion >=  this.tokens.size()){
            banderaBien = false;
            return;
        }
        else {
            banderaBien = true;
        }
    }
}


//crear funcion que retorne a un estado
