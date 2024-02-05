package co.edu.unisabana.clases.example.solid.main;

import java.util.List;

public class Informatica extends CarrerasPadre {

    String carrera = "Informatica";

    public String getCarrera() {
        return carrera;
    }

    @Override
    List<String> obtenerMaterias() {
        return List.of("Programacion", "Arquitectura", "Base de datos");
    }
}
