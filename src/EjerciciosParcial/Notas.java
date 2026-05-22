package EjerciciosParcial;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantEstudiantes;
        int cantEntre3Y4=0;
        int cantMayor4=0;
        double sumaTotal=0;

        System.out.println("Ingrese la cantidad de estudiantes que hay en el curso: ");
        cantEstudiantes = scanner.nextInt();

        double[] notas = new double[cantEstudiantes];

        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.println("Ingrese la nota del estudiante " +(i+1)+ " : ");
                notas[i] = scanner.nextDouble();
                if (notas[i]<1.0 || notas[i]>5.0) {
                    System.out.println("Nota invalida");
                }
            } while (notas[i]<1.0 || notas[i]>5.0);

            sumaTotal+=notas[i];

            if (notas[i]<4.0) {
                cantEntre3Y4++;
            }else{
                cantMayor4++;
            }
        }
        System.out.println("La cantidad de estudiantes con notas enre 3.0 y 4.0 son: "+cantEntre3Y4);
        System.out.println("La cantidad de estudiantes con notas mayores a 4.0: "+cantMayor4);
        System.out.println("La suma de todas las notas es : "+sumaTotal);
        scanner.close();;
    }
}