El patrón Facade (fachada) tiene la característica de ocultar la complejidad de interactuar con un conjunto de subsistemas proporcionando 
una interface de alto nivel, la cual se encarga de realizar la comunicación con todos los subsistemas necesarios.
La fachada es una buena estrategia cuando requerimos interactuar con varios subsistemas para realizar una operación concreta ya que 
se necesita tener el conocimiento técnico y funcional para saber qué operaciones de cada subsistema tenemos que ejecutar y en qué orden, 
lo que puede resultar muy complicado cuando los sistemas empiezan a crecer demasiado

![patron fachada](https://user-images.githubusercontent.com/42417223/52320770-17f54680-299f-11e9-87f2-e85d25f924e5.png)

IFacade: Proporciona una interface de alto nivel que oculta la complejidad de interactuar con varios sistemas para realizar una operación.

Client: Sistema o evento que interactúa con la fachada.

DefaultFacadeImpl: Representa la implementación de IFacade y se encarga de comunicarse con todos los subsistemas.

Subsystems: Representa módulos o subsistemas que exponen interfaces para comunicarse con ellos.

