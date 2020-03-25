package be.jkin.kudosusuariosrest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class KardexMessage implements Serializable {

    private final String idProducto;
    private final String cantidad;
    private final String precio;
    private final String fecha;

    public KardexMessage(@JsonProperty("id") String idProd,
                         @JsonProperty("cantidad") String cantidad,
                         @JsonProperty("precio") String precio,
                         @JsonProperty("fecha") String fecha){
        this.idProducto = idProd;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString()
    {
        return "KudosMessage{"+
                "id= '" + idProducto +"'"+
                "cantidad = '"+ cantidad  +"'"+
                "precio = '"+ precio +"'"+
                "fecha = '"+ fecha+"'";
    }

}
