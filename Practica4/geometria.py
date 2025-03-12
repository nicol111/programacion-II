import math

class Geometria:
    def area(self, figura, *args):
        if figura == "circulo":
            radio = args[0]
            return math.pi * radio ** 2
        elif figura == "rectangulo":
            base = args[0]
            altura = args[1]
            return base * altura
        elif figura == "triangulo":
            cateto1 = args[0]  
            cateto2 = args[1]
            return (cateto1 * cateto2) / 2
        elif figura == "trapecio":
            base_mayor = args[0]
            base_menor = args[1]
            altura = args[2]
            return ((base_mayor + base_menor) * altura) / 2
        elif figura == "pentagono":
            lado = args[0]
            apotema = args[1]
            perimetro = 5 * lado
            return (perimetro * apotema) / 2
        else:
            return "Figura no válida"


geometria = Geometria()

print("Area del circulo:", geometria.area("circulo", 5))
print("Area del rectangulo:", geometria.area("rectangulo", 4, 6))
print("Area del triangulo rectangulo:", geometria.area("triangulo", 3, 8))
print("Area del trapecio:", geometria.area("trapecio", 10, 6, 5))
print("Area del pentagono:", geometria.area("pentagono", 7, 5))