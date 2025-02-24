import tkinter as tk

class Punto:
    def __init__(self, x: int, y: int):
        self.x = x
        self.y = y

class Circulo:
    def __init__(self, centro: Punto, radio: float):
        self.centro = centro
        self.radio = radio

    def dibujaCirculo(self):
        ventana = tk.Tk()
        ventana.title("Dibujar Círculo")
        ventana.geometry("420x440")
        ventana.resizable(False, False)

        canvas = tk.Canvas(ventana, width=600, height=600, bg="white")
        canvas.pack()

        x1 = (self.centro.x * 10) - (self.radio * 10)
        y1 = (self.centro.y * 10) - (self.radio * 10)
        x2 = (self.centro.x * 10) + (self.radio * 10)
        y2 = (self.centro.y * 10) + (self.radio * 10)

        canvas.create_oval(x1, y1, x2, y2, outline="pink", width=2)

        ventana.mainloop()


if __name__ == "__main__":
    centro = Punto(20, 20)
    radio = 7.5
    circulo = Circulo(centro, radio)
    circulo.dibujaCirculo()
