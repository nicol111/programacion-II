package Practica11.Fila_B;

public class Anuncio {

    private int numero;
    private double precio;

    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void incrementarPrecio(double x) {
        this.precio += x;
    }
    
}
