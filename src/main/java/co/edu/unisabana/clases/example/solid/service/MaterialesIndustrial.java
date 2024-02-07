package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.main.Industrial;

import java.util.ArrayList;
import java.util.List;

public class MaterialesIndustrial extends Industrial implements EnvioCarreras {
    @Override
    public List<String> getMaterial() {
        List<String> materiales = new ArrayList<>();
        materiales.add("Cuaderno");
        materiales.add("Calculadora");
        return materiales;
    }

}
