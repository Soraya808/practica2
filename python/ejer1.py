import matplotlib.pyplot as plt


class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f'Linea de {self.p1} a {self.p2}'

    def dibujaLinea(self):
        print(f"Dibujando línea desde {self.p1} hasta {self.p2}")  # Para depuración

        # Crear figura
        plt.figure(figsize=(6, 6))

        # Dibujar la línea con marcadores en los puntos
        plt.plot([self.p1[0], self.p2[0]], [self.p1[1], self.p2[1]], 'bo-', label="Línea")

        # Configurar ejes
        plt.xlim(min(self.p1[0], self.p2[0]) - 2, max(self.p1[0], self.p2[0]) + 2)
        plt.ylim(min(self.p1[1], self.p2[1]) - 2, max(self.p1[1], self.p2[1]) + 2)

        # Agregar etiquetas y grid
        plt.xlabel("Eje X")
        plt.ylabel("Eje Y")
        plt.title("Gráfico de Línea")
        plt.legend()
        plt.grid(True)

        # Mostrar gráfico
        plt.show(block=True)  # Asegura que la ventana no se cierre inmediatamente


# Prueba con datos
p1 = (0, 0)
p2 = (5, 7)
linea = Linea(p1, p2)
print(linea)
linea.dibujaLinea()





