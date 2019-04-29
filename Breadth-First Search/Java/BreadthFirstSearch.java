
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	Queue<Nodo> cola = new LinkedList<>(); //FIFO

	public void buscar(Nodo nodoBase){

		nodoBase.setVisitado(true);
		cola.add(nodoBase);

		while( !cola.isEmpty() ){
			System.out.print("Cola: " + cola);

			Nodo nodoActual = cola.remove(); //FIFO

			System.out.println(" --> Nodo a evaluar: " + nodoActual);

			for( Nodo v : nodoActual.getVecinosList() ){

				if( !v.isVisitado() ){

					v.setVisitado(true);
					cola.add(v);

				}
			}

		}
	}
}
