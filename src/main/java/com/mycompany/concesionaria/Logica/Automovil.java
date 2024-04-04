
package com.mycompany.concesionaria.Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String marca;
    private String modelo;
    private String color;
    private String motor;
    private String patente;
    private int cant_P;

    public Automovil() {
    }

    public Automovil(int id, String marca, String modelo, String color, String motor, String patente, int cant_P) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.patente = patente;
        this.cant_P = cant_P;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMotor() {
        return motor;
    }

    public String getPatente() {
        return patente;
    }

    public int getCant_P() {
        return cant_P;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCant_P(int cant_P) {
        this.cant_P = cant_P;
    }
    
}
