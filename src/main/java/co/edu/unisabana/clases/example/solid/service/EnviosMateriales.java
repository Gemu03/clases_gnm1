package solid.service;

import solid.main.CarrerasPadre;
import solid.modelo.Estudiante;

public class EnviosMateriales {

    private CarrerasPadre carrera;


    public EnviosMateriales(CarrerasPadre carrera) {
        this.carrera = carrera;
    }

    public static CarrerasPadre obtenerEnvioMaterial(CarrerasPadre carrera) {
        return carrera;
    }

    public void envioMaterialEstudiante(Estudiante estudiante) {
        String nombreCarrera = carrera.getCarrera();
        System.out.println("Enviando materiales para " + nombreCarrera);

    }
}
