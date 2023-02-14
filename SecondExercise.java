package ExercisesJava;

import java.util.Arrays;

public class SecondExercise {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;

        numbers[1][0] = 10;
        numbers[1][1] = 20;
        numbers[1][2] = 30;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[1].length; j++){
                System.out.println("Estoy en : " + i + " y en: " + j + " y su valor guardado es: " + (numbers[i][j]));
            }
        }
    }
}
