package Practica10.Fila_A.ejercicio2;

// inciso a)

public class LineaTeleferico {
    String color;
    String tramo;
    int nroCabinas;
    int nroEmpleados;
    String[][] empleados = new String[100][3]; 
    int[] edades = new int[100];
    int[] sueldos = new int[100];

    // Constructor 1
    public LineaTeleferico(String color, String tramo, int nroCabinas) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
        this.nroEmpleados = 0;
    }

    // Constructor vacío (otra forma)
    public LineaTeleferico() {
        this.color = "No definido";
        this.tramo = "No definido";
        this.nroCabinas = 0;
        this.nroEmpleados = 0;
    }

    public void agregarEmpleado(String nombre, String apPaterno, String apMaterno, int edad, int sueldo) {
        empleados[nroEmpleados][0] = nombre;
        empleados[nroEmpleados][1] = apPaterno;
        empleados[nroEmpleados][2] = apMaterno;
        edades[nroEmpleados] = edad;
        sueldos[nroEmpleados] = sueldo;
        nroEmpleados++;
    }

    // inciso b)

    public void eliminarEmpleadosConApellido(String apellido) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i][1].equalsIgnoreCase(apellido) || empleados[i][2].equalsIgnoreCase(apellido)) {
            
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[j] = empleados[j + 1];
                    edades[j] = edades[j + 1];
                    sueldos[j] = sueldos[j + 1];
                }
                nroEmpleados--;
                i--; 
            }
        }
    }

    // inciso d)

    public void mostrarEmpleadoMayorEdad() {
        if (nroEmpleados == 0) return;
        int maxEdad = edades[0];
        int idx = 0;
        for (int i = 1; i < nroEmpleados; i++) {
            if (edades[i] > maxEdad) {
                maxEdad = edades[i];
                idx = i;
            }
        }
        System.out.println("Empleado con mayor edad: " + empleados[idx][0] + " " + empleados[idx][1] + " " + empleados[idx][2] + ", Edad: " + maxEdad);
    }

    public void mostrarEmpleadoMayorSueldo() {
        if (nroEmpleados == 0) return;
        int maxSueldo = sueldos[0];
        int idx = 0;
        for (int i = 1; i < nroEmpleados; i++) {
            if (sueldos[i] > maxSueldo) {
                maxSueldo = sueldos[i];
                idx = i;
            }
        }
        System.out.println("Empleado con mayor sueldo: " + empleados[idx][0] + " " + empleados[idx][1] + " " + empleados[idx][2] + ", Sueldo: " + maxSueldo);
    }
    
    
}

