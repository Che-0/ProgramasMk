import java.io.File;

public class Directorios {
    String nombre;
    public Directorios() {
        nombre = (System.getProperty("user.dir") + "\\src");
    }

    public String[] lista(){
        File f = new File(nombre);
        return f.list();
    }

    public String getNombre() {
        return nombre;
    }
}

