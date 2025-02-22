import matplotlib.pyplot as plt

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f'Circulo con centro en {self.centro} y radio {self.radio}'

    def dibujaCirculo(self):
        print(f"Dibujando círculo con centro en {self.centro} y radio {self.radio}")  # Depuración

        # Crear figura y ejes
        fig, ax = plt.subplots(figsize=(6, 6))

        # Crear círculo
        circulo = plt.Circle(self.centro, self.radio, fill=False, edgecolor='b', linewidth=2)

        # Agregar círculo a la figura
        ax.add_patch(circulo)

        # Configurar límites de los ejes
        ax.set_xlim(self.centro[0] - self.radio - 2, self.centro[0] + self.radio + 2)
        ax.set_ylim(self.centro[1] - self.radio - 2, self.centro[1] + self.radio + 2)

        # Ajustar proporciones y agregar grid
        ax.set_aspect('equal')
        plt.grid(True)

        # Mostrar gráfico
        plt.show(block=True)  # Asegura que la ventana no se cierre de inmediato

# Prueba con datos
centro = (5, 5)
radio = 3
circulo = Circulo(centro, radio)
print(circulo)
circulo.dibujaCirculo()
