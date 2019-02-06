Busca eliminar o reducir la redundancia cuando tenemos gran cantidad de objetos que contienen información idéntica, 
además de lograr un equilibrio entre flexibilidad y rendimiento (uso de recursos).

Este patrón quiere evitar el hecho de crear un gran número estados de objeto para representar a un sistema. 
Permite compartir estados para soportar un gran número de objetos pequeños aumentando la eficiencia en espacio.


![patron flyweight](https://user-images.githubusercontent.com/42417223/52320765-175cb000-299f-11e9-91ba-99c4721c45eb.jpg)

Flyweight: declara una interfaz a través de la cual los flyweights pueden recibir y actuar sobre los estados no compartidos.

ConcreteFlyweight: implementa la interfaz Flyweight y almacena los estados compartidos, si los hay. Un objeto ConcreteFlyweight debe ser compartible. Cualquier estado que almacene debe ser intrínseco; es decir, debe ser independiente de su contexto.

UnsharedConcreteFlyweight: no todas las subclases de Flyweight tienen por qué ser compartidas. La interfaz Flyweight permite que se comparta; no lo fuerza. Es común que los objetos de esta clase tengan hijos de la clase ConcreteFlyweight en algún nivel de su estructura.

FlyweightFactory: crea y gestiona los objetos flyweight. Garantiza que los objetos flyweight se comparten de forma apropiada. Cuando un cliente solicita un flyweight, el objeto de la clase FlyweightFactory proporciona una instancia existente, o crea una.

Client: contiene referencias a los flyweights. Calcula o almacena los estados no compartidos de los flyweights.
