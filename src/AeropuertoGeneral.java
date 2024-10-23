
public class AeropuertoGeneral {
    private String codigo;
    private String nombre;
    private String ciudad;
    private String pais;

    public AeropuertoGeneral(String codigo, String nombre, String ciudad, String pais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "codigo='" + codigo +
                ", nombre='" + nombre +
                ", ciudad='" + ciudad +
                ", pais='" + pais +
                '}';
    }
}
