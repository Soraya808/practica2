
class Cola:
    def __init__(self,n):
        self.__arreglo=[None]*(n+1)
        self.__inicio=0
        self.__fin=-1
        self.__n=n
    def insert(self ,e):
        if self.__fin==self.__n:
            print("la cla esta llena")
            return
        self.__fin=(self.__fin+1)%self.__n
        self.__arreglo[self.__fin]=e
        print(e)
    def remove(self):
        if self.__inicio==0 and self.__fin==0:
            print("la cola esta vacia")
            return -1
        e = self.__arreglo[self.__inicio]
        self.__inicio=(self.__inicio+1)%self.__n
        self.__n=self.__n-1
        return e
    def isEmpty(self):
        if self.__fin+1==self.__inicio:
            return True
        else:
            return False
    def isFull(self):
        if self.__fin+2==self.__n:
            return True
        else:
            return False
    def size(self):
        return self.__fin+1
cola=Cola(5)
cola.insert(10)
cola.insert(20)
cola.insert(30)
cola.insert(40)
print("eliminado",cola.remove())
print("¿esta vacia?",cola.isEmpty())
print("la cola esta lleno",cola.isFull())
print("tamaño de la cola",cola.size())