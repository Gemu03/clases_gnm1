Corrección de principios SOLID

En la clase Main se evidenció el incumplimiento del principio Open/Close dentro del método que mostraba las materias correspondientes a cada programa, en el cual se comprobaba qué materias debían ver los estudiantes con un módulo if por carrera. Para esto, se creó una clase abstracta encargada de definir los métodos que heredan las clases de cada carrera para obtener las materias correspondientes. Por otro lado, en la clase EnvioMaterial ocurría lo mismo que en el Main, en el método que enviaba información a los estudiantes sobre los materiales necesarios, por lo que se optó por incluir una interfaz que tuviera los métodos para enviar toda la información firmada por el director y la implementan las clases asignadas para definir qué se requiere para cada programa. Así también se aplica el principio de Interface Segregation y de Dependency Inversion, dejando que los módulos de alto nivel utilicen unidades de las que puedan implementar los métodos directamente. Con las correcciones, los principios de Liskov y Single Responsibility quedan cubiertos.
