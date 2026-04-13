import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Vehiculo> vehiculos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número entero.");
            }
        }
    }

    private static double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número válido.");
            }
        }
    }

    private static String leerStringNoVacio(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String valor = scanner.nextLine().trim();
            if (!valor.isEmpty()) return valor;
            System.out.println("Error: este campo no puede estar vacío.");
        }
    }

    private static boolean patenteExiste(String patente) {
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equalsIgnoreCase(patente)) {
                return true;
            }
        }
        return false;
    }

    private static String leerPatenteUnica() {
        while (true) {
            String patente = leerStringNoVacio("Patente: ");
            if (!patenteExiste(patente)) {
                return patente;
            }
            System.out.println(" Error: ya existe un vehículo con esa patente. Ingrese otra.");
        }
    }

    // Tu método registrarFurgon
    private static void registrarFurgon() {
        System.out.println("\n--- Registro de Furgón ---");
        String patente = leerPatenteUnica();
        String marca = leerStringNoVacio("Marca: ");
        String modelo = leerStringNoVacio("Modelo: ");
        double capacidad = leerDouble("Capacidad de carga (kg): ");
        double volumen = leerDouble("Volumen interior (m³): ");

        try {
            Furgon furgon = new Furgon(patente, marca, modelo, capacidad, volumen);
            vehiculos.add(furgon);
            System.out.println(" Furgón registrado con éxito.");
        } catch (IllegalArgumentException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }

    // NOTA: El main y el menú serán agregados por el compañero encargado.
}