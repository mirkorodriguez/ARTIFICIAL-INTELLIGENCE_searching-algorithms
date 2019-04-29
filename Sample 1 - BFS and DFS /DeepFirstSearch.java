import java.util.List;
import java.util.Stack;

public class DeepFirstSearch {

	public void buscar(Nodo raiz, Nodo objetivo) {

		Stack<Nodo> pila = new Stack<>();//LIFO
		pila.add(raiz);

		do{
			System.out.println(pila);

			if(pila.contains(objetivo)){
				System.out.println("--> Found: " + objetivo);
				return;
			}

			//Evaluar Nodo y Removerlo
			Nodo nodoActual = pila.pop();

			//Expandir
			List<Nodo> vecinos = nodoActual.getVecinosList();

			for (Nodo ciudad : vecinos) {
				if(!pila.contains(ciudad)){
					pila.add(ciudad);
				}
			}


		}while(!pila.isEmpty());

	}

}
