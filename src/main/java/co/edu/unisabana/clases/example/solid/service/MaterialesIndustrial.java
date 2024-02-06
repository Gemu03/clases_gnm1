package co.edu.unisabana.clases.example.solid.service;

import java.util.ArrayList;
import java.util.List;

public class MaterialesIndustrial implements EnvioCarreras{
    @Override
    public List<String> getMaterial() {
        List<String> materiales = new ArrayList<>();
        materiales.add("Cuaderno");
        materiales.add("Calculadora");
        return materiales;
    }

    @Override
    public String getSaludoDirector() {
        return "Roy envía saludos";
    }
}
