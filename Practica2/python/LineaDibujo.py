import tkinter as tk

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def dibujalinea(self):
        ventana = tk.Tk()
        ventana.title("Dibujar Línea")
        ventana.geometry("500x500")

        canvas = tk.Canvas(ventana, width=600, height=600, bg="white")
        canvas.pack()

        canvas.create_line(self.p1[0] * 50, self.p1[1] * 50, 
                           self.p2[0] * 50, self.p2[1] * 50, 
                           fill="pink", width=2)

        ventana.mainloop()


punto1 = (3, 3)
punto2 = (6, 6)


linea = Linea(punto1, punto2)
linea.dibujalinea()
