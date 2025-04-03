import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0, contador = 0, num;
        do {
            System.out.print("Ingrese un número positivo (negativo para salir): ");
            num = scanner.nextInt();
            if (num >= 0) {
                suma += num;
                contador++;
            }
        } while (num >= 0);
        if (contador > 0) {
            System.out.println("La media es: " + (suma / (double) contador));
        } else {
            System.out.println("No ingresó números positivos.");
        }
    }
}