
public class ProgramaVuelo {
    private String numeroVuelo;
    private String lineaAerea;
    private String diasOperacion;

    public ProgramaVuelo(String numeroVuelo, String lineaAerea, String diasOperacion) {
        this.numeroVuelo = numeroVuelo;
        this.lineaAerea = lineaAerea;
        this.diasOperacion = diasOperacion;
    }

    public String getNumeroVuelo() { return numeroVuelo; }
    public void setNumeroVuelo(String numeroVuelo) { this.numeroVuelo = numeroVuelo; }
    public String getLineaAerea() { return lineaAerea; }
    public void setLineaAerea(String lineaAerea) { this.lineaAerea = lineaAerea; }
    public String getDiasOperacion() { return diasOperacion; }
    public void setDiasOperacion(String diasOperacion) { this.diasOperacion = diasOperacion; }

    @Override
    public String toString() {
        return "ProgramaVuelo{" +
                "numeroVuelo='" + numeroVuelo +
                ", lineaAerea='" + lineaAerea +
                ", diasOperacion='" + diasOperacion +
                '}';
    }
}
