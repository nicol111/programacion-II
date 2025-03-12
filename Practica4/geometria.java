package Practica4;

public class geometria {

    public static double area(double radio) {
        return Math.PI * radio * radio;
    }

    public static double area(double base, double altura) {
        return base * altura;
    }

    public static double area(double cateto1, double cateto2, String triangulo_rect) {
        return (cateto1 * cateto2) / 2;
    }

    public static double area(double baseMayor, double baseMenor, double altura, String trapecio) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public static double area(String pentagono, double lado, double apotema) {
        double perimetro = 5 * lado;
        return (perimetro * apotema) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Area del circulo: " + area(5));
        System.out.println("Area del rectangulo: " + area(4, 6));
        System.out.println("Area del triangulo rectangulo: " + area(3, 8, "triangulo_rect"));
        System.out.println("Area del trapecio: " + area(10, 6, 5, "trapecio"));
        System.out.println("Area del pentagono: " + area("pentagono", 7, 5));
    }
}
