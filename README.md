Corrección de principios SOLID

En clase main se evidencio el incumplimiento de este principio dentro del metodo que mostraba las materias correspondientes a cada programa. Para esto se creo una clase abstracta encargada de definir los metodos 
que heredan las clases de cada carrera para obtener los materiales correspondientes. Por otro lado, en la clase EnvioMaterial se estaba comprobando que materiales se debían enviar con un modulo if por carrera por lo que se opto por incluir una infertaz que tuviera los metodos para enviar los materiales y la implementan las clases asignadas para definir que se requiere para cada programa. Así tambien se aplica el principio de Interface Sgregation y de Dependency Inversion dejando que los modulos de alto nivel utilicen unidades de las que puedan implementar los metodos directamente. Con las correcciones los principios de Liskov y Single Responsability quedan cubiertos.
