package solid.service;

public class MaterialAdmininstracion  implements MaterialPrograma{


    @Override
    public String[] obtenerMateriales() {
        return new String[]{"iPad", "Libro de administración"};
    }
}
