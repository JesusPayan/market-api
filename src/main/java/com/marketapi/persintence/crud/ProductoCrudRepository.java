package com.marketapi.persintence.crud;

import com.marketapi.persintence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/*INTERFASE PARA DECLARAR LOS METODOS QUE SE IMPLEMENTARAN EN LA CASE PRODUCTO REPOSITORY*/
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

    /*QUERY METHOD PARA MOSTRAR LOS PRODUCTOS QUE PERTENECEN A UNA CATEGORIA.*/
    List<Producto> findByIdCategoria(int idCategoria);
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findbyCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);
}
