package model;

public class Historicos implements java.io.Serializable {

    private Integer idHistorico;
    private String id;
    private String fecha;
    private String tratamiento;
    private String precio;
    private String recomendaciones;
    private String producto;

    public Historicos() {
    }

    public Historicos(String id, String fecha, String tratamiento, String precio, String recomendaciones, String producto) {
        this.id = id;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.precio = precio;
        this.recomendaciones = recomendaciones;
        this.producto = producto;
    }

    public Integer getIdHistorico() {
        return this.idHistorico;
    }

    public void setIdHistorico(Integer idHistorico) {
        this.idHistorico = idHistorico;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTratamiento() {
        return this.tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getPrecio() {
        return this.precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getRecomendaciones() {
        return this.recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getProducto() {
        return this.producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Historicos [idHistorico=" + idHistorico + ", id=" + id + ", fecha=" + fecha + ", tratamiento=" + tratamiento
               + ", precio=" + precio + ", recomendaciones=" + recomendaciones + ", producto=" + producto + "]";
    }
}
