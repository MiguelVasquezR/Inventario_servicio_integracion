package mx.uv.Inventario.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item{
    @Id
    private String id;
    private String nombre;
    private int cantidad;
    private double precio;
    private String idInventario;

    public Item(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Item() {

    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getIdInventario() {
        return idInventario;
    }
    public void setIdInventario(String idInventario) {
        this.idInventario = idInventario;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    
}
