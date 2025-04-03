import java.util.Scanner;
public class Letra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();
        int contador = 0;
        for (char letra : palabra.toCharArray()) {
            if (letra == 'a' || letra == 'A') contador++;
        }
        System.out.println("La letra 'a' aparece " + contador + " veces.");
    }
}