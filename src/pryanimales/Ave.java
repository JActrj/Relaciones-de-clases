
package pryanimales;

public class Ave extends animal {
    double envergaduradealas;

    public Ave(double envergaduradealas, String nombre, int edad) {
        super(nombre, edad);
        this.envergaduradealas = envergaduradealas;
    }
    public void volar (){
        System.out.println(nombre+" "+"esta volado con una envergadura de: "+envergaduradealas);
    }
}
