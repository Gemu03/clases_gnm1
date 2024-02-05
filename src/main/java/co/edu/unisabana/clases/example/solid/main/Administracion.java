package co.edu.unisabana.clases.example.solid.main;

import java.util.List;

public class Administracion extends CarrerasPadre {

    String carrera = "Administracion";

    public String getCarrera() {
        return carrera;
    }

    @Override
    List<String> obtenerMaterias() {
        return List.of("Negocios", "Administracion I", "Historia de la Administracion");
    }
}
