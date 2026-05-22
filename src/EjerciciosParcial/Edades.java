package EjerciciosParcial;
import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantPersonas;
        int cantEntre18y30 = 0;
        int cantMayor30 = 0;
        int sumaEdades = 0;

        System.out.println("Ingrese la cantidad de personas: ");
        cantPersonas = sc.nextInt();

        int[] edades = new int[cantPersonas];

        for (int i = 0; i < cantPersonas; i++) {

            do {
                System.out.println("Ingrese la edad de la persona " + (i + 1) + ": ");
                edades[i] = sc.nextInt();

                if (edades[i] < 1 || edades[i] > 120) {
                    System.out.println("Edad inválida");
                }

            } while (edades[i] < 1 || edades[i] > 120);

            
            sumaEdades += edades[i];

            
            if (edades[i] <= 30) {
                cantEntre18y30++;
            } else if (edades[i] > 30) {
                cantMayor30++;
            }
        }

        System.out.println("\nCantidad de personas entre 18 y 30 años: " + cantEntre18y30);
        System.out.println("Cantidad de personas mayores de 30 años: " + cantMayor30);
        System.out.println("Suma total de edades: " + sumaEdades);

        sc.close();
    }
}