package EjerciciosParcial;

import java.util.Scanner;

public class Sueldos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int cantEmpleados;
        int cantEntre100Y300 = 0;
        int cantMayor300 = 0;
        double importeTotal = 0;

        System.out.println("Ingrese cantidad de empleados: ");
        cantEmpleados = sc.nextInt();

        double[] sueldos = new double[cantEmpleados];
        
        for (int i = 0; i < cantEmpleados; i++) {

            do {

                System.out.println("Ingrese sueldo del empleado " + (i + 1));
                sueldos[i] = sc.nextDouble();

                if (sueldos[i] < 100 || sueldos[i] > 500) {
                    System.out.println("Sueldo inválido");
                }

            } while (sueldos[i] < 100 || sueldos[i] > 500);

            importeTotal += sueldos[i];

            if (sueldos[i] <= 300) {
                cantEntre100Y300++;
            } else {
                cantMayor300++;
            }
        }

        System.out.println("\nCantidad de empleados que ganan entre $100 y $300: " + cantEntre100Y300);
        System.out.println("Cantidad de empleados que ganan más de $300: " + cantMayor300);
        System.out.println("Importe total que gasta la empresa en nomina: " + importeTotal);

        sc.close();
    }
}
