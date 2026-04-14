import Vehiculo;
import Camion;
import Furgon;
import MotoReparto;


import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);
    List<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;
        llenarDatos();

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                //Registrar camion
                case 1 -> {
                    registrarCamion();
                }


                //Registrar furgon
                case 2 -> {
                    registrarFurgon();
                }


                //Registrar moto
                case 3 -> {
                    registrarMotoReparto();
                }


                //Mostrar todos los vehiculos
                case 4 -> {
                    mostrarTodosLosVehiculos();
                }


                //Mostrar vehiculos disponibles
                case 5 -> {
                    mostrarVehiculosDisponibles();
                }


                //Mostrar vehiculos no disponibles
                case 6 -> {
                    marcarVehiculoNoDisponible();
                }

                //Mostrar reporte general
                case 7 -> {
                    mostrarReporteGeneral();
                }

                //salir
                case 8 -> {
                    salir();
                }
                default -> System.out.println("Opción inválida. Elige entre 1 y 8.");

            }
        } while (opcion != 8);

        scanner.close();
    }

    public static void mostrarMenu() {

        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║      === SISTEMA DE VEHICULOS ===      ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║   1. Registrar Camion                  ║");
        System.out.println("║   2. Registrar Furgon                  ║");
        System.out.println("║   3. Registrar Moto de Reparto         ║");
        System.out.println("║   4. Mostrar todos los vehiculos       ║");
        System.out.println("║   5. Mostrar vehiculos disponibles     ║");
        System.out.println("║   6. Mostrar vehiculos no disponibles  ║");
        System.out.println("║   7. Mostrar reporte general           ║");
        System.out.println("║   8. Salir                             ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║           Elige una opción             ║");
        System.out.println("╚════════════════════════════════════════╝");

    }

    public static void registrarCamion() {

    }


    public static void salir() {
        System.out.println("\nCerrando sistema");
        System.out.println("Saliendo...");
    }


}