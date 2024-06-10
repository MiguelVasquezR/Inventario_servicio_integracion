package mx.uv.Inventario.BD;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IProducto extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdCompra(String idCompra);
    Producto findByFolio(String folio);
}

