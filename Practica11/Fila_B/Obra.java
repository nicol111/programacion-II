package Practica11.Fila_B;

public class Obra {
    protected String titulo;
    protected String material;
    protected Artista[] artistas;
    protected Anuncio anuncio;

    public Obra(String titulo, String material, Artista[] artistas, Anuncio anuncio) {
        this.titulo = titulo;
        this.material = material;
        this.artistas = artistas;
        this.anuncio = anuncio;
    }

    public Artista[] getArtistas() {
        return artistas;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }
}
