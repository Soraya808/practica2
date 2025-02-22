import matplotlib.pyplot as plt
import numpy as np
class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2
    
    def __str__(self):
        return f'Linea de {self.p1} a {self.p2}'
    
    def dibujaLinea(self):
        plt.plot([self.p1[0], self.p2[0]], [self.p1[1], self.p2[1]], marker='o')
        plt.xlim(min(self.p1[0], self.p2[0]) - 1, max(self.p1[0], self.p2[0]) + 1)
        plt.ylim(min(self.p1[1], self.p2[1]) - 1, max(self.p1[1], self.p2[1]) + 1)
        plt.grid()
        plt.show()

pip