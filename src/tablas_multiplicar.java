import java.util.Scanner;
public class tablas_multiplicar {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero del que desea su tabla ");
        int numero = scanner.nextInt();
        scanner.close();

        for(int i = 1; i<=10; i++){
            System.out.println(numero + " x "+ i+ " = "+ (numero*i));
        }
    }
}