package EjerciciosParcial;
import java.util.Scanner;

public class GastosClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantClientes;
        int cantEntre20Y100=0;
        int cantMayor100=0;
        double sumaTotal=0;

        System.out.println("Ingrese la cantidad de clientes: ");
        cantClientes=scanner.nextInt();

        int[] gastos = new int[cantClientes];

        for (int i = 0; i < gastos.length; i++) {
            do {
                System.out.println("Ingrese el gasto del cliente "+ (i + 1)+ " : ");
                gastos[i]=scanner.nextInt();

                if (gastos[i]<20000 || gastos[i]>200000) {
                    System.out.println("Gasto inválido");
                }
            } while (gastos[i]<20000 || gastos[i]>200000);

            sumaTotal+=gastos[i];

            if (gastos[i]<100000) {
                cantEntre20Y100++;
            }else{
                cantMayor100++;
            }
        }

        System.out.println("La cantidad de clientes que realizaron gastos entre 20.000 y 100.000 feron: "+cantEntre20Y100);
        System.out.println("La cantidad de clientes que realizaron gastos mayores a 100.000 feron: "+cantMayor100); 
        System.out.println("El total del dinero recibido fue de: "+sumaTotal);
        scanner.close();
    }
}