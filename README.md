Corrección de principios SOLID

En la clase Main se evidenció el incumplimiento de este principio dentro del método que mostraba las materias correspondientes a cada programa. Para esto se creó una clase abstracta encargada de definir los métodos que heredan las clases de cada carrera para obtener los materiales correspondientes. Por otro lado, en la clase EnvioMaterial se estaba comprobando qué materiales se debían enviar con un módulo if por carrera, por lo que se optó por incluir una interfaz que tuviera los métodos para enviar los materiales y la implementan las clases asignadas para definir qué se requiere para cada programa. Así también se aplica el principio de Interface Segregation y de Dependency Inversion, dejando que los módulos de alto nivel utilicen unidades de las que puedan implementar los métodos directamente. Con las correcciones, los principios de Liskov y Single Responsibility quedan cubiertos.
