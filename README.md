# Practica-1.--Operaciones-Basicas

El programa permite trabajar con un **alfabeto y cadenas** para obtener diferentes operaciones como **prefijos, sufijos, subcadenas**, así como generar la **cerradura positiva (L⁺)** y la **cerradura de Kleene (L*)** de un lenguaje hasta una longitud máxima especificada por el usuario.

---

## 📚 Conceptos implementados

El programa implementa las siguientes operaciones de teoría de lenguajes:

### Prefijos

Dada una cadena `w`, se obtienen todos sus prefijos.

Ejemplo:

Cadena:
`abc`

Prefijos:

ε
a
ab
abc

---

### Sufijos

Se obtienen todos los sufijos de una cadena.

Cadena:
`abc`

Sufijos:

abc
bc
c
ε

---

### Subcadenas

Se generan todas las subcadenas posibles de una cadena dada.

Cadena:
`abc`

Subcadenas:

a
b
c
ab
bc
abc

---

### Cerradura Positiva (L⁺)

La **cerradura positiva** de un lenguaje `L` se define como:

L⁺ = L ∪ L² ∪ L³ ∪ ...

El programa genera concatenaciones del lenguaje **hasta una longitud máxima definida por el usuario**.

---

### Cerradura de Kleene (L*)

La **cerradura de Kleene** incluye la cadena vacía:

L* = { ε } ∪ L⁺

El programa genera todas las combinaciones posibles del lenguaje hasta la longitud especificada.

---

## 🖥️ Interfaz gráfica

La aplicación incluye una **interfaz gráfica desarrollada con Java Swing** que permite:

* Ingresar una cadena
* Definir un lenguaje
* Seleccionar la longitud máxima para las cerraduras
* Exportar resultados a un archivo `.txt`

---

## 📂 Estructura del proyecto

```
src/
 ├─ GUI.java
 └─ Lenguaje.java
```

* **GUI.java** → Maneja la interfaz gráfica.
* **Lenguaje.java** → Representa el lenguaje y su alfabeto e implementa las operaciones sobre cadenas y lenguajes.

---

## ▶️ Cómo ejecutar el programa

### Ejecutar desde NetBeans

1. Abrir el proyecto en NetBeans
2. Ejecutar el proyecto
3. Interactuar con la interfaz gráfica

---

### Ejecutar el archivo `.jar`

Dentro de:

```
dist/
```

Para ejecutarlo:

```
java -jar OpBasicas.jar
```

---

## 📄 Exportar resultados

El programa permite **exportar los resultados generados a un archivo `.txt`** utilizando un selector de archivos.

El archivo incluye:

* Cerradura positiva y de Kleene
* Resultados de subcadenas, prefijos y sufijos
