package Practica7;

public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        System.out.println("¡Nueva partida iniciada!");
        numeroDeVidas = 3; // Puedes cambiar este valor si se quiere reiniciar con otra cantidad
    }

    public void actualizaRecord() {
        record++;
        System.out.println("¡Nuevo récord: " + record + "!");
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te queda(n) " + numeroDeVidas + " vida(s).");
        return numeroDeVidas > 0;
    }
}
