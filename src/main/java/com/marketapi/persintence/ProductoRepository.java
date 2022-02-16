package com.marketapi.persintence;

import com.marketapi.persintence.crud.ProductoCrudRepository;
import com.marketapi.persintence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository /*LE INDICA A SPRING QUE ESTA CLASE INTERECTUARA CONLA BASE DE DATOS*/
/*EN ESTA CLASE SE IMPLEMENTAN LOS METODOS DE LA INTERFASE PRODUCTOCRUDREPOSITORY*/
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto>getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
    public List<Producto>getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }
    public List<Producto>getByCategoriaOrderByNameAsc(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    public Optional<List<Producto>>getEscasos(int cantidad,boolean estado){
        return productoCrudRepository.findbyCantidadStockLessThanAndEstado(cantidad, estado);
    }
    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }
    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }
    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }
}
