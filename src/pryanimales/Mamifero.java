
package pryanimales;

public class Mamifero extends animal {
    public String tipodepelaje; 

    public Mamifero(String tipodepelaje, String nombre, int edad) {
        super(nombre, edad);
        this.tipodepelaje = tipodepelaje;
    }
    public void amamantarcrias(){
        System.out.println(nombre+" "+"esta amamantando crias");
    }
}
