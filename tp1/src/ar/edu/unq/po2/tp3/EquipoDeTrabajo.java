package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Collection;

public class EquipoDeTrabajo {
    private String nombre;
    private Collection <Persona> integrantes;

    public EquipoDeTrabajo(String nombre){
        this.nombre = nombre;
        this.integrantes = new ArrayList<Persona>();
    }

    public String getNombre(){
        return this.nombre;
    }
    public double promedioEdad(){
        int sumaDeEdades = 0;
        for (Persona persona : this.integrantes){
            sumaDeEdades = sumaDeEdades + persona.getEdad();
        }
        return sumaDeEdades / this.integrantes.size();
    }
    public void agregarIntegrante(Persona persona){
        this.integrantes.add(persona);
    }
}
