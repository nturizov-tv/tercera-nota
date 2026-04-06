package unidad1.parcial1;

import java.util.Scanner;

public class Punto1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el valor total de la compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra < 0) {
            System.out.println("El valor ingresado es inválido.");
        } else {
            double descuentoPorcentaje;

            if (valorCompra < 50000) {
                descuentoPorcentaje = 0;
            } else if (valorCompra < 100000) {
                descuentoPorcentaje = 5;
            } else if (valorCompra < 200000) {
                descuentoPorcentaje = 10;
            } else {
                descuentoPorcentaje = 15;
            }

            double valorDescuento = valorCompra * (descuentoPorcentaje / 100);
            double valorFinal = valorCompra - valorDescuento;

            System.out.println("---- FACTURA -----");
            System.out.println("Cliente: " + nombre);
            System.out.println("Valor original: $" + valorCompra);
            System.out.println("Descuento aplicado: " + descuentoPorcentaje + "%");
            System.out.println("Valor del descuento: $" +  valorDescuento);
            System.out.println("Valor final a pagar: $" + valorFinal);
        }

        scanner.close();
    }  
}
    

