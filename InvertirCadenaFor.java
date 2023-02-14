
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class InvertirCadenaFor {

    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese una palabra
        System.out.println("Ingrese una palabra para invertir:");

        // Creamos un objeto Scanner para tomar la entrada del usuario
        Scanner escaner = new Scanner(System.in);
        String cadena = escaner.nextLine();

        // Inicializamos la variable para almacenar la cadena invertida
        String cadenaInvertida = "";

        // Utilizamos un ciclo for para invertir la cadena
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        // Mostramos la cadena invertida al usuario
        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }
}
