El patrón Composite sirve para construir algoritmos u objetos complejos a partir de otros más simples y similares entre sí,
gracias a la composición recursiva y a una estructura en forma de árbol. 
Dicho de otra forma, permite construir objetos complejos componiendo de forma recursiva objetos similares en una estructura de árbol.
Esto simplifica el tratamiento de los objetos creados, ya que al poseer todos ellos una interfaz común, se tratan todos de la misma manera.

![patron composite](https://user-images.githubusercontent.com/42417223/52320769-17f54680-299f-11e9-86d8-8a36287d1c8c.jpg)


Component: implementa un comportamiento común entre las clases y declara una interface de manipulación a los padres en la estructura recursiva.

Leaf: representa los objetos “hoja” (no poseen hijos). Define comportamientos para objetos primitivos.

Composite: define un comportamiento para objetos con hijos. Almacena componentes hijos. implementa operaciones de relación con los hijos.

Cliente: manipula objetos de la composición a través de Component.

Los clientes usan la interfaz de Component para interactuar con objetos en la estructura Composite. Si el receptor es una hoja, la interacción es directa. Si es un Composite, se debe llegar a los objetos “hijos”, y puede llevar a utilizar operaciones adicionales.

