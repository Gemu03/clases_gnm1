package solid.service;

public class MaterialInformatica implements MaterialPrograma {


    @Override
    public String[] obtenerMateriales() {
        return new String[]{"Computador","Mouse"};
    }
}
