import java.util.Scanner;

/**
 * Esta es la clase que se encarga de realizar la suma de dos numeros.
 * @author Josue Tuquer
 * @since 2024-08-02
 */

public class Areas {
 
        /**
         * Metodo principal de la clase que se encarga de procesar la suma de dos numeros
         * @param args que representa un listado de valores al momento de ejecutar un programa.
         * 
         */
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        int MedidaA = scan.nextInt();
        int MedidaB = scan.nextInt();
        int MedidaC = scan.nextInt();

        int Triangulo = (MedidaB * MedidaA) / 2;
        int Rectangulo = MedidaB * MedidaC;

        int Area = Triangulo + Rectangulo;

        System.out.println(Area);


    }
}