public static void marcarVehiculo(){

    System.out.println("=== MARCAR VEHICULO COMO NO DISPONIBLE ===\n");

    List<String> disponibles = new ArrayList<>();
    for (String vehiculo : nombreVehiculos) {
        if (estadoVehiculo.get(vehiculo).equals("Disponible")) {
            disponibles.add(vehiculo);
        }
    }

    if (disponibles.isEmpty()) {
        System.out.println(" No hay vehiculos disponibles.");
        System.out.println("\nPresione Enter para volver al menú...");
        scanner.nextLine();
        return;
    }
    System.out.println("Vehiculos disponibles:");
    for (int i = 0; i < disponibles.size(); i++) {
        String vehiculos = disponibles.get(i);
        String  = marcaVehiculo.get(vehiculo);
        System.out.println((i + 1) + ". " + animal + " (" + especie + ")");
    }

    System.out.print("\nElige el número del vehiculo a marcar: ");
    int seleccion = scanner.nextInt();
    scanner.nextLine(); // limpiar buffer

    if (seleccion < 1 || seleccion > disponibles.size()) {
        System.out.println(" Selección no válida.");
        System.out.println("\nPresione Enter para volver al menú...");
        scanner.nextLine();
        return;
    }
