from itertools import filterfalse


class Pila:
    def __init__(self,n):
        self.__arreglo=[None]*(n+1)
        self.__n=n
        self.__top=0
    def push(self,e):
         self.__top += 1
         self.__arreglo[self.__top]=e
         print(e)
    def pop(self):
        e=self.__arreglo[self.__top]
        self.__top=self.__top-1
        return e
    def peek(self):
        return self.__arreglo[self.__top]
    def  isEmpty(self):
        if  self.__top==0:
            return True
        else:
            return False
    def isFull(self):
        if self.__top==self.__n:
            return True
        else:
            return False
pila = Pila(6)
pila.push(10)
pila.push(20)
pila.push(30)
print("eliminado",pila.pop())
print("ultimo elemento:",pila.peek())
print("¿esta vacia?",pila.isEmpty())
print("esta llena",pila.isFull())



