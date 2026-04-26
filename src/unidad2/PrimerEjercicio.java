import java.util.Scanner;

public class PrimerEjercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombres[] = new String[10];
        double marca2024[] = new double[10];
        double marca2025[] = new double[10];
        double marca2026[] = new double[10];

        int contador = 0;
        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Inscribir participante");
            System.out.println("2. Mostrar listado de datos");
            System.out.println("3. Mostrar listado por marcas");
            System.out.println("4. Finalizar programa");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    if (contador < 10) {

                        System.out.print("Nombre: ");
                        nombres[contador] = scanner.nextLine();

                        System.out.print("Mejor marca 2024: ");
                        marca2024[contador] = scanner.nextDouble();

                        System.out.print("Mejor marca 2025: ");
                        marca2025[contador] = scanner.nextDouble();

                        System.out.print("Mejor marca 2026: ");
                        marca2026[contador] = scanner.nextDouble();

                        scanner.nextLine();

                        contador++;

                        System.out.println("Participante inscrito correctamente.");

                    } else {
                        System.out.println("No hay plazas disponibles.");
                    }

                    break;

                case 2:

                    if (contador == 0) {
                        System.out.println("No hay participantes inscritos.");
                    } else {

                        System.out.println("\n===== LISTADO GENERAL =====");

                        for (int i = 0; i < contador; i++) {
                            System.out.println("Dorsal: " + (i + 1));
                            System.out.println("Nombre: " + nombres[i]);
                            System.out.println("Marca 2024: " + marca2024[i]);
                            System.out.println("Marca 2025: " + marca2025[i]);
                            System.out.println("Marca 2026: " + marca2026[i]);
                            System.out.println("-------------------------");
                        }
                    }

                    break;

                case 3:

                    if (contador == 0) {
                        System.out.println("No hay participantes inscritos.");
                    } else {

                        boolean usado[] = new boolean[contador];

                        System.out.println("\n===== ORDENADOS POR MARCA 2024 =====");

                        for (int i = 0; i < contador; i++) {

                            int mayor = -1;

                            for (int j = 0; j < contador; j++) {

                                if (usado[j] == false) {

                                    if (mayor == -1 || marca2024[j] > marca2024[mayor]) {
                                        mayor = j;
                                    }
                                }
                            }

                            usado[mayor] = true;

                            System.out.println((i + 1) + ". " +
                                    nombres[mayor] +
                                    " - " + marca2024[mayor]);
                        }
                    }

                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}