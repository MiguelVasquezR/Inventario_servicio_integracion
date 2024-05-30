package mx.uv.Inventario.ORM;

import org.springframework.data.repository.CrudRepository;

import mx.uv.Inventario.Modelo.Folio;

public interface IFolio extends CrudRepository<Folio, Integer> {
    Folio findByFolio(String folio);
    
}
