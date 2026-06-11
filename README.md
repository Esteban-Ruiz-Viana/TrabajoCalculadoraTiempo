#  Calculadora de Tiempo

## Integrantes

* **Yulieth Herrera Causil** – 7502610017  
* **Samuel Piñeros Rivera** – 7502610006  
* **Esteban Ruiz Viana** – 7502610025  

---

## Descripción del Proyecto

Aplicación de consola desarrollada en **Java** que permite realizar **conversiones y operaciones básicas con unidades de tiempo**.  

El programa presenta un **menú interactivo** que permite al usuario seleccionar la operación deseada e ingresar los valores correspondientes.

---

## Roles

### Yulieth Herrera Causil

* Implementación de las funcionalidades:
  * `convertirHorasAMinutos()`
  * `convertirMinutosASegundos()`
* Creación de commits y Pull Requests.

---

### Samuel Piñeros Rivera

* Implementación de la funcionalidad:
  * `convertirDiasAHoras()`
* Verificación de resultados y validación de entradas.
* Documentación del proceso de desarrollo.


---

### Esteban Ruiz Viana

* Implementación de la funcionalidad:
  * `sumarMinutosAHora()`
* Desarrollo del **menú principal** y control de flujo de la aplicación.
* Integración de todas las funcionalidades en la clase `Main.java`.
* Revisión final y pruebas de ejecución completa del programa.

---

## Funcionalidades

La aplicación permite realizar las siguientes operaciones:

1. Convertir horas a minutos.  
2. Convertir minutos a segundos.  
3. Convertir días a horas.  
4. Sumar minutos a una hora dada.  

### Menú Principal

```text
=== Calculadora de Tiempo ===
1. Convertir horas a minutos
2. Convertir minutos a segundos
3. Convertir días a horas
4. Sumar minutos a una hora
5. Salir

calculadora-tiempo/
│
├── README.md
├── .gitignore
│
└── src/
    ├── Main.java
    ├── CalculadoraTiempo.java
    └── CalculadoraTiempoCli.java
```


### Flujo de trabajo

```bash
git status
git add .
git commit -m "Agregar funcionalidad"
git push origin nombre-rama
```
## Instrucciones de Ejecución

### Requisitos

* Java JDK 17 o superior  
* IntelliJ IDEA o cualquier IDE compatible con Java  
* Git instalado  

### Clonar el repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

cd TrabajoCalculadoraTiempo


### Ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main.java`.
3. Seleccionar una opción del menú.
4. Ingresar el valor a convertir.
5. Visualizar el resultado de las operaciones.

---

## Flujo Colaborativo con Git y GitHub

Para el desarrollo se utilizó el flujo de trabajo basado en ramas:

### Creación de ramas

### Integración

1. Creación de Pull Request.
2. Revisión por otro integrante.
3. Aprobación del Pull Request.
4. Merge hacia la rama `main`.
5. Actualización de repositorios locales mediante `git pull`.

---

## Evidencias del Flujo Colaborativo

Se adjuntan las siguientes evidencias en el repositorio:

* Captura de colaboradores agregados.
* Captura de ramas creadas.
* Captura de Pull Requests.
* Captura de revisiones realizadas.
* Captura de aprobaciones.
* Captura de merges hacia `main`.
* Historial de Git mediante:

```bash
git log --oneline --graph --decorate --all
```

* Evidencia de ejecución correcta del programa.

---

## Tecnologías Utilizadas

* Java
* Git
* GitHub
* IntelliJ IDEA

---

## Estado del Proyecto

Proyecto finalizado y funcional.
