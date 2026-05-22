package EjerciciosParcial;
import java.util.Scanner;

public class ConsumoAgua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantApartamento;
        int cantEntre1Y50 = 0;
        int cantMayor50 = 0;
        double sumaTotal = 0;

        System.out.println("Ingrese la cantidad de apartamentos: ");
        cantApartamento = scanner.nextInt();

        double[] consumos = new double[cantApartamento];

        for (int i = 0; i < consumos.length; i++) {

            do {
                System.out.println("Ingrese el consumo del apartamento " + (i + 1) + " : ");
                consumos[i] = scanner.nextInt();
                if (consumos[i]<1 || consumos[i]>100) {
                    System.out.println("Consumo Inválido");
                }
            } while (consumos[i]<1 || consumos[i]>100);

            sumaTotal+=consumos[i];
            
            if (consumos[i]<=50) {
                cantEntre1Y50++;
            }else{
                cantMayor50++;
            }
        }
        System.out.println("La cantidad de apartamentos con un consumo enre 1 y 50 fueron: "+cantEntre1Y50);
        System.out.println("La cantidad de apartametos con un consumo mayor a 50, fueron: "+cantMayor50);
        System.out.println("La suma total de consumos es : "+sumaTotal);

        scanner.close();
        
    }
}