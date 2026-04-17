# 🚛 Sistema de Vehículos de Reparto

Sistema de gestión de flota de reparto desarrollado en Java como aplicación de consola. Permite registrar, consultar y administrar distintos tipos de vehículos de una empresa logística.

---

## 🎯 Objetivo del challenger

Practicar una transición real desde ejercicios estructurados hacia una lógica orientada a objetos, aplicando los tres pilares fundamentales de la POO: encapsulación, herencia y polimorfismo.

---

## 🧠 Conceptos POO aplicados

- **Encapsulación**: todos los atributos son `private`, accesibles únicamente mediante getters y setters con validaciones.
- **Herencia**: las clases `Camion`, `Furgon` y `MotoReparto` extienden de la clase base `Vehiculo`.
- **Polimorfismo por sobrescritura**: cada clase hija redefine el método `mostrarDetalle()` con información específica de su tipo.

---

## 🗂 Clases utilizadas

| Clase          | Descripción                                              |
|----------------|----------------------------------------------------------|
| `Vehiculo`     | Clase base con atributos comunes (patente, marca, modelo, capacidadCarga, disponible) |
| `Camion`       | Extiende `Vehiculo`. Atributo propio: número de ejes     |
| `Furgon`       | Extiende `Vehiculo`. Atributo propio: volumen interior   |
| `MotoReparto`  | Extiende `Vehiculo`. Atributo propio: tiene caja térmica |
| `Main`         | Clase principal con menú, Scanner e integración general  |

---

## ▶️ Cómo ejecutar el programa

**Requisitos:** Java 14 o superior instalado.

```bash
# Clonar el repositorio
git clone https://github.com/raiksha/vehiculos-reparto.git
cd vehiculos-reparto

# Compilar
javac src/*.java -d out/

# Ejecutar
java -cp out/ Main
```

---

## 📋 Ejemplo de uso del menú

```
=== SISTEMA DE VEHÍCULOS DE REPARTO ===
1. Registrar camión
2. Registrar furgón
3. Registrar moto de reparto
4. Mostrar todos los vehículos
5. Mostrar vehículos disponibles
6. Marcar vehículo como no disponible
7. Mostrar reporte general
8. Salir

TBD
```

---

## 👥 Integrantes del equipo

| Integrante          | Responsabilidad principal                                                                                    |
|---------------------|--------------------------------------------------------------------------------------------------------------|
| Alexander Canario   | Clase `Main` — menú, Scanner e integración general. Funciones mostrarMenu() y mostrarVehiculosDisponibles(). |
| Pablo Fuentes       | Clase `Vehiculo` — encapsulación, getters, setters y validaciones. Función mostrarTodosLosVehiculos().       |
| Julio Oyarzun       | Clase `Camion` — herencia y sobrescritura de métodos. Función registrarCamion().                             |
| Sary Viafara        | Clase `Furgon` — herencia y sobrescritura de métodos. Función registrarFurgon().                             |
| Diego Castillo      | Clase `MotoReparto` — herencia y sobrescritura de métodos. Función registrarMotoReparto().                   |
| Angela Galleguillos | QA/Debugger. Función marcarVehiculoNoDisponible().                                                           |
| María C. Riquelme   | Mantenedora del repositorio. Creación del README. Función mostrarReporteGeneral().                           |
| Todo el equipo      | Pruebas, validaciones y presentación final                                                                   |

---

## 📁 Estructura del proyecto

```
vehiculos-reparto/
│
├── src/
│   ├── Main.java
│   ├── Vehiculo.java
│   ├── Camion.java
│   ├── Furgon.java
│   └── MotoReparto.java
│
├── README.md
└── .gitignore
```