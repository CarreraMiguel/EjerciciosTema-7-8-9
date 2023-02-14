package ExercisesJava;

import java.util.ArrayList;
import java.util.List;

public class ExerciseSix {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i<=10;i++){
            if( i % 2 == 0){
                continue;
            }
            numbers.add(i);
        }
        for(Integer values: numbers){
            System.out.println("EL elemento en el ArrayList es: " + values);
        }
    }
}
