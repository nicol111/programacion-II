package Practica4;

public class geometria {

    public static double area(double radio) {
        return Math.PI * radio * radio;
    }

    public static double area(double base, double altura) {
        return base * altura;
    }

    public static double area(double base, double altura, String triangulo) {
        return (base * altura) / 2;
    }

    public static double area(double baseMayor, double baseMenor, double altura, String trapecio) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public static double area(String pentagono, double lado, double apotema) {
        double perimetro = 5 * lado;
        return (perimetro * apotema) / 2;
    }

    public static void main(String[] args) {
        System.out.println("Área del círculo: " + area(5));
        System.out.println("Área del rectángulo: " + area(4, 6));
        System.out.println("Área del triángulo: " + area(3, 8, "triangulo"));
        System.out.println("Área del trapecio: " + area(10, 6, 5, "trapecio"));
        System.out.println("Área del pentágono: " + area("pentagono", 7, 5));
    }
}
