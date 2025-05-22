package Practica11.Fila_A;

public class Main {
    // inciso b
    public static String artistaMasExperiencia(Pintura p1, Pintura p2) {
        Artista[] artistas1 = p1.getArtistas();
        Artista[] artistas2 = p2.getArtistas();
        Artista max = artistas1[0];
       
        for (Artista a : artistas1) {
            if (a.getAñosExperiencia() > max.getAñosExperiencia()) {
                max = a;
            }
        }
      
        for (Artista a : artistas2) {
            if (a.getAñosExperiencia() > max.getAñosExperiencia()) {
                max = a;
            }
        }
        return max.getNombre();
    }

    public static void main(String[] args) {
        // a)
        Artista artista1 = new Artista("Ana", "123", 10);
        Artista artista2 = new Artista("Luis", "456", 15);

        Anuncio anuncio1 = new Anuncio(1, 1000.0);

        Pintura pinturaConAnuncio = new Pintura(
            "Paisaje", "Oleo", new Artista[]{artista1}, anuncio1, "Paisajismo"
        );

        Pintura pinturaSinAnuncio = new Pintura(
            "Retrato", "Acrilico", new Artista[]{artista2}, null, "Retrato"
        );

        System.out.println("Artista con mas experiencia: " +
            artistaMasExperiencia(pinturaConAnuncio, pinturaSinAnuncio)
        );

        System.out.println("Artista con mas experiencia: " +
        artistaMasExperiencia(pinturaConAnuncio, pinturaSinAnuncio));

    //c)
        Anuncio anuncio2 = new Anuncio(2, 1200.0);
        pinturaSinAnuncio.setAnuncio(anuncio2);

    
        double totalVenta = 0;
        if (pinturaConAnuncio.getAnuncio() != null) {
            totalVenta += pinturaConAnuncio.getAnuncio().getPrecio();
        }
        if (pinturaSinAnuncio.getAnuncio() != null) {
            totalVenta += pinturaSinAnuncio.getAnuncio().getPrecio();
        }

        System.out.println("Monto total de venta: " + totalVenta);
    }


}

    
