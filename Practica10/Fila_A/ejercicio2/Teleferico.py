# inciso c)

class LineaTeleferico:
    def __init__(self, color, tramo, nro_cabinas):
        self.color = color
        self.tramo = tramo
        self.nro_cabinas = nro_cabinas
        self.empleados = []  

    def agregar_empleado(self, nombre, ap_paterno, ap_materno, edad, sueldo):
        self.empleados.append((nombre, ap_paterno, ap_materno, edad, sueldo))

    def __add__(self, other):
        if self.empleados:
            empleado = self.empleados.pop(0)
            other.empleados.append(empleado)
        return other
