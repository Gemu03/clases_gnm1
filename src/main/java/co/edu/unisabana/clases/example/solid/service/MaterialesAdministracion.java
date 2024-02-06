package co.edu.unisabana.clases.example.solid.service;

import java.util.ArrayList;
import java.util.List;

public class MaterialesAdministracion implements EnvioCarreras{


    @Override
    public List<String> getMaterial() {
        List<String> materiales = new ArrayList<>();
        materiales.add("iPad");
        materiales.add("Libro de administración");
        return materiales;
    }

    @Override
    public String getSaludoDirector() {
        return "Andres envia saludos";
    }
}
