package EjerciciosParcial;
import java.util.Scanner;

public class Kilometros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantVehiculos;
        int cantEntre10Y300km=0;
        int cantMayor300km=0;
        double sumaTotal=0;

        System.out.println("Ingrese la cantidad de vehiculos: ");
        cantVehiculos=scanner.nextInt();

        int[] recorridos = new int[cantVehiculos];

        for (int i = 0; i < recorridos.length; i++) {
            do {
                System.out.println("Ingrese los km recorridos: ");
                recorridos[i]=scanner.nextInt();

                if (recorridos[i]<10 || recorridos[i]>500) {
                    System.out.println("Km inválido");
                }
            } while (recorridos[i]<10 || recorridos[i]>500);

            sumaTotal+=recorridos[i];

            if (recorridos[i]<=300) {
               cantEntre10Y300km++; 
            }else {
                cantMayor300km++;
            }

        }

        System.out.println("La cantidad de vehiculos que recorrieron km entre 10 y 300 fueron: "+cantEntre10Y300km);
        System.out.println("La cantidad de vehiculos que recorrieron km mayores a 300 fueron: "+cantMayor300km);
        System.out.println("La suma total de kilometros es: "+sumaTotal);
        scanner.close();
    }
}