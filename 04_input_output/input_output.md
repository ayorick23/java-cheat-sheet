# Input and Output

El **Input/Output (_I/O_)**, o entrada y salida, se refiere a la comunicación entre un programa y el mundo exterior. En Java, esto incluye la lectura de datos desde fuentes como el teclado o archivos, y la escritura de datos en destinos como la consola, archivos o bases de datos. La forma más común de manejar I/O en programas de consola es a través de los flujos de datos (`streams`) estándar:

- `System.out`: El flujo de salida estándar, usado para imprimir datos en la consola.
- `System.in`: El flujo de entrada estándar, usado para leer datos del teclado.
- `System.err`: El flujo de error estándar, usado para imprimir mensajes de error.

## Salida de Datos (_Output_)

La clase `System.out` proporciona métodos convenientes para imprimir información en la consola. Los más comunes son:

- `print(dato)`: Imprime el dato especificado sin un salto de línea al final.
- `println(dato)`: Imprime el dato especificado seguido de un salto de línea.
- `printf(formato, args)`: Permite imprimir datos con un formato específico, similar a la función printf de C. Esto es útil para controlar la alineación, el número de decimales, etc.

```java
// Ejemplo de System.out
System.out.print("Hola, ");   // No hay salto de linea
System.out.println("mundo!"); // Imprime y salta a la siguiente linea
System.out.println(123);      // También puede imprimir números
System.out.println(true);     // También puede imprimir valores booleanos
```

### Formateo de Salida con `printf`

El método `printf` usa especificadores de formato que comienzan con un porcentaje (`%`) para indicar el tipo de dato y el formato.

| Especificador | Tipo de Dato             | Ejemplo de Uso                 |
| ------------- | ------------------------ | ------------------------------ |
| `%s`          | Cadena (String)          | `printf("Nombre: %s", "Ana")`  |
| `%d`          | Entero (int, long)       | `printf("Edad: %d", 30)`       |
| `%f`          | Flotante (float, double) | `printf("Precio: %.2f", 9.99)` |
| `%b`          | Booleano (boolean)       | `printf("Estado: %b", true)`   |
| `%c`          | Carácter (char)          | `printf("Inicial: %c", 'A')`   |

## Entrada de Datos (_Input_)

Para leer datos del teclado, la forma más común y moderna es usando la clase `Scanner`. Esta clase se encuentra en el paquete `java.util` y facilita la lectura de diferentes tipos de datos.

### Pasos para Usar `Scanner`

1. **Importar la clase:** Debes importar `java.util.Scanner` al principio de tu archivo.
2. **Crear un objeto Scanner:** Se crea una instancia de la clase `Scanner` pasándole `System.in` como argumento.
3. **Usar los métodos de lectura:** La clase `Scanner` tiene métodos para leer distintos tipos de datos, como `nextInt()`, `nextDouble()`, `nextLine()`, etc.
4. **Cerrar el objeto Scanner:** Es una buena práctica cerrar el objeto `Scanner` con el método `close()` para liberar los recursos del sistema.

### Métodos de Lectura de `Scanner`

| Método          | Descripción                                         |
| --------------- | --------------------------------------------------- |
| `nextLine()`    | Lee toda la línea de texto, incluyendo espacios.    |
| `next()`        | Lee una sola palabra (hasta el siguiente espacio).  |
| `nextInt()`     | Lee un entero.                                      |
| `nextDouble()`  | Lee un número de punto flotante de doble precisión. |
| `nextBoolean()` | Lee un valor booleano (`true` o `false`).           |

**Consideración Importante:**

Ten cuidado con la combinación de `next...()` y `nextLine()`. Cuando se llama a un método como `nextInt()`, solo se lee el número, dejando el carácter de salto de línea (`\n`) en el búfer de entrada. La siguiente llamada a `nextLine()` leerá ese salto de línea vacío, lo que puede causar un comportamiento inesperado. Para evitarlo, puedes añadir una llamada a `nextLine()` extra para consumir el salto de línea, o leer siempre la entrada como una cadena y luego convertirla al tipo de dato deseado.
