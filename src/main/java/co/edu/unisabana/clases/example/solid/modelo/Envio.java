package co.edu.unisabana.clases.example.solid.modelo;

import co.edu.unisabana.clases.example.solid.service.EnvioCarreras;
import co.edu.unisabana.clases.example.solid.service.EnvioMaterial;

import java.util.List;

public class Envio {
EnvioCarreras e = new EnvioCarreras() {
  @Override
  public List<String> getMaterial() {
      return material;
  }
};
  public List<String> material= e.getMaterial();
  public String saludoDirector;

  @Override
  public String toString() {
    return "Envio{" +
        "material=" + material +'}';
  }
}
