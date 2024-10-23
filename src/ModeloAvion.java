
public class ModeloAvion {
    private String codigoModelo;
    private int capacidad;

    public ModeloAvion(String codigoModelo, int capacidad) {
        this.codigoModelo = codigoModelo;
        this.capacidad = capacidad;
    }

    public String getCodigoModelo() { return codigoModelo; }
    public void setCodigoModelo(String codigoModelo) { this.codigoModelo = codigoModelo; }
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    @Override
    public String toString() {
        return "ModeloAvion{" +
                "codigoModelo='" + codigoModelo + ", capacidad=" + capacidad +
                '}';
    }
}
