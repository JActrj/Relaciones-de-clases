
package pryanimales;


public class animal {
    String nombre;
    int edad;

    public animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void comer(){
        System.out.println(nombre+" "+"esta comiedo");
    }
    public void dormir(){
        System.out.println(nombre+" "+"esta amamantando a sus crias");
    }
}
