import javax.swing.*;

public class ejercicio1 {

    //Crea un array de enteros de 10 posiciones con valores pedidos por teclado.
    //Muestra por consola el índice y el valor que le correspondan

    //Haz 2 métodos:
    //Uno para rellenar valores
    //Otro para mostrarlos

    public static void rellenarArray(int[] elArray){

        for (int i=0;i< elArray.length;i++){
            elArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero: "
                    + (i+1)));
        }
    }

    public static void mostrarArray(int[] elArray){
        for (int i=0;i< elArray.length;i++){
            System.out.println("El número en el índice " + i + " es " + elArray[i]);
        }
    }

    public static void main(String[] args) {

        final int TAMANO=10;
        int[] numeros = new int[TAMANO];

        rellenarArray(numeros);
        mostrarArray(numeros);


    }
}
