import java.util.Scanner;
public class numero1_mayor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero : ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero : ");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero : ");
        int numero3 = scanner.nextInt();

        if (numero1>numero2 && numero1<numero3) {
            System.out.println("El numero : " +numero1+ " es mayor que el numero : " +numero2+ " y menor que el numero : 2"+numero3);
        } else {
            System.out.println("Esta condicion no se puede cumplir");
        }
        scanner.close();
    }
}