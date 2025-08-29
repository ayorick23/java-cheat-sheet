public class ForEach {

    public static void main(String[] args) {

        // Bucle for-each
        String[] nombres = {"Ana", "Luis", "Sofía"};
        System.out.println("\nBucle for-each (iterando sobre un arreglo):");
        
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
    }
}