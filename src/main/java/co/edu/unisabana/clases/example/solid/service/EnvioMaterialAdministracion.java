package solid.service;

import solid.modelo.Envio;
import solid.modelo.Estudiante;

import java.util.ArrayList;
import java.util.Arrays;

public class EnvioMaterialAdministracion implements EnvioMaterial {
    @Override
    public Envio enviarMaterial(Estudiante estudiante) {
        MaterialPrograma material = new MaterialAdmininstracion();
        String[] materiales = material.obtenerMateriales();

        Envio envio = new Envio();
        envio.material = new ArrayList<>(Arrays.asList(materiales));
        envio.saludoDirector = "Carlos envía saludos";

        EmailOutlook email = new EmailOutlook();
        email.enviarEmail(envio);
        return envio;
    }
}

