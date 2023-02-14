package ExercisesJava;

import java.io.*;
import java.io.InputStream;
import java.io.PrintStream;

public class ExerciseEigth {
    public static void main(String[] args) {
        CopyFile("/etc/passwd","destino.txt" );
    }
            public static void CopyFile (String FileIn, String FileOut){
        try{
            InputStream folder1 = new FileInputStream(FileIn);
            PrintStream folder2 = new PrintStream(FileOut);
           try{
               byte[] datos = folder1.readAllBytes();
               for(byte dato : datos){
                   System.out.print((char) dato);
                   folder1.close();
               }
               folder2.write(datos);
               folder2.close();
           } catch (IOException e){
               System.out.println("Estamos ante una excepcion del tipo IOException" + e.getMessage());
           }
    } catch (FileNotFoundException e){
            System.out.println("El fichero no existe" + e.getMessage());
        }
    }
}
