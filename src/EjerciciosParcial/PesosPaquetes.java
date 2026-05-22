package EjerciciosParcial;
import java.util.Scanner;

public class PesosPaquetes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantPaquetes;
        int cantEntre1Y20kg=0;
        int cantMayor20kg=0;
        int sumaTotal=0;

        System.out.println("Ingrese la cantidad de paquetes: ");
        cantPaquetes = scanner.nextInt();

        int[] pesos = new int[cantPaquetes];

        for (int i = 0; i < pesos.length; i++) {
            do {
                System.out.println("Ingrese el peso del paquete "+ (i+1) + " : ");
                pesos[i]=scanner.nextInt();

                if (pesos[i]<1 || pesos[i]>50) {
                    System.out.println("Peso inválido");
                }
            } while (pesos[i]<1 || pesos[i]>50);

            sumaTotal+=pesos[i];
            
            if (pesos[i]<20) {
                cantEntre1Y20kg++;
            }else{
                cantMayor20kg++;
            }

        }
        System.out.println("La cantidad de paquetes con un peso entre 1 y 20 kg son: "+cantEntre1Y20kg);
        System.out.println("La cantidad de paquetes con un peso mayor a 20 son: "+cantMayor20kg);
        System.out.println("La suma total de estos pesos son "+sumaTotal);
        scanner.close();
    }
}