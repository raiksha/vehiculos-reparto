public class Camion extends Vehiculo {

   //encapsulamiento
    private int numEjes;

    // contructor
    public Camion(String patente, String marca, String modelo, double capacidadCarga, boolean disponible, int numEjes) {
        super(patente, marca, modelo, capacidadCarga, disponible);
        setNumEjes(numEjes);
    }
    
    // getter y setter
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        if (numEjes <= 0) {
            throw new IllegalArgumentException("El camion debe tener al menos un eje.");
        }
        this.numEjes = numEjes;
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println(" | Ejes:" + numEjes + " [Tipo: CAMION]");
    }
}