# Examen de Programación: Sistema de Puntuación de Golf

## Descripción

Desarrollar un sistema en Java para calcular las puntuaciones de un partido de golf siguiendo las modalidades _Stroke Play_ y _Stableford_. El sistema debe procesar los golpes realizados por varios jugadores en un recorrido de 18 hoyos y calcular sus puntuaciones según ambas modalidades.

![Golf Score Card](./doc/golf-scorecard-ringway.png)

## Clases proporcionadas

Se proporcionan dos clases base para el desarrollo:

### `App.java`
Contiene el programa principal con ejemplos de uso del sistema, incluyendo:
- Creación de jugadores y sus recorridos
- Ejemplos de puntuaciones en ambas modalidades
- Salida esperada del programa

### `Course.java`
Clase que gestiona el campo de golf y los recorridos de los jugadores, proporcionando:
- Almacenamiento de golpes por jugador y hoyo
- Métodos para añadir y recuperar recorridos de jugadores

## Requisitos

1. **Gestión de Jugadores**
   - Implementar una clase `Player` que almacene:
     - Iniciales del jugador (String)
     - Hándicap (Byte)
     - Puntuación total (Short)
     - Puntos Stableford (Short)

2. **Tarjeta de Puntuación**
   - Implementar una clase `ScoreCard` que gestione:
     - Hasta 4 jugadores (A, B, C, D)
     - Lista de hoyos con su par correspondiente
     - Referencia al campo (Course)

3. **Modalidades de Juego**
   - Implementar el patrón Strategy para las dos modalidades de puntuación:
     - **Stroke Play**: suma total de golpes
     - **Stableford**: puntos según la diferencia con el par del hoyo
       * _Double Bogey_ (≥2 sobre par): -3 puntos
       * _Bogey_ (1 sobre par): -1 punto
       * _Par_: 0 puntos
       * _Birdie_ (1 bajo par): 2 puntos
       * _Eagle_ (2 bajo par): 5 puntos
       * _Albatross_ (3 bajo par): 8 puntos
   - Crea la interfaz `GolfPlay` para implementar la estrategia.
   - Clase `ComputeCard` que aplica la estrategia seleccionada.

4. **Hoyo**
   - Implementa una clase `Hole` que representa un hoyo con su número en el circuito y su par.

5. **Requisitos de Implementación**
   - Usa el patrón Strategy para las modalidades de juego
   - Implementa el principio Open/Closed
   - Utiliza `Optional` para la gestión de jugadores
   - (Opcional) Usa `Streams` para el procesamiento de datos
   - Implementa un **tipo enumerado** para el sistema _Stableford_

## Ejemplo de Uso

Salida por consola

```bash
MJ ---> H'cap: 0        Strokes: 71     Stableford points: 0

JS ---> H'cap: 0        Strokes: 73     Stableford points: 0

Numero de hoyos: 18

Birdie: 2
Eagle: -1

MJ ---> H'cap: 0        Strokes: 71     Stableford points: 0

JS ---> H'cap: 0        Strokes: 73     Stableford points: -2

Meeseeks ---> H'cap: 0  Strokes: 71     Stableford points: 8
```

## Evaluación

Se valorará:
1. Correcta implementación del patrón Strategy
2. Uso adecuado de Optional y Streams
3. Implementar un tipo enumerado para el sistema Stableford
4. Implementación del principio Open/Closed
5. Implementación de pruebas unitarias


## Prepara el proyecto

 1. Crea un nuevo repo PRIVADO en tu cuenta en **Github** y compártelo con el usuario dfleta.
 2. Crea un nuevo directorio en tu equipo y **clona el repositorio** de Github.
 3. Abre VSCode /Eclipse /Netbeans /IntelIJ y **establece como workspace** el directorio que has clonado.
 4. Crea un proyecto **Gradle** o **Maven**.
 5. Pon el proyecto en seguimiento en **Git** y configura `.gitignore`.
 6. Copia y pega la función principal `App.java`. Utilízala como guía en el proceso TDD. Comenta aquellas partes que no hayas implementado.
 7. Completa las clases que aquí se indican **implementando los casos test que necesites**. Practica **TDD**.
 8. **Realiza `commits` como mínimo cada vez que termines una historia de usuario**. Sin commit periódicos, no corrijo el examen.


## Entrega

 1. Crea un repo PRIVADO en tu GitHub y compártelo con el usuario dfleta.
 2. **Realiza commits periódicamente** mientras avanzas en el desarrollo de la aplicación. Sin commit periódicos, no corrijo el examen.
 3. Realiza un `push` al repo remoto en GitHub **SOLO cuando hayas terminado el proyecto**.
