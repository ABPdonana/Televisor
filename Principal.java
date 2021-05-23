public class Principal{
    public static void main(String[] args) {

        String[] auxsop = {"Batman.mp4", "Superman.mp4"};
        Soporte soporte = new Soporte(auxsop);

        Televisor t1 = new Televisor();
        System.out.println(t1.encender().bajarVolumen().volumen());

        Televisor t2 = new Televisor();
        System.out.println(t2.subirVolumen().encender().subirVolumen().volumen());

        /*Televisor t3 = new Televisor();
        System.out.println(t3.conectar(soporte).reproducirSiConectado());*/

        Televisor t4 = new Televisor();
        System.out.println(t4.conectar(soporte).encender().reproducirSiConectado());
    }
}
