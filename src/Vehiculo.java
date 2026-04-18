public class Vehiculo {
    // Atributos encapsulados
    private String patente;
    private String marca;
    private String modelo;
    private double capacidadCarga;
    private boolean disponible;

    // Constructor
    public Vehiculo(String patente, String marca, String modelo, double capacidadCarga, boolean disponible) {
        // Usamos los setters para aprovechar las validaciones desde el inicio
        setPatente(patente);
        setMarca(marca);
        setModelo(modelo);
        setCapacidadCarga(capacidadCarga);
        this.disponible = true; // Por defecto, todo vehículo inicia disponible
    }

    // --- Getters y Setters con Validaciones ---

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede estar vacía.");
        }
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede estar vacío.");
        }
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        if (capacidadCarga < 0) {
            throw new IllegalArgumentException("La capacidad de carga no puede ser negativa.");
        }
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Métodos que serán sobrescritos por las clases hijas (Polimorfismo).
     */

    public String getTipo() {
        return "Vehículo";
    }
    public void mostrarDetalle() {
    System.out.println("Vehículo -> " + getTipo()); // línea 1: el tipo lo pone la hija
    System.out.print("    Patente: " + patente + 
                     " | Marca: " + marca + 
                     " | Modelo: " + modelo + 
                     " | Capacidad: " + capacidadCarga + "kg" +
                     " | Estado: " + (disponible ? "Disponible" : "No disponible"));
}
}