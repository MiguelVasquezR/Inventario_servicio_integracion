package mx.uv.Inventario.ORM;

import org.springframework.data.repository.CrudRepository;
import mx.uv.Inventario.Modelo.Inventario;

public interface IInventario extends CrudRepository<Inventario, Integer> {
    Inventario findById(String id);
}
