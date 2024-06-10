package mx.uv.Inventario.BD;

import org.springframework.data.repository.CrudRepository;

public interface ICompra extends CrudRepository<Compra, Integer>{
    Compra findByNumOrden(String numOrden);
    
}
