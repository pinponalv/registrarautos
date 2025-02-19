
package com.repasopoo.concesionaria.persistencia;

import com.repasopoo.concesionaria.logica.Auto;
import com.repasopoo.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    AutoJpaController autoJpa = new AutoJpaController();

    public void agregarAuto(Auto auto) {
        autoJpa.create(auto);
    }

    public List<Auto> traerAutos() {
        return autoJpa.findAutoEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Auto traerAuto(int idAuto) {
        return autoJpa.findAuto(idAuto);
    }

    public void modificarAuto(Auto autos) {
        try {
            autoJpa.edit(autos);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    
    
}
