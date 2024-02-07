package co.edu.unisabana.clases.example.solid.modelo;

import co.edu.unisabana.clases.example.solid.service.EnvioCarreras;
import java.util.List;

public class Envio {
EnvioCarreras e = new EnvioCarreras() {
  @Override
  public List<String> getMaterial() {
      return material;
  }
};
  public List<String> material= e.getMaterial();
  @Override
  public String toString() {
    return "Envio{" +
        "material=" + material +'}';
  }
}
