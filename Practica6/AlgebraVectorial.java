package Practica6;

class Vector {
    double x, y, z;
    
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    
    public Vector add(Vector b) {
        return new Vector(this.x + b.x, this.y + b.y, this.z + b.z);
    }
    
    public Vector subtract(Vector b) {
        return new Vector(this.x - b.x, this.y - b.y, this.z - b.z);
    }
    
    public double dotProduct(Vector b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }
    
    public Vector crossProduct(Vector b) {
        return new Vector(
            this.y * b.z - this.z * b.y,
            this.z * b.x - this.x * b.z,
            this.x * b.y - this.y * b.x
        );
    }
    
    public boolean isPerpendicular(Vector b) {
        return this.dotProduct(b) == 0;
    }
    
    public boolean isParallel(Vector b) {
        return this.crossProduct(b).magnitude() == 0;
    }
    
    public Vector projectionOn(Vector b) {
        double scalar = this.dotProduct(b) / b.dotProduct(b);
        return new Vector(scalar * b.x, scalar * b.y, scalar * b.z);
    }
    
    public double componentOn(Vector b) {
        return this.dotProduct(b) / b.magnitude();
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}


public class AlgebraVectorial {
    public static void main(String[] args) {
        Vector a = new Vector(3, 4, 0);
        Vector b = new Vector(6, 8, 0);
        
        System.out.println("¿a es perpendicular a b? " + a.isPerpendicular(b));
        System.out.println("¿a es paralelo a b? " + a.isParallel(b));
        System.out.println("Proyección de a sobre b: " + a.projectionOn(b));
        System.out.println("Componente de a en la dirección de b: " + a.componentOn(b));
    }
    
}
