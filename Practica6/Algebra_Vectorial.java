package Practica6;

class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D add(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector3D multiply(double scalar) {
        return new Vector3D(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D normalize() {
        double mag = magnitude();
        return new Vector3D(x / mag, y / mag, z / mag);
    }

    public double dotProduct(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public Vector3D crossProduct(Vector3D v) {
        return new Vector3D(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}


public class Algebra_Vectorial {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(2, 3, 4);
        Vector3D b = new Vector3D(1, 5, 7);

        System.out.println("Suma de vectores:");
        a.add(b).print();

        System.out.println("Multiplicación por escalar:");
        a.multiply(3).print();

        System.out.println("Magnitud del vector a:");
        System.out.println(a.magnitude());

        System.out.println("Vector normalizado:");
        a.normalize().print();

        System.out.println("Producto escalar:");
        System.out.println(a.dotProduct(b));

        System.out.println("Producto vectorial:");
        a.crossProduct(b).print();
    }
}
