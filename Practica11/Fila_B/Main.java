package Practica11.Fila_B;

public class Main {

    public static double calcularPromedioExperiencia(Pintura p1, Pintura p2) {
        int suma = 0;
        int cantidad = 0;
        for (Artista a : p1.getArtistas()) {
            suma += a.getAñosExperiencia();
            cantidad++;
        }
        for (Artista a : p2.getArtistas()) {
            suma += a.getAñosExperiencia();
            cantidad++;
        }
        return cantidad > 0 ? (double) suma / cantidad : 0;
    }

    public static void main(String[] args) {
        // a) Crear dos objetos pintura que tengan anuncios de venta
        Artista artista1 = new Artista("Ana", "123", 10);
        Artista artista2 = new Artista("Luis", "456", 20);
        Artista artista3 = new Artista("Maria", "789", 15);
        Artista artista4 = new Artista("Juan", "321", 5);

        Anuncio anuncio1 = new Anuncio(1, 1000.0);
        Anuncio anuncio2 = new Anuncio(2, 2000.0);

        Pintura pintura1 = new Pintura(
            "Paisaje", "Óleo", new Artista[]{artista1, artista2}, anuncio1, "Paisajismo"
        );
        Pintura pintura2 = new Pintura(
            "Retrato", "Acrílico", new Artista[]{artista3, artista4}, anuncio2, "Retrato"
        );

        // b) Calcular el promedio de años de experiencia de los artistas de ambas pinturas
        double promedio = calcularPromedioExperiencia(pintura1, pintura2);
        System.out.println("Promedio de años de experiencia de los artistas: " + promedio);

        // c) Incrementar el precio en X a la pintura del artista con nombre X
        String nombreBuscado = "Luis";
        double incremento = 500.0; 
        incrementarPrecioPorArtista(pintura1, pintura2, nombreBuscado, incremento);

        System.out.println("Nuevo precio de anuncio de pintura1: " + pintura1.getAnuncio().getPrecio());
        System.out.println("Nuevo precio de anuncio de pintura2: " + pintura2.getAnuncio().getPrecio());
    }
    }

