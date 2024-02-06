package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.modelo.Envio;
import co.edu.unisabana.clases.example.solid.modelo.Estudiante;

public class EnvioMaterial {

  public void enviarMaterialEstudiante(Estudiante estudiante) {

    Envio envio = new Envio();

    envio.saludoDirector = estudiante.carrera.getSaludoDirector();
    EmailOutlook email = new EmailOutlook();
    email.enviarEmail(envio);
    }
  }
