
public class AppPrincipal {

	public static void main(String[] args) {

		//Crear los Nodos
		Nodo tumbes = new Nodo("tumbes");
		Nodo trujillo = new Nodo("trujillo");
		Nodo moyobamba = new Nodo("moyobamba");
		Nodo iquitos = new Nodo("iquitos");
		Nodo lima = new Nodo("lima");
		Nodo huancayo = new Nodo("huancayo");
		Nodo puertoMaldonado = new Nodo("puertoMaldonado");
		Nodo nazca = new Nodo("nazca");
		Nodo cusco = new Nodo("cusco");
		Nodo arequipa = new Nodo("arequipa");

		//Agregar nodos hijos
		tumbes.agregarNodo(trujillo);
		tumbes.agregarNodo(moyobamba);
		tumbes.agregarNodo(iquitos);

		trujillo.agregarNodo(lima);
		trujillo.agregarNodo(huancayo);

		moyobamba.agregarNodo(huancayo);

		iquitos.agregarNodo(huancayo);
		iquitos.agregarNodo(cusco);

		lima.agregarNodo(nazca);

		huancayo.agregarNodo(arequipa);
		huancayo.agregarNodo(puertoMaldonado);

		nazca.agregarNodo(arequipa);

		cusco.agregarNodo(arequipa);

		puertoMaldonado.agregarNodo(arequipa);

		System.out.println("\nBreadth First Search: ");
		BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
		breadthFirstSearch.buscar(tumbes,arequipa);

		System.out.println("\n\nDeep First Search: ");
		DeepFirstSearch deepFirstSearch = new DeepFirstSearch();
		deepFirstSearch.buscar(tumbes,arequipa);

	}
}
