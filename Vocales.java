import java.util.Scanner;
public class Vocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;
        do {
            System.out.print("Ingrese una letra (espacio para salir): ");
            letra = scanner.next().charAt(0);
            if (Character.isLetter(letra)) {
                if ("aeiouAEIOU".indexOf(letra) != -1) {
                    System.out.println("Es una vocal");
                } else {
                    System.out.println("Es una consonante");
                }
            }
        } while (letra != ' ');
    }
}