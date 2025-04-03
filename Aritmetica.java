import java.util.Scanner;
public class Aritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número de la secuencia: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingrese la diferencia entre los números: ");
        int diferencia = scanner.nextInt();
        System.out.print("Ingrese el número máximo hasta el cual se generará la secuencia: ");
        int maximo = scanner.nextInt();
        int actual = inicio;
        do {
            System.out.println(actual);
            actual += diferencia;
        } while (actual <= maximo);
    }
}
