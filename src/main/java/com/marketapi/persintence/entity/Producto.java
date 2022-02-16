package com.marketapi.persintence.entity;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity /*INDICA A JAVA QUE ESTA CLASE MAPEA A UNA TABLA EN LA BASE DE DATOS.*/
@Table(name = "productos")/*SI LA TABLA EN LA BD SE LLAMA DIFERENTE QUE LA CLASE SE AGREGA LA ANOTACION @Table(name="nombre_de_tabla_en_BD")*/
public class Producto{
    @Id /*INDICA QUE EL ATRIBUTO ES EL ID DE LA TABLA*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*INDICA QUE EL PROXIMO VALOR SE GENERA AUTOMATICAMENTE*/
    @Column(name = "id_producto")/*SI LA COLUMNA SE LLAMA DIFERENTE EN LA BD SE AGREGA LA ANOTACION @COLUMN(name="nombrecolumna")*/
    private Integer idProducto;

    private String nombre;
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name="cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;
    @Column(name="precio_venta")

    private Float precioVenta;

    @ManyToOne /*REPRESENTA LA RELACION UNO A MUCHOS DE UNA BASE DE DATOS*/
    @JoinColumn(name = "id_categoria", insertable = false,updatable = false)
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Float getPrecioVenta() {
        return precioVenta;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }
}
