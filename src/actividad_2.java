public class actividad_2 {
    public static void main(String[] args) {

        double precioCamiseta = 25;
        double precioPantalon = 30;
        double descuento = (15.0/100);
        double descuentoAdicional = (5.0/100);

        // Aplicar 15%
        double camisetaDescuento = precioCamiseta - (precioCamiseta * descuento);
        double pantalonDescuento = precioPantalon - (precioPantalon * descuento);

        // Segunda camiseta con 5% adicional
        double segundaCamiseta = camisetaDescuento - (camisetaDescuento * descuentoAdicional);

        // Total
        double total = camisetaDescuento + pantalonDescuento + segundaCamiseta;

        System.out.println("Total a pagar: $" + total);
    }
}