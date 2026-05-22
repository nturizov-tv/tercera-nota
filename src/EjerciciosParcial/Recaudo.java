package EjerciciosParcial;

import java.util.Scanner;

public class Recaudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantVehiculos;
        int cantEntre2Y20Mil=0;
        int cantMayor20Mil=0;
        double sumaTotal=0;

        System.out.println("Ingese la cantidad de vehiculos: ");
        cantVehiculos=scanner.nextInt();

        int[] pagos = new int[cantVehiculos];

        for (int i = 0; i < pagos.length; i++) {
            do {
                System.out.println("Ingrese el pago del vehiculo "+ (i + 1)+" : ");
                pagos[i]=scanner.nextInt();

                if (pagos[i]<2000 || pagos[i]>50000) {
                    System.out.println("Pago inválido");
                }
            } while (pagos[i]<2000 || pagos[i]>50000);

            sumaTotal+=pagos[i];

            if (pagos[i]<=20000) {
                cantEntre2Y20Mil++;
            }else{
                cantMayor20Mil++;
            }
        }

        System.out.println("La cantidad de vehiculos que pagan entre 2000 y 20000 fueron: "+cantEntre2Y20Mil);
        System.out.println("La cantidad de vehiculos que pagan mas de 20000 fueron "+cantMayor20Mil);
        System.out.println("La suma del recaudo es: "+sumaTotal);
        scanner.close();
    }
}
