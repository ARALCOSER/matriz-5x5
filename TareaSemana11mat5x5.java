/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareasemana11mat5x5;
import java.util.Scanner;

/**
 *
 * @author AR.ALCOSER
 */
public class TareaSemana11mat5x5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declaro la matriz de 5x5
        try ( // El Scanner para la lectura por consola usando el Teclado
                Scanner sc = new Scanner(System.in)) {
            // Declaro la matriz de 5x5
            int[][] matriz = new int[5][5];
            // Declaro un contador de elementos
            int contele = 1;
            System.out.println("        ESTA ES UNA MATRIZ 5x5 DE NUMEROS ENTEROS ");
            System.out.println("-- Tenga en cuenta que son 25 elementos que va a ingrezar --\n\n");
            // Bloque de ingreso de numeros (Bucles anidados)
            // Variable i, El primer bucle recorre las filas de la matriz
            for (int i = 0; i < 5; i++) {
                // Variable j, El segundo bucle recorre las columnas de la matris
                for (int j = 0; j < 5; j++) {
                    System.out.print("Ingrese el valor para la posicion [" + i + "][" + j + "], o elemento \"" + contele + "\" de la matriz: ");
                    contele ++;
                    // Validacion: asegura acepta el ingreso solo de un número entero
                    while (!sc.hasNextInt()) {
                        System.out.print("Numero ingresado NO es valido, Por favor ingrese un numero entero: ");
                        sc.next(); // Limpiar el valor incorrecto
                    }
                    matriz[i][j] = sc.nextInt();
                }
            }   // Mostrar los datos de la matriz en forma de tabla
            System.out.println("\n\n-------------------------------------------");
            System.out.println("             LA MATRIZ INGRESADA ES:");
            System.out.println("-------------------------------------------");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    // Uso \t para un tabulador para que las columnas queden alineadas
                    System.out.print(matriz[i][j] + "\t");
                }
                // Después de recorrer todas las columnas de una fila, salto de línea
                System.out.println();
            }
            // Cerrar el recurso Scanner
        }
        System.out.println("-------------------------------------------\n\n");   
    }
}