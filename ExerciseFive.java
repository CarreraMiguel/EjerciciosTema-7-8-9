package ExercisesJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExerciseFive {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juanito");
        nombres.add("Miguelito");
        nombres.add("Joselito");
        nombres.add("Fernando");

        LinkedList<String> elementos = new LinkedList<String>(nombres);
        for(String elements: nombres){
            System.out.println(elements);
        }
    }
}