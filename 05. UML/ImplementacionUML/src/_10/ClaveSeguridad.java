package _10;

import java.util.Date;

public class ClaveSeguridad {
    private String codigo;
    private Date ultimaModificacion;

    public ClaveSeguridad(String codigo, Date ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(Date ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" +
                "codigo='" + codigo + '\'' +
                ", ultimaModificacion=" + ultimaModificacion +
                '}';
    }
}