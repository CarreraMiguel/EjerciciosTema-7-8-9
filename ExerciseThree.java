package ExercisesJava;

import java.util.Vector;

public class ExerciseThree {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector(50, 500);
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        System.out.println("Los valores guardados en el vector son: " + numbers);
        numbers.remove(1);
        numbers.remove(2);
        System.out.println("Los valores guardados en el vector son: " + numbers);
        System.out.println(numbers.capacity());
        numbers.trimToSize();
        numbers.add(600);
        System.out.println(numbers.capacity());
    }
}
// EXPLICACIÓN DE UTILIZAR UN VECTOR CON CAPACIDAD POR DEFECTO 1000.

/* EL problema al utilizar un Vector es que sin especificar una capacidad inicial o un incremento de esta, por defecto
el vector se incrementará siempre el doble de lo que hemos llenado, por lo que se reserva un gran espacio de memoria que
realmente no está siendo utilizado lo cual genera problema en el rendimiento del programa. Por otro lado tambien es malo
que pongamos un incremento de capacidad muy bajo ya que si nuestro programa sobrepasa constantemente este limite, estará
generando constantemente nuevos vectores lo que ocupa recursos y genera tambien que el programa se ralentice, por lo que debemos
buscar el equilibrio entre capacidad inicial e incremento que se ajuste a las necesidades de nuestro programa.
 */
