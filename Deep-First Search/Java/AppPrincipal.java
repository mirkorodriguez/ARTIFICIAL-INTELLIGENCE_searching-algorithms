
public class AppPrincipal {

	public static void main(String[] args) {

		Nodo nodo1 = new Nodo(1,false);
		Nodo nodo2 = new Nodo(2,false);
		Nodo nodo3 = new Nodo(3,false);
		Nodo nodo4 = new Nodo(4,false);
		Nodo nodo5 = new Nodo(5,false);

		nodo1.agregarVecinos(nodo2);
		nodo1.agregarVecinos(nodo3);
		nodo2.agregarVecinos(nodo4);
		nodo3.agregarVecinos(nodo5);

		DeepFirstSearch deepFirstSearch = new DeepFirstSearch();
		deepFirstSearch.buscar(nodo1);

	}
}
