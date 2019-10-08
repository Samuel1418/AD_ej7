/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author oracle
 */
public class Product {
    private String codigo;
    private String descripcion;
    private double prezo;

    public Product(){}
    
    public Product(String codigo, String descripcion, double prezo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricion() {
        return descripcion;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricion(String descricion) {
        this.descripcion = descricion;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    
}