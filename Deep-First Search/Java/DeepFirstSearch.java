
import java.util.LinkedList;
import java.util.Stack;

public class DeepFirstSearch {

	Stack<Nodo> pila = new Stack<>(); //LIFO

	public void buscar(Nodo nodoBase){

		nodoBase.setVisitado(true);
		pila.add(nodoBase);

		while( !pila.isEmpty() ){
			System.out.print("Pila: " + pila);

			Nodo nodoActual = pila.pop(); //LIFO

			System.out.println(" --> Nodo a evaluar: " + nodoActual);

			for( Nodo v : nodoActual.getVecinosList() ){

				if( !v.isVisitado() ){

					v.setVisitado(true);
					pila.add(v);

				}
			}

		}
	}
}
