package Practica7;
import java.util.Scanner;
import java.util.Random;


public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        reiniciaPartida();
        Random random = new Random();
        numeroAAdivinar = random.nextInt(11);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = scanner.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Intenta de nuevo.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (!quitaVida()) {
                    System.out.println("¡Has perdido todas tus vidas!");
                    break;
                } else if (intento < numeroAAdivinar) {
                    System.out.println("El número es mayor. Intenta otra vez.");
                } else {
                    System.out.println("El número es menor. Intenta otra vez.");
                }
            }
        }
    }
}

