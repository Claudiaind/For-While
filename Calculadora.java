import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú de Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();
                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + (num1 + num2));
                    case 2 -> System.out.println("Resultado: " + (num1 - num2));
                    case 3 -> System.out.println("Resultado: " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("No se puede dividir por cero.");
                        }
                    }
                }
            }
        } while (opcion != 5);
        System.out.println("Saliendo de la calculadora...");
    }
}
