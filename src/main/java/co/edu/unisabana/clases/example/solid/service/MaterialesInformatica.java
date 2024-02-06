package co.edu.unisabana.clases.example.solid.service;

import java.util.ArrayList;
import java.util.List;

public class MaterialesInformatica implements EnvioCarreras{


    @Override
    public List<String> getMaterial() {
        List<String> materiales = new ArrayList<>();
        materiales.add("Computador");
        materiales.add("Mouse");
        return materiales;
    }

    @Override
    public String getSaludoDirector() {
        return "Jenny envia saludos";
    }
}
