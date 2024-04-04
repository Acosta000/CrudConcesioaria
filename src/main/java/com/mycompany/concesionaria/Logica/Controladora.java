
package com.mycompany.concesionaria.Logica;

import com.mycompany.concesionaria.Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    public void agregarAuto(String marca, String modelo, String motor, String color, String patente, int cantPuertas) {
       
        Automovil auto = new Automovil();
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCant_P(cantPuertas);
        
        controlPersis.agregarAuto(auto);
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAutos(int idAuto) {
       return controlPersis.traerAuto(idAuto);
    }

    public void editarAuto(Automovil auto) {
        controlPersis.editarAuto(auto);
    }
    
}
