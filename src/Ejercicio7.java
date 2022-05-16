import javax.swing.*;

public class Ejercicio7 {
    //Calcula la letra de un DNi.
    // Pediremos el DNi por teclado y nos devolverá el DNi completo
    //Para calcular la letra cogeremos el resto de dividir el dni entre 23
    //El resultado que debe de estar entre 0 y 22 nos dará el índice del caracter en el siguiente array

    public static String letraNIF(int resto){
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        String letra = letras[resto];

        return letra;
    }
    public static void main(String[] args) {

         //Pedimos DNI por pantalla
        
        String dniSinLetra = JOptionPane.showInputDialog("Introduce tu DNI sin la letra");
        int dni = Integer.parseInt(dniSinLetra);
        
        int posicion = dni%23;

        JOptionPane.showMessageDialog(null,"Tu DNI es: " + dni + letraNIF(posicion));

    }



}
