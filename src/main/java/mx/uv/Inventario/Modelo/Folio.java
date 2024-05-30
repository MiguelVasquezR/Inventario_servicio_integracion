package mx.uv.Inventario.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Folio {
    @Id
    private String id;
    private String folio;
    private String idItem;

    public Folio(String folio, String idItem, String id) {
        this.id = id;
        this.folio = folio;
        this.idItem = idItem;
    }

    public Folio() {

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFolio() {
        return folio;
    }
    public void setFolio(String folio) {
        this.folio = folio;
    }
    public String getIdItem() {
        return idItem;
    }
    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    @Override
    public String toString() {
        return "Folio [id=" + id + ", folio=" + folio + ", idItem=" + idItem + "]";
    }

    
    
    
}
