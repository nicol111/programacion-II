package Practica6;
import java.lang.Math;

public class AlgebraVectorial {
    private double[] vectorA;
    private double[] vectorB;

    public AlgebraVectorial(double[] vectorA, double[] vectorB) {
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public AlgebraVectorial(double[] vectorA) {
        this.vectorA = vectorA;
        this.vectorB = null; 
    }
   
    public boolean esPerpendicularA() {
        if (vectorB == null) return false; 
        double[] suma = sumarVectores(vectorA, vectorB);
        double[] resta = restarVectores(vectorA, vectorB);
        return vectoresIguales(suma, resta);
    }

    public boolean esPerpendicularB() {
        if (vectorB == null) return false; 
        double[] restaAB = restarVectores(vectorA, vectorB);
        double[] restaBA = restarVectores(vectorB, vectorA);
        return vectoresIguales(restaAB, restaBA);
    }

    public boolean esPerpendicularC() {
        if (vectorB == null) return false; 
        return productoPunto(vectorA, vectorB) == 0;
    }

    public boolean esPerpendicularD() {
        if (vectorB == null) return false; 
        double[] suma = sumarVectores(vectorA, vectorB);
        double moduloSumaCuadrado = moduloCuadrado(suma);
        double moduloACuadrado = moduloCuadrado(vectorA);
        double moduloBCuadrado = moduloCuadrado(vectorB);
        return moduloSumaCuadrado == moduloACuadrado + moduloBCuadrado;
    }

    public boolean esParalelaE() {
        if (vectorB == null) return false; 
        if (vectorB.length != vectorA.length) return false;
        if (vectoresIguales(vectorA, vectorB)) return true; 
        double r = vectorA[0] / vectorB[0];
        for (int i = 1; i < vectorA.length; i++) {
            if (vectorA[i] / vectorB[i] != r) return false;
        }
        return true;
    }

    public boolean esParalelaF() {
        if (vectorB == null) return false; 
        if (vectorA.length != 3 || vectorB.length != 3) return false; 
        double[] productoCruz = productoCruz(vectorA, vectorB);
        return vectoresIguales(productoCruz, new double[] {0, 0, 0});
    }

    public double[] proyeccionDeASobreB() {
        if (vectorB == null) return null; 
        double productoPunto = productoPunto(vectorA, vectorB);
        double moduloBCuadrado = moduloCuadrado(vectorB);
        double[] proyeccion = new double[vectorB.length];
        for (int i = 0; i < vectorB.length; i++) {
            proyeccion[i] = (productoPunto / moduloBCuadrado) * vectorB[i];
        }
        return proyeccion;
    }

    public double componenteDeAEnB() {
        if (vectorB == null) return Double.NaN; 
        double productoPunto = productoPunto(vectorA, vectorB);
        double moduloB = Math.sqrt(moduloCuadrado(vectorB));
        return productoPunto / moduloB;
    }

    private double[] sumarVectores(double[] v1, double[] v2) {
        double[] resultado = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i] + v2[i];
        }
        return resultado;
    }

    private double[] restarVectores(double[] v1, double[] v2) {
        double[] resultado = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i] - v2[i];
        }
        return resultado;
    }

    private double productoPunto(double[] v1, double[] v2) {
        double resultado = 0;
        for (int i = 0; i < v1.length; i++) {
            resultado += v1[i] * v2[i];
        }
        return resultado;
    }

    private double moduloCuadrado(double[] v) {
        double resultado = 0;
        for (double d : v) {
            resultado += d * d;
        }
        return resultado;
    }

    private double[] productoCruz(double[] v1, double[] v2) {
        return new double[] {
            v1[1] * v2[2] - v1[2] * v2[1],
            v1[2] * v2[0] - v1[0] * v2[2],
            v1[0] * v2[1] - v1[1] * v2[0]
        };
    }

    private boolean vectoresIguales(double[] v1, double[] v2) {
        if (v1.length != v2.length) return false;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        double[] vector1 = {1, 2, 3};
        double[] vector2 = {-2, 1, 0};

        AlgebraVectorial algebra = new AlgebraVectorial(vector1, vector2);

        System.out.println("¿Son perpendiculares (a + b = a - b)? " + algebra.esPerpendicularA());
        System.out.println("¿Son perpendiculares (a - b = b - a)? " + algebra.esPerpendicularB());
        System.out.println("¿Son perpendiculares (a · b = 0)? " + algebra.esPerpendicularC());
        System.out.println("¿Son perpendiculares (|a + b|² = |a|² + |b|²)? " + algebra.esPerpendicularD());
        System.out.println("¿Son paralelos (a = r * b)? " + algebra.esParalelaE());
        System.out.println("¿Son paralelos (a x b = 0)? " + algebra.esParalelaF());

        double[] proyeccion = algebra.proyeccionDeASobreB();
        System.out.print("Proyección de a sobre b: ");
        for (double d : proyeccion) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Componente de a en la dirección de b: " + algebra.componenteDeAEnB());
    }
}