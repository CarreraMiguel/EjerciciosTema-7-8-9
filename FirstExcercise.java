package ExercisesJava;

public class FirstExcercise {
    public static void main(String[] args) {
        String[] words = new String[5];
        words[0] = "Miguel";
        words[1] = "Juan";
        words[2] = "Andrés";
        words[3] = "Pedro";
        words[4] = "Jaime";
        for(String palabra : words){
            System.out.println("El nombre en el array es: " + palabra);
        }
    }
}
