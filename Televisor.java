import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Televisor{

    boolean encendido = false;
    int canal = 1;
    int volumen = 0;
    boolean puertoUsb = false;
    Soporte soporteUsb;

    public Televisor() {
        //constructor
    }

    public boolean getEncendido() {
        return this.encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getCanal() {
        return this.canal;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public boolean getPuertoUsb(){
        return this.puertoUsb;
    }

    public void setPuertoUsb(boolean puertoUsb){
        this.puertoUsb = puertoUsb;
    }

    public Soporte getSoporteUsb(){
        return this.soporteUsb;
    }

    public void setSoporteUsb(Soporte soporteUsb){
        this.soporteUsb = soporteUsb;
    }

    public Televisor encender(){
        this.setEncendido(true);
        return this;
    }

    public Televisor apagar(){
        this.setEncendido(false);
        return this;
    }

    public Televisor subirVolumen(){
        if(this.getEncendido() && this.getVolumen() != 30){
            this.setVolumen(this.getVolumen()+1);
        }
        return this;
    }

    public Televisor bajarVolumen(){
        if(this.getEncendido() && this.getVolumen() != 0){
            this.setVolumen(this.getVolumen()-1);;
        }
        return this;
    }

    public int volumen() {
        return this.volumen;
    }

    public Televisor sintonizar(int canal){
        if(this.getEncendido() && canal > 0 && canal <= 100){
            this.canal = canal;
        }
        return this;
    }

    public Televisor conectar(Soporte soporte){
        this.setPuertoUsb(true);
        this.setSoporteUsb(soporte);
        return this;
    }

    public Televisor desconectarSiConectado(){
        if(this.getPuertoUsb()){
            this.setPuertoUsb(false);
            this.setSoporteUsb(null);
        }
        return this;
    }

    public String[] reproducirSiConectado(){
        if(this.getPuertoUsb() && this.getEncendido()){
            for (String s : this.getSoporteUsb().playlist()) {
                System.out.println(s);
            }
            return this.getSoporteUsb().playlist();
        }
        return new String[0];
    }
}
