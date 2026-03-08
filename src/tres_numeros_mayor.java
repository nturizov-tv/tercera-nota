import java.util.Scanner;
public class tres_numeros_mayor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresa el segundo numero");
        int numero2 = scanner.nextInt();
        System.out.println("Ingresa el tercer numero");
        int numero3 = scanner.nextInt();

        if (numero1>numero2 && numero1>numero3) {
            System.out.println(" El numero 1 es mayor ");
        } else if (numero2>numero1 && numero2>numero3){
            System.out.println("El numero 2 es mayor");
        } else {
            System.out.println("El numero 3 es mayor");
        }

        scanner.close();
    }
}