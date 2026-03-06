import java.util.Scanner;

public class ejercicio_practico_2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = Scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = Scanner.nextInt();
        System.out.print("Ingrese su altura en metros: ");
        double altura = Scanner.nextDouble();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años y mides " + altura + " metros.");
        Scanner.close();
    }
}