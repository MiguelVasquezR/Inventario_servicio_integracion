package mx.uv.Inventario.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventario {
    @Id
    private String id;
    private String numFactura;
    private String numOrden;
    private String dependencia;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNumFactura() {
        return numFactura;
    }
    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }
    public String getNumOrden() {
        return numOrden;
    }
    public void setNumOrden(String numOrden) {
        this.numOrden = numOrden;
    }
    public String getDependencia() {
        return dependencia;
    }
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    
}
