package co.edu.unisabana.clases.example.solid.modelo;

import co.edu.unisabana.clases.example.solid.main.CarrerasPadre;

public class Estudiante {

    public String nombre;
    public CarrerasPadre carrera;
    public Object getCarrera;

    public Estudiante(String nombre, CarrerasPadre carrera) {
        this.nombre = nombre;
        this.carrera = carrera;

    }

    void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }


    public CarrerasPadre getCarrera(){
        return carrera;
    }
}

