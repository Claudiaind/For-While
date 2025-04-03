import java.util.Scanner;
public class Digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();
        int contador = String.valueOf(num).length();
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}