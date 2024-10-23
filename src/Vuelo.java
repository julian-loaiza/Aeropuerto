
import java.util.Date;

public class Vuelo {
    private int idVuelo;
    private Date fecha;
    private int plazasVacias;
    private ProgramaVuelo programaVuelo;
    private ModeloAvion modeloAvion;

    public Vuelo(int idVuelo, Date fecha, int plazasVacias, ProgramaVuelo programaVuelo, ModeloAvion modeloAvion) {
        this.idVuelo = idVuelo;
        this.fecha = fecha;
        this.plazasVacias = plazasVacias;
        this.programaVuelo = programaVuelo;
        this.modeloAvion = modeloAvion;
    }

    public int getIdVuelo() { return idVuelo; }
    public void setIdVuelo(int idVuelo) { this.idVuelo = idVuelo; }
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public int getPlazasVacias() { return plazasVacias; }
    public void setPlazasVacias(int plazasVacias) { this.plazasVacias = plazasVacias; }
    public ProgramaVuelo getProgramaVuelo() { return programaVuelo; }
    public void setProgramaVuelo(ProgramaVuelo programaVuelo) { this.programaVuelo = programaVuelo; }
    public ModeloAvion getModeloAvion() { return modeloAvion; }
    public void setModeloAvion(ModeloAvion modeloAvion) { this.modeloAvion = modeloAvion; }

    @Override
    public String toString() {
        return "Vuelo{" +
                "idVuelo=" + idVuelo +
                ", fecha=" + fecha +
                ", plazasVacias=" + plazasVacias +
                ", programaVuelo=" + programaVuelo +
                ", modeloAvion=" + modeloAvion +
                '}';
    }
}
