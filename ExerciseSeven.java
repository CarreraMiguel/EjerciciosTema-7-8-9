package ExercisesJava;
import java.io.IOException;
import java.util.Scanner;
public class ExerciseSeven {
    public static void main(String[] args) {
        try{
            DividePorCero();
        } catch(IOException e){
            System.out.println("No se puede dividir por 0");
        }

    }

    public static void DividePorCero() throws ArithmeticException, IOException {
        try{
            Scanner leer = new Scanner(System.in);
            System.out.println("Introduzca numeros a dividir: ");
            Integer num1 = leer.nextInt();
            Integer num2 = leer.nextInt();
            Integer resultado = num1 / num2;
            System.out.println("El resultado de la operacion es: " + resultado);
        } catch (ArithmeticException e){
            throw new IOException();
        } finally{
            System.out.println("Demo de código");
        }
    }
}
