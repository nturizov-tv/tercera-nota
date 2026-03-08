import java.util.Scanner;
public class factorial_numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int numero = scanner.nextInt();
        scanner.close();
        int factorial = 1;
        int i = 1;
        while (i<= numero) {
            factorial *= i; i++;
        }
        System.out.println("El factprial del numero "+numero+ " es: "+factorial);

    }
}