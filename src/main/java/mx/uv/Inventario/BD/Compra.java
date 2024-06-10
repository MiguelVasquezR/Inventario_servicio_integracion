package mx.uv.Inventario.BD;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Compra {
    @Id
    private String id;
    private String numFactura;
    private String numOrden;
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
}
