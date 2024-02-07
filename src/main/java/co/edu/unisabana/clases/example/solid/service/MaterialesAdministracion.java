package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.main.Administracion;

import java.util.ArrayList;
import java.util.List;

public class MaterialesAdministracion extends Administracion implements EnvioCarreras {


    @Override
    public List<String> getMaterial() {
        List<String> materiales = new ArrayList<>();
        materiales.add("iPad");
        materiales.add("Libro de administración");
        return materiales;
    }

}
