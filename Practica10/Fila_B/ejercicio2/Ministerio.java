package Practica10.Fila_B.ejercicio2;

public class Ministerio {
    // inciso a)
    String nombre;
    String direccion;
    int nroEmpleados;
    String[] empleados;
    int[] edades;
    double[] sueldos;

    
    // Constructor 1
    public Ministerio(String nombre, String direccion, String[] empleados, int[] edades, double[] sueldos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = empleados.length;
        this.empleados = empleados;
        this.edades = edades;
        this.sueldos = sueldos;
    }

    // Constructor 2

    public Ministerio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = 0;
        this.empleados = new String[100];
        this.edades = new int[100];
        this.sueldos = new double[100];
    }

    // inciso b)

    public void eliminarPorEdad(int edadX) {
        int j = 0;
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] != edadX) {
                empleados[j] = empleados[i];
                edades[j] = edades[i];
                sueldos[j] = sueldos[i];
                j++;
            }
        }
        nroEmpleados = j;
    }

    // inciso d)
    public void mostrarMenorEdad() {
        int minEdad = Integer.MAX_VALUE;
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] < minEdad) minEdad = edades[i];
        }
        System.out.println("Empleados con menor edad:");
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == minEdad) {
                System.out.println(empleados[i] + " (" + edades[i] + " años)");
            }
        }
    }

  
    public void mostrarMenorSueldo() {
        double minSueldo = Double.MAX_VALUE;
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] < minSueldo) minSueldo = sueldos[i];
        }
        System.out.println("Empleados con menor sueldo:");
        for (int i = 0; i < nroEmpleados; i++) {
            if (sueldos[i] == minSueldo) {
                System.out.println(empleados[i] + " ($" + sueldos[i] + ")");
            }
        }
    }
}
