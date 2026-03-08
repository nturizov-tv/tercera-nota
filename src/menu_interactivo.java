import java.util.Scanner;
public class menu_interactivo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona una opcion ");
        System.out.println(" 1.Suma ");
        System.out.println(" 2.Resta ");  
        System.out.println(" 3.Multiplicacion ");
        System.out.println(" 4.Divicion ");    
        System.out.println(" 5.Modulo ");
        
        System.out.println("Ingrese el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese la opcion que quiera ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(" La suma es igual a : "+(numero1+numero2));
                break;
            case 2:  
                System.out.println(" La resta es igual a : "+(numero1-numero2));
                break;
            case 3:
                System.out.println(" La multiplicación es igual a : "+(numero1*numero2));
                break;
            case 4:
                System.out.println(" La división es igual a : "+(numero1/numero2));
                break;
            case 5:    
                System.out.println(" El modulo es igual a : "+(numero1%numero2));
                break;
            default:
                System.out.println(" Opcion no valida, lo siento ");
                break;
        }

        scanner.close();
    }
}