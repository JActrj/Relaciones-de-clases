
package pryanimales;

import java.util.Scanner;


public class Pryanimales {

   
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        
        System.out.println("Que tipo de animal quieres trabajar:");
        System.out.println("1. Mamifero");
        System.out.println("2. Ave");
        System.out.println("3. Reptil");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        
        String nombre;
        int edad;

        
        switch (opcion) {
            case 1: 
                System.out.println("Ingrese el nombre del mamifero:");
                nombre = scanner.nextLine();
                System.out.println("Ingrese la edad del mamifero:");
                edad = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                System.out.println("Ingrese el tipo de pelaje del mamifero:");
                String pelaje = scanner.nextLine();
                Mamifero mamifero = new Mamifero(pelaje, nombre, edad);
                mamifero.comer();
                mamifero.amamantarcrias();
                break;

            case 2: 
                System.out.println("Ingrese el nombre del ave:");
                nombre = scanner.nextLine();
                System.out.println("Ingrese la edad del ave:");
                edad = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                System.out.println("Ingrese la envergadura de las alas del ave:");
                double envergadura = scanner.nextDouble();
                Ave ave = new Ave(envergadura, nombre, edad);
                ave.volar();
                break;

            case 3: 
                System.out.println("Ingrese el nombre del reptil:");
                nombre = scanner.nextLine();
                System.out.println("Ingrese la edad del reptil:");
                edad = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                System.out.println("Ingrese el tipo de escamas del reptil:");
                String escamas = scanner.nextLine();
                Reptil reptil = new Reptil(escamas, nombre, edad);
                reptil.comer();
                reptil.arrastrarse();
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
      
        
    }
    
}
