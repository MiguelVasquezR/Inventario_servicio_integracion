package mx.uv.Inventario.ORM;

import org.springframework.data.repository.CrudRepository;
import mx.uv.Inventario.Modelo.Item;

public interface IItem extends CrudRepository<Item, Integer> {
    Item findById(String id);
}
