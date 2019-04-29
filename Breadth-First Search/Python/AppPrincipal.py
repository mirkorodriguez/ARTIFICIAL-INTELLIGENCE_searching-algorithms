class Nodo(object):

    # Atributos
    valor = 0
    visitado = False
    vecinosList = []

    # Metodos
    def __init__(self, valor, visitado):
        self.valor = valor
        self.visitado = visitado

    def setValor(self,valor):
        self.valor = valor

    def getValor(self):
        return self.valor

    def setVisitado(self,visitado):
        self.visitado = visitado

    def isVisitado(self):
        return self.visitado

    def setVecinosList(self,vecinosList):
        self.vecinosList = vecinosList

    def getVecinosList(self):
        return self.vecinosList

    def cantidadVecinos(self):
        return len(self.vecinosList)

    def imprimir(self):
        print (self.valor,self.visitado)



class BreadthFirstSearch(object):
    # Atributos
    cola = []

    # Metodos
    def buscar(self, nodoBase):
        nodoBase.setVisitado(True)
        self.cola.append(nodoBase)

        while ( len(self.cola) > 0 ):
            self.imprimirCola()
            nodoActual = self.cola.pop(0) #FIFO
            print (" --> Nodo a evaluar:", nodoActual.getValor())

            for i in range(0,nodoActual.cantidadVecinos()):
                # print (i)
                if ( not nodoActual.vecinosList[i].isVisitado() ):
                    nodoActual.vecinosList[i].setVisitado(True)
                    self.cola.append(nodoActual.vecinosList[i])

    def imprimirCola(self):
        listContent = "["
        for i in range(0,len(self.cola)):
            valor = str(self.cola[i].getValor())
            listContent += " " + valor
        print ("Cola:",listContent,"]",end = '')


nodo1 = Nodo(1,False)
nodo2 = Nodo(2,False)
nodo3 = Nodo(3,False)
nodo4 = Nodo(4,False)
nodo5 = Nodo(5,False)

nodo1.setVecinosList([nodo2,nodo3])
nodo2.setVecinosList([nodo4])
nodo3.setVecinosList([nodo5])

bfs = BreadthFirstSearch()
bfs.buscar(nodo1)
