package co.edu.unisabana.clases.example.solid.service;

import co.edu.unisabana.clases.example.solid.main.Informatica;

import java.util.ArrayList;
import java.util.List;

public class MaterialesInformatica extends Informatica implements EnvioCarreras {


    @Override
    public List<String> getMaterial() {
        List<String> materiales = new ArrayList<>();
        materiales.add("Computador");
        materiales.add("Mouse");
        return materiales;
    }

}
