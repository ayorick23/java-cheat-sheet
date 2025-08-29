public class Switch {

    public static void main(String[] args) {

        // switch-case
        String diaSemana = "miercoles";
        System.out.println("\nHoy es " + diaSemana);
        
        switch (diaSemana) {
            case "lunes":
                System.out.println("¡Inicio de la semana!");
                break;
            case "viernes":
                System.out.println("¡Casi fin de semana!");
                break;
            case "sabado":
            case "domingo":
                System.out.println("¡Fin de semana!");
                break;
            default:
                System.out.println("Día de trabajo regular.");
                break;
        }
    }
}