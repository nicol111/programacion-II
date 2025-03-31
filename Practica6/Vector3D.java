package Practica6;
import java.lang.Math;

public class Vector3D {
    private double a1, a2, a3;

    public Vector3D(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public Vector3D sumar(Vector3D otro) {
        return new Vector3D(this.a1 + otro.a1, this.a2 + otro.a2, this.a3 + otro.a3);
    }

    public Vector3D multiplicarEscalar(double r) {
        return new Vector3D(r * this.a1, r * this.a2, r * this.a3);
    }

    public double longitud() {
        return Math.sqrt(a1 * a1 + a2 * a2 + a3 * a3);
    }

    public Vector3D normal() {
        double longitud = this.longitud();
        return new Vector3D(a1 / longitud, a2 / longitud, a3 / longitud);
    }

    public double productoEscalar(Vector3D otro) {
        return this.a1 * otro.a1 + this.a2 * otro.a2 + this.a3 * otro.a3;
    }

    public Vector3D productoVectorial(Vector3D otro) {
        return new Vector3D(this.a2 * otro.a3 - this.a3 * otro.a2,
                             this.a3 * otro.a1 - this.a1 * otro.a3,
                             this.a1 * otro.a2 - this.a2 * otro.a1);
    }

    public void imprimir() {
        System.out.println("(" + a1 + ", " + a2 + ", " + a3 + ")");
    }

    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);

        System.out.print("v1: ");
        v1.imprimir();
        System.out.print("v2: ");
        v2.imprimir();

        System.out.print("v1 + v2: ");
        v1.sumar(v2).imprimir();

        System.out.print("2 * v1: ");
        v1.multiplicarEscalar(2).imprimir();

        System.out.println("Longitud de v1: " + v1.longitud());

        System.out.print("Normal de v1: ");
        v1.normal().imprimir();

        System.out.println("v1 · v2: " + v1.productoEscalar(v2));

        System.out.print("v1 x v2: ");
        v1.productoVectorial(v2).imprimir();
    }
}