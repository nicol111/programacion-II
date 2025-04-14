
class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z

    def incrementaX(self):
        self.x += 1

    def incrementaZ(self):
        self.z += 1

class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z

    def incrementaY(self):
        self.y += 1

    def incrementaZ(self):
        self.z += 1

class D(A, B):
    def __init__(self, x, y, z):
        A.__init__(self, x, z)
        B.__init__(self, y, z)

    def incrementaXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1

objeto_d = D(10, 20, 30)
print(f"Valores iniciales: x={objeto_d.x}, y={objeto_d.y}, z={objeto_d.z}")

objeto_d.incrementaX()
objeto_d.incrementaY()
objeto_d.incrementaZ()
print(f"Valores despues de incrementos individuales: x={objeto_d.x}, y={objeto_d.y}, z={objeto_d.z}")

objeto_d.incrementaXYZ()
print(f"Valores despues de incrementaXYZ: x={objeto_d.x}, y={objeto_d.y}, z={objeto_d.z}")