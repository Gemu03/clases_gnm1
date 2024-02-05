package co.edu.unisabana.clases.example.solid.main;

import java.util.List;

public class Industrial extends CarrerasPadre {

    String carrera = "Industrial";

    public String getCarrera() {
        return carrera;
    }

    @Override
    List<String> obtenerMaterias() {
        return List.of("Fisica", "Quimica", "Matematicas");
    }
}
