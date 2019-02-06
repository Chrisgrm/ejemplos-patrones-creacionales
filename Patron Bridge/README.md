Desacopla una abstracción de su implementación, de manera que ambas puedan variar de forma independiente. 
¿Que quiere decir exactamente esto? Una abstracción se refiere a un comportamiento que una clase debería implementar, 
ya sea porque esta obligada por una interface o una clase abstracta. 
Por otro lado, con implementación se refiere a colocarle lógica a dicha obligación.

![patron bridge](https://user-images.githubusercontent.com/42417223/52320768-17f54680-299f-11e9-8c3f-6a47bb726a4f.jpg)

Abstraction: define una interface abstracta. Mantiene una referencia a un objeto de tipo Implementor.

RefinedAbstraction: extiende la interface definida por Abstraction

Implementor: define la interface para la implementación de clases. Esta interface no se tiene que corresponder exactamente con la interface de Abstraction; de hecho, las dos interfaces pueden ser bastante diferentes entre sí. Típicamente la interface Implementor provee sólo operaciones primitivas, y Abstraction define operaciones de alto nivel basadas en estas primitivas.

ImplementadorConcreto: implementa la interface de Implementor y define su implementación concreta.

Abstraction emite los pedidos de los clientes a su objeto Implementor. El cliente no tiene que conocer los detalles de la implementación.
