Sistema de Gestión de Garage

Proyecto Java para administrar un sitemas de garage.

Descripción

Este proyecto consiste en el desarrollo de un sistema de consola realizado en Java para la administración de un garage.

El sistema permite registrar el ingreso y salida de vehículos, controlar la capacidad disponible del garage y generar reportes básicos sobre el estado del estacionamiento.

El trabajo fue desarrollado aplicando conceptos de Programación Orientada a Objetos vistos en clase.

El sistema permite:

- Registrar ingreso de vehículos
- Registrar salida de vehículos
- Listar vehículos estacionados
- Mostrar estado del garage
- Generar reportes
- Calcular costos según tipo de vehículo

Durante el desarrollo se utilizaron los siguientes temas:

- Programación Orientada a Objetos
- Herencia
- Polimorfismo
- Interfaces
- Clases abstractas
- Colecciones (ArrayList)
- Manejo de excepciones
- Validaciones
- Menú interactivo por consola

Estructura del proyecto

```plaintext
src/
└── garage/
    ├── Main.java
    ├── Garage.java
    ├── Vehiculo.java
    ├── Moto.java
    ├── Auto.java
    ├── Camion.java
    ├── Calculable.java
    ├── Mostrable.java
    ├── GarageLlenoException.java
    ├── PatenteDuplicadaException.java
    ├── VehiculoNoEncontradoException.java
    └── HorasInvalidasException.java
```

Ejecución

- Clonar el repositorio
- Abrir el proyecto en Eclipse
- Ejecutar la clase Main.java

El sistema controla:

- Patentes duplicadas
- Horas inválidas
- Falta de espacio en el garage
- Vehículos inexistentes
- Opciones inválidas del menú

Reportes disponibles

- Cantidad total de vehículos
- Cantidad por tipo
- Espacio ocupado
- Espacio libre
- Recaudación estimada
