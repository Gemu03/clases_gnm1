Corrección de principios SOLID

1. Open/Close

En clase main se evidencio el incumplimiento de este principio dentro del metodo que mostraba las materias correspondientes a cada programa. Para esto se creo una clase abstracta encargada de definir los metodos 
que heredan las clases de cada carrera para obtener los materiales correspondientes. Por otro lado, en la clase EnvioMaterial 
