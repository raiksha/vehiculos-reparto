public class Camion  extends vehiculo{

   //encapsulamiento
    private intnumEjes;

    // contructor
    public Camion(String patente, String marca, String modelo, double velocidad, double capacidadCarga, int numEjes) {
        super(patente, marca, modelo, capacidadCarga);
        setNumEjes(numEjes);
    }
    // getter y setter
    public int getNumEjes() {
    return numEjes;}
}
    public void setNumEjes(int numEjes) {
        if (numEjes <== 0) {
            throw new IllegalArgumentException("El camion debe tener al menos un eje.");
        }
        this.setNumEjes = numEjes;
    }
    public void mostrarDetalles() {
    super.mostrarDetalles();
        System.out.println(" | Ejes:" + numEjes " [Tipo: CAMION]");
    }

