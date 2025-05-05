
  # inciso c)
class Ministerio:
    def __init__(self, nombre, empleados=None, edades=None, sueldos=None):
        self.nombre = nombre
        self.empleados = empleados or []
        self.edades = edades or []
        self.sueldos = sueldos or []

  
    def __add__(self, other):
       
        if other.empleados:
            self.empleados.append(other.empleados.pop())
            self.edades.append(other.edades.pop())
            self.sueldos.append(other.sueldos.pop())
        return self
