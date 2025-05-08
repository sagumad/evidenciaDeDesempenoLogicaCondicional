import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--Bienvenido a la inscripcion del gym--");
            System.out.println("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese su edad: ");
            int edad = scanner.nextInt();
            System.out.println("Ingrese su identificacion: ");
            String identificacion = scanner.next();
            System.out.println("Ingrese el valor de inscripcion a pagar: ");
            double valorIns = scanner.nextDouble();
            System.out.println("Ingrese el valor de la mensualidad a pagar: ");
            double valorMens = scanner.nextDouble();

            if (valorIns >= 50000 && valorMens >= 35000) {
                System.out.println("El pago se ha realizado con exito.");
            } else {
                System.out.println("Error en el pago, por favor verifique los valores ingresados.");
            }
            if (identificacion.length() == 10) {
                System.out.println("La identificacion es correcta esta afiliado a casa de compensacion.");
                if (edad < 15) {
                    System.out.println("No puede inscribirse, no cumple con el rewuisito de edad.");
                } else {
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Edad: " + edad);
                    System.out.println("Identificacion: " + identificacion);
                    System.out.println("Valor de inscripcion: " + valorIns);
                    System.out.println("Valor de mensualidad: " + valorMens);
                }
                System.out.println("--Felicidades gracias por inscribirse al gym, que tenga un buen dia.--");
            }
        }

    }
}
