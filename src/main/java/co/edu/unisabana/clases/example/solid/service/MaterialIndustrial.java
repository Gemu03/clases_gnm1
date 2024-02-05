package solid.service;

public class MaterialIndustrial implements MaterialPrograma {


    @Override
    public String[] obtenerMateriales() {
        return new String[]{"Cuaderno","Calculadora"};
    }
}
