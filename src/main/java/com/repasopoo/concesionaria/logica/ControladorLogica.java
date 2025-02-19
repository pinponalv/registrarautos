package com.repasopoo.concesionaria.logica;

import com.repasopoo.concesionaria.persistencia.ControladorPersistencia;
import java.util.List;

public class ControladorLogica {
    ControladorPersistencia controladorPersis = new ControladorPersistencia();

    public void agregarAuto(String modelo, String marca, String motor, String color, String patente, int puertas) {
        
        Auto auto = new Auto();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setNumPlacas(patente);
        auto.setCantidadPuertas(puertas);
        
        controladorPersis.agregarAuto(auto);
    }

    public List<Auto> traerAutos() {
        return controladorPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controladorPersis.borrarAuto(idAuto);
    }

    public Auto traerAuto(int idAuto) {
       return controladorPersis.traerAuto(idAuto);
    }


    public void modificarAuto(Auto autos, String modelo, String marca, String motor, String color, String patente, int puertas) {
        autos.setModelo(modelo);
        autos.setMarca(marca);
        autos.setMotor(motor);
        autos.setColor(color);
        autos.setNumPlacas(patente);
        autos.setCantidadPuertas(puertas);
        
        controladorPersis.modificarAuto(autos);
    }

    
}
