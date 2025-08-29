# Manipulación de Cadenas (`String`)

En Java, el tipo de dato `String` es una clase utilizada para representar secuencias de caracteres. Es un tipo de referencia, no primitivo. Es crucial entender que los objetos `String` son inmutables. Esto significa que una vez que una cadena es creada, su valor no puede ser cambiado. Cualquier operación que parezca modificar una cadena (como un reemplazo o concatenación) en realidad crea una nueva instancia de `String` con el nuevo valor, dejando el objeto original sin alterar.

## Secuencias de Escape

Las secuencias de escape son caracteres especiales que comienzan con una barra invertida (`\`) y se utilizan para representar caracteres que no se pueden escribir directamente en una cadena de texto.

| Carácter de Escape | Descripción           |
| ------------------ | --------------------- |
| `\'`               | Comilla Simple        |
| `\"`               | Comilla Doble         |
| `\\`               | Barra Invertida (`\`) |
| `\t`               | Tabulación            |
| `\n`               | Salto de línea        |
| `\r`               | Retorno de carro      |
| `\b`               | Retroceso             |

**Ejemplo de uso:**

```java
System.out.println("Ruta del archivo: C:\\Carpeta\\Archivo.txt");
// Salida: Ruta del archivo: C:\Carpeta\Archivo.txt
```

## Concatenación y Cadenas Multilínea

Puedes concatenar cadenas usando el operador `+`. Para texto multilínea, no existe una sintaxis de comillas triples como en Python. En su lugar, se utilizan saltos de línea (`\n`) o bloques de texto. A partir de Java 15, se introdujeron los **Text Blocks** para facilitar la creación de cadenas multilínea y literales largos.

```java
// Concatenación de cadenas
String nombre = "María";
String saludo = "Hola, " + nombre + "!";

// Cadena multilínea (antes de Java 15)
String multiline = "Esta es la primera línea.\n" +
                  "Esta es la segunda línea.\n" +
                  "Y esta es la tercera.";

// Bloque de texto (Java 15+)
String textBlock = """
        Este es un texto
        que ocupa varias líneas.
        Es muy útil para documentación.
        """;
```

## Métodos Esenciales de la Clase `String`

La clase `String` en Java está repleta de métodos útiles para manipular cadenas. A diferencia de Python, donde muchos métodos son funciones globales, en Java son métodos de instancia de la clase `String`.

## Comparación y Verificación

- `equals(String anotherString)`: Compara el contenido de dos cadenas. Devuelve `true` si son iguales. **Nunca uses `==` para comparar el contenido de cadenas, ya que compara las referencias de memoria.**
- `equalsIgnoreCase(String anotherString)`: Compara el contenido de dos cadenas ignorando mayúsculas y minúsculas.
- `startsWith(String prefix)`: Devuelve `true` si la cadena comienza con el prefijo especificado.
- `endsWith(String suffix)`: Devuelve `true` si la cadena termina con el sufijo especificado.
- `contains(CharSequence s)`: Devuelve `true` si la cadena contiene la secuencia de caracteres especificada.

## Modificación de Cadenas (que crea nuevas instancias)

- `toLowerCase()`: Devuelve una nueva cadena con todos los caracteres en minúsculas.
- `toUpperCase()`: Devuelve una nueva cadena con todos los caracteres en mayúsculas.
- `trim()`: Devuelve una nueva cadena con los espacios en blanco al principio y al final eliminados.
- `replace(char oldChar, char newChar)`: Devuelve una nueva cadena donde todas las ocurrencias del `oldChar` son reemplazadas por `newChar`.
- `replace(CharSequence target, CharSequence replacement)`: Una sobrecarga del método anterior para reemplazar subcadenas completas.

## Extracción de Información

- `length()`: Devuelve la longitud de la cadena (el número de caracteres).
- `charAt(int index)`: Devuelve el carácter en la posición del índice especificado.
- `indexOf(String str)`: Devuelve el índice de la primera ocurrencia de la subcadena. Si no se encuentra, devuelve `-1`.
- `substring(int beginIndex)`: Extrae una subcadena desde el índice de inicio hasta el final.
- `substring(int beginIndex, int endIndex)`: Extrae una subcadena desde el índice de inicio (inclusive) hasta el índice de fin (exclusivo).

## División y Unión

- `split(String regex)`: Divide la cadena en un array de subcadenas utilizando una expresión regular como delimitador.
- `String.join(CharSequence delimiter, CharSequence... elements)`: Un método estático de la clase `String` que une elementos de un iterable en una sola cadena, utilizando un delimitador.
