package ExercisesJava;
import java.util.Scanner;
public class BackwardChain {
    public static void main(String[] args) {
        System.out.println(reverse());
    }
        public static String reverse() {
            Scanner leer = new Scanner(System.in);
            System.out.println("Introduzca frase para revertir: ");
            String text = leer.nextLine();
            for (int i = (text.length()) - 1; i >= 0; i--) {
                System.out.println(text.charAt(i));
            }
            return "Proceso terminado leer de abajo hacia arriba";
        }
    }
