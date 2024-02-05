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
        for (Estudiante estudiante : listadoEstudiantes) {

            estudiante.getCarrera().enviarMaterial(estudiante);


            System.out.println("Información del envío para " + estudiante.nombre + ":");
            System.out.println("Material: " + estudiante.getCarrera().getEnvio().material);
            System.out.println("Saludo del director: " + estudiante.getCarrera().getEnvio().saludoDirector);

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

/*Se creo una clase abstracta que obtiene la carrera del estudiante para corregir la violacion al princpio OPEN/CLOSE.
se evidencia en la clase main y EnvioMaterial ya que para agregar otra carrera sería necesario editar ambas partes
del codigo. Se creo la interfaz MaterialPrograma con el metodo obtenerPrograma para que pueda ser implementada por
las clases específicas de cada programa y así asignarles los materiales correspondientes. Además, se modifico la clase
 EnvioMaterial convirtiendola en una interfaz de la que puede heredar la clase de envioMaterial para cada programa
 y tendran solamente la función de hacer efectivo el envio del correo.De esta manera tambien se
corrige el principio de responsabilidad única (EnvioMaterial se encarga unicamnete de hacer el envio y no de asignar
los materiales), sustitución de Liskov (herencia de metodos) segregación de interfaz (haciendo unidades más pequeñas para
cada tipo de programa) e inversión de dependencia (creando unidades de alto nivel de las cuales van a depender las clases
necesarias.
 */
