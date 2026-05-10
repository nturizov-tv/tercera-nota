package unidad2;
import java.util.Scanner;

class Personaje {
    String nombre;
    int fuerza;
    int vida;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Vida:   " + vida);
    }

    void atacar(Personaje oponente) {
        oponente.vida = oponente.vida - fuerza;
        System.out.println(nombre + " ataca a " + oponente.nombre + "!");
        System.out.println(oponente.nombre + " tiene " + oponente.vida + " de vida");
    }

    void atacar(Personaje oponente, String nombreAtaque) {
        int danio = fuerza * 2;
        oponente.vida = oponente.vida - danio;
        System.out.println(nombre + " usa " + nombreAtaque + " contra " + oponente.nombre + "!");
        System.out.println(oponente.nombre + " tiene " + oponente.vida + " de vida");
    }

    void defenderse() {
        int escudo = fuerza / 2;
        vida = vida + escudo;
        System.out.println(nombre + " se defiende y recupera " + escudo + " de vida!");
        System.out.println(nombre + " ahora tiene " + vida + " de vida");
    }

    void recuperarse() {
        vida = vida + 20;
        System.out.println(nombre + " se recupera y gana 20 de vida!");
        System.out.println(nombre + " ahora tiene " + vida + " de vida");
    }
}

public class Juego {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Personaje guerrero = new Personaje();
        guerrero.nombre = "Guerrero";
        guerrero.fuerza = 50;
        guerrero.vida = 300;

        Personaje mago = new Personaje();
        mago.nombre = "Mago Oscuro";
        mago.fuerza = 40;
        mago.vida = 250;

        System.out.println("====== BATALLA EPICA ======");
        System.out.println(
                guerrero.nombre + " (vida: " + guerrero.vida + ") vs " + mago.nombre + " (vida: " + mago.vida + ")");

        while (guerrero.vida > 0 && mago.vida > 0) {

            System.out.println("\n--- Estado actual ---");
            System.out.println(
                    guerrero.nombre + ": " + guerrero.vida + " vida  |  " + mago.nombre + ": " + mago.vida + " vida");

            System.out.println("\n¿Qué hace el Guerrero?");
            System.out.println("1. Atacar");
            System.out.println("2. Golpe Demoledor (ataque especial)");
            System.out.println("3. Defenderse");
            System.out.println("4. Recuperarse");
            System.out.print("Elige (1-4): ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                guerrero.atacar(mago);
            } else if (opcion == 2) {
                guerrero.atacar(mago, "Golpe Demoledor");
            } else if (opcion == 3) {
                guerrero.defenderse();
            } else if (opcion == 4) {
                guerrero.recuperarse();
            } else {
                System.out.println("Opcion invalida, el Guerrero pierde el turno");
            }

            if (mago.vida > 0) {
                System.out.println("\nEl Mago Oscuro contraataca!");
                if (mago.vida % 2 == 0) {
                    mago.atacar(guerrero, "Rayo de Sombra");
                } else {
                    mago.atacar(guerrero);
                }
            }
        }

        System.out.println("\n====== FIN DE LA BATALLA ======");
        if (guerrero.vida > 0) {
            System.out.println("¡El Guerrero ganó con " + guerrero.vida + " de vida!");
        } else {
            System.out.println("El Mago Oscuro ganó... el Guerrero fue derrotado.");
        }

        scanner.close();
    }
}