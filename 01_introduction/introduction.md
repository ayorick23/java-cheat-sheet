# Introduction to Java

**Java** es un lenguaje de programación de alto nivel, orientado a objetos y de propósito general que se lanzó por primera vez en 1995 por Sun Microsystems (ahora parte de Oracle). Está diseñado para ser independiente de la plataforma, lo que significa que el código compilado (llamado bytecode) puede ejecutarse en cualquier sistema operativo que tenga una Máquina Virtual de Java (**JVM**). El famoso lema de Java, "Write Once, Run Anywhere" (Escribe una vez, ejecuta en cualquier lugar), resume perfectamente esta portabilidad.

## Sintaxis Básica y Generalidades

La sintaxis de Java es similar a la de C++. Es sensible a mayúsculas y minúsculas, lo que significa que `miVariable` y `mivariable` son dos variables diferentes. Cada sentencia o línea de código debe terminar con un punto y coma (`;`).

Un programa básico en Java siempre contendrá al menos una clase, y el punto de entrada para su ejecución es el método `main`.

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!"); // Esto imprime texto en la consola
    }
}
```

- `public class HolaMundo`: Define una clase pública llamada HolaMundo.
- `public static void main(String[] args)`: El método main es el punto de inicio de la ejecución del programa.
  - `public`: El método puede ser accedido desde cualquier lugar.
  - `static`: El método pertenece a la clase, no a una instancia de la clase.
  - `void`: El método no devuelve ningún valor.
  - `String[] args`: Permite pasar argumentos de línea de comandos.
- `System.out.println()`: Un método estándar para imprimir una línea de texto en la consola.

## Tipos de Datos

Los tipos de datos en Java se dividen en dos categorías principales: primitivos y de referencia. Los tipos primitivos son la base del lenguaje y almacenan valores simples, mientras que los tipos de referencia almacenan las direcciones de memoria de objetos más complejos.

### Tipos de Datos Primitivos

Son los tipos de datos fundamentales y más básicos en Java. Aquí se muestra una tabla con los más comunes:

| Tipo      | Tamaño  | Valor por Defecto | Rango                                         | Uso Común                                   |
| --------- | ------- | ----------------- | --------------------------------------------- | ------------------------------------------- |
| `byte`    | 8 bits  | `0`               | -128 a 127                                    | Para ahorrar memoria en arreglos grandes    |
| `short`   | 16 bits | `0`               | -32,768 a 32,767                              | Igual que byte pero con un rango más amplio |
| `int`     | 32 bits | `0`               | -2,147,483,648 a 2,147,483,647                | El tipo de dato entero más usado            |
| `long`    | 64 bits | `0L`              | -9 trillones a 9 trillones                    | Para números enteros muy grandes            |
| `float`   | 32 bits | `0.0f`            | Almacena números decimales                    | Para datos de coma flotante                 |
| `double`  | 64 bits | `0.0d`            | Almacena números decimales de doble precisión | El tipo de dato decimal más usado           |
| `boolean` | 1 bit   | `false`           | `true` o `false`                              | Para banderas lógicas                       |
| `char`    | 16 bits | `\u0000`          | Un solo carácter (Unicode)                    | Almacena caracteres como 'a', 'b', '$'      |

### Tipos de Datos de Referencia

Los tipos de datos de referencia (objetos) son aquellos que no almacenan directamente el valor, sino una referencia (dirección de memoria) al objeto en sí. Algunos ejemplos son `String`, arreglos (arrays) y cualquier clase que definas (`HolaMundo`, por ejemplo).

## Tipos de Variables y su Alcance (Scopes)

El **alcance** de una variable define la región del programa en la que se puede acceder a esa variable. En Java, hay tres tipos principales de variables según su alcance:

1. **Variables de Instancia (o Miembro de Clase):** Se declaran dentro de una clase, pero fuera de cualquier método, constructor o bloque. Pertenecen a un objeto y se crean cuando se crea el objeto y se destruyen cuando el objeto se destruye.
2. **Variables Locales:** Se declaran dentro de un método, constructor o bloque. Solo son accesibles dentro de ese bloque y se destruyen cuando el bloque finaliza. Deben ser inicializadas antes de usarse.
3. **Variables de Clase (o Estáticas):** Se declaran dentro de una clase, con la palabra clave `static`. Se crean una sola vez cuando la clase se carga y pueden ser accedidas por todos los objetos de esa clase.

## Conversión de Tipos de Datos

La **conversión de tipos**, también conocida como **casting**, es el proceso de convertir un tipo de dato en otro. Hay dos tipos principales de conversión:

1. **Conversión Implícita (Widening Casting):** Ocurre automáticamente cuando se convierte un tipo de dato más pequeño a uno más grande (ej. `int` a `double`). No hay pérdida de datos.

   - `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`

2. **Conversión Explícita (Narrowing Casting):** Se requiere una sintaxis específica y se hace manualmente. Ocurre cuando se convierte un tipo de dato más grande a uno más pequeño (ej. `double` a `int`). Puede haber pérdida de datos. Se hace colocando el tipo de dato destino entre paréntesis antes de la variable a convertir.

## Modificadores de Acceso

Los **modificadores de acceso** en Java son palabras clave que se utilizan para establecer la accesibilidad (o visibilidad) de las clases, métodos, constructores y variables. Controlan desde dónde se pueden acceder a estas partes del código. Hay cuatro tipos de modificadores de acceso:

1. `public`: El miembro es accesible desde cualquier otra clase en cualquier paquete. Es el nivel de acceso más permisivo.
2. `protected`: El miembro es accesible dentro de su propio paquete y por subclases (clases que heredan de ella), incluso si están en un paquete diferente.
3. `default` **(o sin modificador)**: El miembro solo es accesible dentro de su propio paquete. Si no se especifica ningún modificador, este es el nivel de acceso por defecto.
4. `private`: El miembro solo es accesible dentro de la clase en la que fue declarado. Es el nivel de acceso más restrictivo.

## Strings

En Java, `String` no es un tipo de dato primitivo, sino una clase de referencia que se utiliza para almacenar secuencias de caracteres, es decir, texto. Aunque se manipulan de manera similar a los tipos primitivos en muchas operaciones, los objetos `String` son inmutables, lo que significa que una vez que se crean, no se pueden modificar. Cualquier operación que parezca modificar un `String` en realidad crea una nueva instancia de `String` con el nuevo valor.

### Métodos de la Clase `String`

La clase `String` viene con una gran cantidad de métodos integrados para manipular cadenas de texto. Aquí están algunos de los más relevantes que te ayudarán en tu día a día:

- `length()`: Devuelve la longitud de la cadena, es decir, el número de caracteres que contiene.
- `equals(String)`: Compara si dos cadenas tienen el mismo valor. Es crucial usar `equals()` para comparar el contenido de las cadenas, ya que el operador `==` solo verifica si las dos variables de referencia apuntan al mismo objeto en memoria.
- `equalsIgnoreCase(String)`: Similar a `equals()`, pero ignora la diferencia entre mayúsculas y minúsculas al comparar.
- `toUpperCase()`: Convierte todos los caracteres de la cadena a mayúsculas.
- `toLowerCase()`: Convierte todos los caracteres de la cadena a minúsculas.
- `charAt(int index)`: Devuelve el carácter en una posición específica de la cadena. El índice de los caracteres comienza en `0`.
- `indexOf(String)`: Devuelve la posición de la primera ocurrencia de un sub-string dentro de la cadena. Si no se encuentra, devuelve `-1`.
- `substring(int beginIndex)`: Extrae una sub-cadena desde la posición de inicio especificada hasta el final de la cadena.
- `substring(int beginIndex, int endIndex)`: Extrae una sub-cadena desde la posición de inicio (inclusive) hasta la posición de fin (exclusiva).
- `replace(char oldChar, char newChar)`: Reemplaza todas las ocurrencias de un carácter con otro.
- `contains(CharSequence s)`: Retorna `true` si la cadena contiene la secuencia de caracteres especificada.
- `trim()`: Elimina los espacios en blanco al principio y al final de la cadena.
