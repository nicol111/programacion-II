package Practica11.Fila_B;

public class Pintura extends Obra{
    private String genero;

    public Pintura(String titulo, String material, Artista[] artistas, Anuncio anuncio, String genero) {
        super(titulo, material, artistas, anuncio);
        this.genero = genero;
    }
}
