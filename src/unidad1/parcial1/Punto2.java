package unidad1.parcial1;

import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] ventas = new double[7];
        double suma = 0;
        double mayor, menor;
        int diasMayor100k = 0;
        int diasMenor50k = 0;

        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese la venta del día " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }

        mayor = ventas[0];
        menor = ventas[0];

     
        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i];

            if (ventas[i] > mayor) {
                mayor = ventas[i];
            }

            if (ventas[i] < menor) {
                menor = ventas[i];
            }

            if (ventas[i] > 100000) {
                diasMayor100k++;
            }

            if (ventas[i] < 50000) {
                diasMenor50k++;
            }
        }

        double promedio = suma / ventas.length;

    
        System.out.println("Ventas registradas:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + ventas[i]);
        }

        System.out.println("Resumen semanal:");
        System.out.println("Venta más alta: " + mayor);
        System.out.println("Venta más baja: " + menor);
        System.out.println("Promedio de ventas: " + promedio);
        System.out.println("Días con ventas > 100000: " + diasMayor100k);
        System.out.println("Días con ventas < 50000: " + diasMenor50k);
        System.out.println("Total acumulado: " + suma);

        scanner.close();
    }
}
