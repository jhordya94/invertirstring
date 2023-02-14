
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class InvertirCadenaDoWhile {

    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese una palabra
        System.out.println("Ingrese una palabra para invertir:");

        // Creamos un objeto Scanner para tomar la entrada del usuario
        Scanner escaner = new Scanner(System.in);
        String palabra = escaner.nextLine();

        // Obtenemos la longitud de la palabra
        int longitud = palabra.length() - 1;

        // Inicializamos la variable para almacenar la palabra invertida
        String palabraInvertida = "";

        // Utilizamos un ciclo do-while para invertir la palabra
        do {
            palabraInvertida += palabra.charAt(longitud);
            longitud--;
        } while (longitud >= 0);

        // Mostramos la palabra invertida al usuario
        System.out.println("La palabra invertida es: " + palabraInvertida);
    }
}
