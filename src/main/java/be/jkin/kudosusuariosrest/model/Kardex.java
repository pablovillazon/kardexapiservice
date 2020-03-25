package be.jkin.kudosusuariosrest.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "kardex")
public class Kardex {
    private int id;
    private int idProducto;
    private Double precio;
    private int cantidad;
    private Date fecha;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "idProducto", nullable = false)
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Column(name = "precio", nullable = false)
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Column(name = "cantidad", nullable = false)
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Column(name = "fecha", nullable = false)
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}

