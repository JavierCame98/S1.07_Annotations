# S1.07_Annotations

## Enunciat del exercici

Exercici 1 – Override
Crea una jerarquia d’objectes amb tres classes: Treballador, TreballadorOnline i TreballadorPresencial.
La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el nombre d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de sobreescriure, emprant @Override. Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació @Override.
En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor d'un atribut static anomenat benzina que afegirem en aquesta classe.
En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe TreballadorOnline.

Exercici 2 – Deprecated
Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els warnings per ser obsolets.

## Features

Object-oriented inheritance with base and derived classes.
Method overriding using the @Override annotation.
Use of static attributes and class constants.
Demonstration of deprecated methods using @Deprecated.
Suppression of deprecation warnings with @SuppressWarnings.
Clear separation of behavior between online and on-site workers.

 ## Technologies

Backend: Java
Build Tool: Maven or Gradle (depending on project setup)

## Installation & Execution

Clone the repositorY
Open the project
Import the project into your preferred IDE (IntelliJ IDEA, Eclipse, or VS Code).
Run the application
Locate the Main class.
Execute the main() method and ExteranalClass () to see the overridden methods in action.

## Demo
You can add screenshots of the console output demonstrating:
Salary calculation for online and on-site workers.
Invocation of deprecated methods without warnings.

## Diagrams & Technical Decisions

The project follows a hierarchical inheritance model where common attributes and behavior are defined in a base class.
Method overriding is used to adapt salary calculation logic in subclasses.
Constants and static fields are used to represent fixed costs such as fuel and internet fees.
Deprecated methods are intentionally kept to demonstrate backward compatibility and compiler warning management.
Annotations are used to improve code readability, safety, and maintainability.
