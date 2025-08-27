public class MetodosString {

    public static void main(String[] args) {
        String texto = "  Hola Java, ¡qué interesante es aprender!  ";
        String otroTexto = "hola java, ¡qué interesante es aprender!  ";
        String textoBuscado = "Java";
        String palabraReemplazo = "Python";

        // length()
        System.out.println("Longitud del texto: " + texto.length());

        // equals() y equalsIgnoreCase()
        System.out.println("\n--- Comparación ---");
        System.out.println("¿Los textos son iguales? " + texto.equals(otroTexto));
        System.out.println("¿Los textos son iguales (ignorando mayúsculas)? " + texto.equalsIgnoreCase(otroTexto));

        // toUpperCase() y toLowerCase()
        System.out.println("\n--- Conversión de mayúsculas/minúsculas ---");
        System.out.println("Texto en mayúsculas: " + texto.toUpperCase());
        System.out.println("Texto en minúsculas: " + texto.toLowerCase());

        // charAt()
        System.out.println("\n--- Acceso a caracteres ---");
        System.out.println("El carácter en la posición 7 es: " + texto.charAt(7));

        // indexOf()
        System.out.println("\n--- Búsqueda ---");
        System.out.println("La posición de '" + textoBuscado + "' es: " + texto.indexOf(textoBuscado));

        // substring()
        System.out.println("\n--- Subcadenas ---");
        System.out.println("Subcadena desde la posición 10: " + texto.substring(10));
        System.out.println("Subcadena de la posición 10 a la 16: " + texto.substring(10, 16));

        // replace()
        System.out.println("\n--- Reemplazo ---");
        System.out.println("Reemplazando 'Java' por 'Python': " + texto.replace("Java", palabraReemplazo));

        // contains()
        System.out.println("\n--- Verificación de contenido ---");
        System.out.println("¿El texto contiene la palabra 'aprender'? " + texto.contains("aprender"));

        // trim()
        System.out.println("\n--- Recorte de espacios ---");
        System.out.println("Texto original con espacios: '" + texto + "'");
        System.out.println("Texto sin espacios al inicio y final: '" + texto.trim() + "'");
    }
}