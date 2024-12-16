
package pryanimales;


public class Reptil extends animal{
    String tipoescamas;

    public Reptil(String tipodeecamas, String nombre, int edad) {
        super(nombre, edad);
        this.tipoescamas = tipodeecamas;
    }
    
    public void arrastrarse(){
        System.out.println(nombre+" "+"se esta arrastrando con sus escamas de tipo escamas: "+tipoescamas);
    }
    
}
