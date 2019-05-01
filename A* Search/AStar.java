import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AStar {

	List<Recorrido> recorridos = new ArrayList<Recorrido>();
	Recorrido recorridoMin = new Recorrido();

	/**
	 * Inicia algoritmo A* para llegar del nodoInicial al nodoFinal
	 * @param nodoInicial
	 * @param nodoFinal
	 */
	public void buscar(Nodo nodoInicial, Nodo nodoFinal) {

		//Inicia con el nodoInicial como nodoActual
		Nodo nodoActual = nodoInicial;
		recorridoMin.agregarNodosYCosto(0.0,0.0,nodoActual);

		do{
			System.out.println("\n\n-------------------");
			System.out.println("| nodoActual: {" + nodoActual + "} |");
			System.out.println("-------------------\n");

			Stack<Nodo> recorridoActual = recorridoMin.getRecorrido();
			System.out.println("recorridoActual: " + recorridoActual);

			Double costoActual = recorridoMin.getCosto() - recorridoMin.getH();
			System.out.println("costoActual: " + costoActual);

			List<DistanciaNodoHijo> distanciaNodosHijo = nodoActual.getNodosHijo();

			for (DistanciaNodoHijo distanciaNodoHijo : distanciaNodosHijo) {
				Nodo nodoHijo = distanciaNodoHijo.getNodoHijo();
				Double distancia = distanciaNodoHijo.getDistancia();

				//calculando el costo del NodoActual al NodoHijo
				// f = g + h
				Double costo = distancia + nodoHijo.getH();
				costo += costoActual;

				System.out.print(" > NodoHijo: " + nodoHijo + " | distancia: " + distancia);

				Recorrido recorrido = new Recorrido(recorridoActual);
				recorrido.agregarNodosYCosto(costo,nodoHijo.getH(),nodoHijo);
				recorridos.add(recorrido);
				System.out.println("  --> Recorrido: " + recorrido);
			}
			System.out.println(" >Recorridos: " + recorridos);

			recorridoMin = this.evaluar(recorridos);
			recorridos.remove(recorridoMin);
			nodoActual = recorridoMin.getRecorrido().lastElement();
			System.out.println(" *recorridoMin: " + recorridoMin);

		}while(!recorridoMin.getRecorrido().contains(nodoFinal));

	}

	/**
	 * Calcula el recorrido con costo minimo
	 * @param recorridos
	 * @return
	 */
	public Recorrido evaluar(List<Recorrido> recorridos) {

		Double costoMin = 99999.0;
		int j = 0;
		for (int i = 0; i < recorridos.size(); i++) {
			Double costoActual = recorridos.get(i).getCosto();
			if (costoActual < costoMin) {
				costoMin = costoActual;
				j = i;
			}
		}

		return recorridos.get(j);
	}

}
