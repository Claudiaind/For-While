import java.util.Scanner;
import java.util.Random;
public class Adivinar {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int intento;
        do {
            System.out.print("Adivine el número (entre 1 y 100): ");
            intento = scanner.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("Muy bajo!");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto!");
            }
        } while (intento != numeroSecreto);
        System.out.println("¡Correcto!");
    }
}