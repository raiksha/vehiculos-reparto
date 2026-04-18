public class Furgon extends Vehiculo {
    private double volumenInterior; // en metros cúbicos

    // Constructor
    public Furgon(String patente, String marca, String modelo, double capacidadCarga, boolean disponible, double volumenInterior) {
        super(patente, marca, modelo, capacidadCarga, disponible); // llama al constructor de Vehiculo
        setVolumenInterior(volumenInterior); // usamos el setter para validar
    }

    // Getter y Setter específico
    public double getVolumenInterior() {
        return volumenInterior;
    }

    public void setVolumenInterior(double volumenInterior) {
        if (volumenInterior <= 0) {
            throw new IllegalArgumentException("El volumen interior debe ser positivo.");
        }
        this.volumenInterior = volumenInterior;
    }

    @Override
    public String getTipo() {
        return "Furgón";
    }

    // Sobrescritura del método mostrarDetalle (polimorfismo)
    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle(); // muestra patente, marca, modelo, capacidad, disponible
        System.out.println(" | Volumen interior: " + volumenInterior + " m³");
    }
}