package EjerciciosParcial;
import java.util.Scanner;

public class ProduccionFabrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantOperarios;
        int cantEntre10Y100U=0;
        int cantMayor100U=0;
        int sumaTotal=0;

        System.out.println("Ingrese la cantidad de Operarios: ");
        cantOperarios=scanner.nextInt();

        int[] producciones = new int[cantOperarios];

        for (int i = 0; i < producciones.length; i++) {
            do {
                System.out.println("Ingrese la produccion del operario "+(i+1)+" : ");
                producciones[i]=scanner.nextInt();

                if (producciones[i]<10 || producciones[i]>200) {
                    System.out.println("Produccion inválida");
                }
            } while (producciones[i]<10 || producciones[i]>200);

            sumaTotal+=producciones[i];

            if (producciones[i]<=100) {
                cantEntre10Y100U++;
            }else{
                cantMayor100U++;
            }
        }
        System.out.println("La cantidad de operarios que realizaron producciones entre 1 y 100 fueron: "+cantEntre10Y100U);
        System.out.println("La cantidad de operarios que realizaron producciones mayores a 100 fueron : "+cantMayor100U);
        System.out.println("La suma total de todas las producciones es: "+sumaTotal);

        scanner.close();;
    }
}
