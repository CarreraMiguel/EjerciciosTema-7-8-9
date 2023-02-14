package ExercisesJava;

import java.util.HashMap;
import java.util.Scanner;
//<>
public class Libreria {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Hola bienvenido a nuestra libreria!");
        System.out.println("Soy su asistente virtual, a continuación le mostramos el catálogo actual de libros." );
        System.out.println("-----------------------------------------------------------------------------------------");
        HashMap<String, Integer> catalogo = new HashMap<>();
        catalogo.put("El nombre del viento", 20);
        catalogo.put("El señor de los anillos", 12);
        catalogo.put("100 años de soledad", 10);
        catalogo.put("Harry Potter", 20);
        catalogo.put("Fuego y Sangre", 30);

        for(String libros: catalogo.keySet()){
            System.out.println(libros + " y su precio es: " + catalogo.get(libros) + " euros.");
        }
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("¿Le gustaria comprar o alquilar un libro?");
        System.out.println("Escriba a continuacion, Comprar o Alquilar:");
        String opcion = leer.nextLine().toLowerCase();
        if(opcion.equals("comprar")){
            System.out.println("Usted ha elegido comprar, a continuacion escriba el titulo del libro: ");
            String titulo = leer.nextLine();

            if(catalogo.containsKey(titulo)){
                System.out.println("El libro seleccionado y su precio es: " + catalogo.get(titulo));
            } else{
                System.out.println("No tenemos el libro que nos pide, por favor revise el catalogo nuevamente para ver que libros tenemos en stock, gracias.");
            }
        } else if ( opcion.equals("alquilar")){
            System.out.println("Usted ha elegido alquilar, a continuacion escriba el titulo del libro: ");
            String titulo = leer.nextLine();
            if(catalogo.containsKey(titulo)){
                System.out.println("El libro seleccionado es: " + titulo + " y su precio es de: " + catalogo.get(titulo) / 2 + " euros.");
            } else {
                System.out.println("No tenemos el libro que nos pide, por favor revise el catalogo nuevamente para ver que libros tenemos en stock, gracias.");
            }
        } else{
            System.out.println("opcion invalida, escriba solamente Comprar o Alquilar, gracias.");
        }
    }
}