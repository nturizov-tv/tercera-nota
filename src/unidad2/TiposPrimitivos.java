package unidad2;

public class TiposPrimitivos {
    public static void main(String[] args) {
        int numero = 5;
        cambiarValor(numero);
        System.out.println("Después de llamar a cambiarValor: " + numero); // Imprime 5
    }

    public static void cambiarValor(int num) {
        num = 10;
        System.out.println("Dentro de cambiarValor: " + num); // Imprime 10
    }
}