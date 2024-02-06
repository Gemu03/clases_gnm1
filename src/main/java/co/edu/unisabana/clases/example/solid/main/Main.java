package co.edu.unisabana.clases.example.solid.main;

import co.edu.unisabana.clases.example.solid.modelo.Estudiante;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
            new Estudiante("Daniel", new Informatica()),
            new Estudiante("Monica", new Administracion()),
            new Estudiante("Liliana", new Industrial())
        };
        verMateriasEstudiantes(listadoEstudiantes);

        for (Estudiante estudiante : listadoEstudiantes) {
            EnvioMaterial material = new EnvioMaterial();
            material.enviarMaterialEstudiante(estudiante);
        }
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("\nEstudiante: " + estudiante.nombre +
                                " Carrera: " + estudiante.carrera.getCarrera());
            System.out.println(estudiante.carrera.obtenerMaterias());
        }

    }
}
