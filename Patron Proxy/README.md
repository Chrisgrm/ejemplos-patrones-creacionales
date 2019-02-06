El patrón Proxy se utiliza como intermediario para acceder a un objeto, permitiendo controlar el acceso a él.
Para ello obliga que las llamadas a un objeto ocurran indirectamente a través de un objeto proxy, que actúa como un sustituto del 
objeto original, delegando luego las llamadas a los métodos de los objetos respectivos


![patron proxy](https://user-images.githubusercontent.com/42417223/52320766-175cb000-299f-11e9-8f1e-b25117bb1bbe.jpg)

Subject: interfaz o clase abstracta que proporciona un acceso común al objeto real y su representante (proxy).

Proxy: mantiene una referencia al objeto real. Controla la creación y acceso a las operaciones del objeto real.

RealSubject: define el objeto real representado por el Proxy.

Cliente: solicita el servicio a través del Proxy y es éste quién se comunica con el RealSubject.

Ejemplo

https://github.com/Chrisgrm/ejemplos-patrones-creacionales/blob/master/Patron%20Proxy/proxy.py
