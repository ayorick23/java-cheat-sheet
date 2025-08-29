public class IfElse {

    public static void main(String[] args) {

        // if-else simple
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Eres legalmente un adulto.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // if-else if-else
        int calificacion = 85;
        System.out.println("\nCalificación: " + calificacion);
        if (calificacion >= 90) {
            System.out.println("Obtuviste una A.");
        } else if (calificacion >= 80) {
            System.out.println("Obtuviste una B.");
        } else if (calificacion >= 70) {
            System.out.println("Obtuviste una C.");
        } else {
            System.out.println("Necesitas mejorar.");
        }
    }
}
