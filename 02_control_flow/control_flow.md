# Control Flow

El **control de flujo** en Java determina el orden en que se ejecutan las sentencias de tu programa. Es la lógica que permite a tu código tomar decisiones y repetir tareas. A diferencia de Python, Java usa llaves `{}` para definir bloques de código, no la indentación.

## Sentencias Condicionales

Las sentencias condicionales te permiten ejecutar código basándose en el resultado de una expresión booleana (`true` o `false`).

### `if`, `else if`, `else`

Esta estructura es el pilar de la toma de decisiones en Java. Se evalúan las condiciones de arriba hacia abajo, y el primer bloque cuya condición sea `true` se ejecuta.

Si ninguna condición se cumple, el bloque `else` (si existe) se ejecuta.

```java
if (condicion1) {
    // Código a ejecutar si la condicion1 es verdadera
} else if (condicion2) {
    // Código a ejecutar si la condicion1 es falsa Y la condicion2 es verdadera
} else if (condicion3) {
    // Código a ejecutar si las condiciones anteriores son falsas Y la condicion3 es verdadera
} else {
    // Código a ejecutar si ninguna de las condiciones anteriores fue verdadera (opcional)
}
```

- `if (condición)`: La condición debe ser una expresión que resulte en un valor booleano (`true` o `false`).
- `else if (condición)`: Puedes tener múltiples bloques `else if` para evaluar condiciones adicionales.
- `else`: El bloque `else` es opcional y sirve como una opción por defecto cuando ninguna de las condiciones anteriores se cumple.

### Operador Condicional Ternario (`? :`)

Es la única forma de `if-else` que te permite asignar un valor a una variable en una sola línea.

```java
condición ? valor_si_verdadero : valor_si_falso
```

La condición se evalúa. Si es `true`, se devuelve el primer valor; si es `false`, se devuelve el segundo. Es ideal para asignaciones sencillas y concisas.

### Sentencia `switch`

La sentencia `switch` es una alternativa más limpia y eficiente para reemplazar una serie de `if...else if` cuando se comparan valores exactos (no rangos). Es ideal para evaluar una variable contra múltiples valores constantes.

```java
switch (variable) {
    case valor1:
        // Código a ejecutar si variable coincide con valor1
        break; // Sale del switch
    case valor2:
        // Código a ejecutar si variable coincide con valor2
        break;
    default: // Opcional
        // Código a ejecutar si no coincide con ningún case
}
```

- `switch (variable)`: La variable puede ser de tipo `byte`, `short`, `char`, `int`, `String`, `Enum`, o `var` (a partir de Java 10).
- `case valor`: Cada case debe ser un valor constante.
- `break;`: La sentencia `break` es fundamental. Si se omite, el programa continuará ejecutando el código del siguiente `case`, un comportamiento conocido como **fall-through**.
- `default`: Similar al `else` de una sentencia `if`, el `default` es opcional y se ejecuta si la expresión no coincide con ningún `case`.

## Bucles (Loops)

Los bucles te permiten ejecutar un bloque de código repetidamente.

### Bucle `for`

El bucle `for` es ideal cuando conoces de antemano el número de iteraciones.

```java
for(int i = <valor inicial>; i <= <valor final>; i + <paso>) {
    // Bloque de código a ejecutar
}
```

### Bucle `for-each`

El bucle `for-each` (o bucle "for mejorado") en Java es una forma simplificada y eficiente de iterar sobre los elementos de un arreglo o una colección, como una lista, sin necesidad de gestionar manualmente un índice.

```java
for (Tipo dato: nombreColeccion) {
    // Bloque de código a ejecutar
}
```

Ppermite acceder directamente a cada elemento de la colección, haciendo el código más legible y reduciendo la posibilidad de errores, aunque es menos flexible que un bucle `for` tradicional porque no se puede modificar el tamaño de la colección mientras se itera.

### Bucle `while`

El bucle `while` se ejecuta repetidamente mientras la condición sea `true`. La condición se evalúa antes de cada iteración.

```java
while (condición) {
    // Sentencias que se ejecutarán mientras la condición sea verdadera
}
```

- La condición se verifica al inicio del bucle. Si es `false` desde el principio, el bloque de código nunca se ejecuta.

### Bucle `do-while`

A diferencia del `while`, el bucle `do-while` garantiza que el bloque de código se ejecute al menos una vez, ya que la condición se evalúa al final de cada iteración.

```java
do {
    // El código dentro de estas llaves se ejecuta
    // y se repite mientras la condición sea verdadera.
    instruccion1;
    instruccion2;
    // ...
} while (condicion); // La condición se evalúa al final
```

### Declaraciones de Control de Bucle

Estas sentencias te dan control adicional sobre la ejecución de los bucles:

- `break`: Termina inmediatamente el bucle más interno en el que se encuentra.
- `continue`: Salta la iteración actual y pasa a la siguiente.
