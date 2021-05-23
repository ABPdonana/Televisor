
import java.util.ArrayList;
import java.util.List;

public class Soporte {

    String[] nombre;

    public Soporte(String[] nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] playlist(){
        return this.nombre;
    }

    public String reproducir(int indice){
        String aux = null;
        try{
            aux = this.playlist()[indice];
        } catch (Exception e){
            System.out.println("Index Error");
        }
        return aux;
    }

}
