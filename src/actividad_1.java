public class actividad_1 {
    public static void main(String[] args) {

        double saldoInicial = 1000;
        double retiroSemanal = 200;
        int semanas = 4;

        double totalRetirado = retiroSemanal * semanas;
        double saldoFinal = saldoInicial - totalRetirado;

        System.out.println("Saldo final: $" + saldoFinal);
    }
} 