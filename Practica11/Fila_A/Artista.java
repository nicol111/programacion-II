package Practica11.Fila_A;

public class Artista {
    private String nombre;
    private String ci;
    private int añosExperiencia;

    public Artista(String nombre, String ci, int añosExperiencia) {
        this.nombre = nombre;
        this.ci = ci;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }
}
