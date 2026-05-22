package EjerciciosParcial;
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantVentas;
        int cantEntre50Y500=0;
        int cantMayor500=0;
        double sumaTotal=0;

        System.out.println("Ingrese la cantidad de ventas: ");
        cantVentas = scanner.nextInt();

        int[] ventas = new int[cantVentas];

        for (int i = 0; i < ventas.length; i++) {
            do {
                System.out.println("Ingrese la venta " + (i+1) + " : ");
                ventas[i] = scanner.nextInt();
                if (ventas[i]<50 || ventas[i]>1000) {
                    System.out.println("Venta inválida");
                }
            } while (ventas[i]<50 || ventas[i]>1000);

            sumaTotal+=ventas[i];

            if (ventas[i]<=500 ) {
                cantEntre50Y500++;
            }else {
                cantMayor500++;
            }
        }

        System.out.println("La cantidad de de ventas entre 50 y 500 fueron: "+cantEntre50Y500);
        System.out.println("La cantidad de venas mayores a 500 fueron: "+cantMayor500);
        System.out.println("La suma total de estas ventas fue de: "+sumaTotal);

        scanner.close();
    }
}
