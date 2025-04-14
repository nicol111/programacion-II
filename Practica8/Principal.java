package Practica8;

class A {
    int x;
    int z;

    public A(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public void incrementaX() {
        this.x++;
    }

    public void incrementaZ() {
        this.z++;
    }
}

class B {
    int y;
    int z;

    public B(int y, int z) {
        this.y = y;
        this.z = z;
    }

    public void incrementaY() {
        this.y++;
    }

    public void incrementaZ() {
        this.z++;
    }
}

class D extends A {
    B b;

    public D(int x, int y, int z) {
        super(x, z);
        this.b = new B(y, z);
    }

    public void incrementaXYZ() {
        super.incrementaX();
        this.b.incrementaY();
        super.incrementaZ();
    }

    public int getY() {
        return this.b.y;
    }

    public int getZ() {
        return super.z;
    }
}

public class Principal {
    public static void main(String[] args) {
        D objetoD = new D(10, 20, 30);
        System.out.println("Valores iniciales: x=" + objetoD.x + ", y=" + objetoD.getY() + ", z=" + objetoD.getZ());

        objetoD.incrementaX();
        objetoD.b.incrementaY(); 
        objetoD.incrementaZ();   
        System.out.println("Valores despues de incrementos individuales: x=" + objetoD.x + ", y=" + objetoD.getY() + ", z=" + objetoD.getZ());

        objetoD.incrementaXYZ();
        System.out.println("Valores despues de incrementaXYZ: x=" + objetoD.x + ", y=" + objetoD.getY() + ", z=" + objetoD.getZ());
    }
}
