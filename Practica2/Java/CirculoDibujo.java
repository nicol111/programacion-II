package Practica2.Java;
import javax.swing.*;
import java.awt.*;


class Punto {
    public int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circulo extends JPanel {
    Punto centro;
    float radio;


    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
        setPreferredSize(new Dimension(600, 600)); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.PINK);
        g.drawOval(centro.x * 10, centro.y * 10, (int) (2 * radio * 10), (int) (2 * radio * 10)); 
    }

    public void dibujaCirculo() {
        JFrame frame = new JFrame("Dibujar Círculo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(620, 640);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); 
        frame.add(this);
        frame.setVisible(true);
    }
}


public class CirculoDibujo {
    public static void main(String[] args) {
        Punto centro = new Punto(20, 20); 
        float radio = 7.5f;
        Circulo circulo = new Circulo(centro, radio);
        circulo.dibujaCirculo();
    }
}


