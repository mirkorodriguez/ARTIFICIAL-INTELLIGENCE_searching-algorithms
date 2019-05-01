public class AppPrincipal {

	public static void main(String[] args) {

		//Crear los Nodos
		Nodo I = new Nodo("I", 7.0);
		Nodo A = new Nodo("A", 6.0);
		Nodo B = new Nodo("B", 2.0);
		Nodo C = new Nodo("C", 1.0);
		Nodo F = new Nodo("F", 0.0);

		//Agregar nodos hijos
		I.agregarNodoHijo(A, 1.0);
		I.agregarNodoHijo(B, 4.0);
		A.agregarNodoHijo(B, 2.0);
		A.agregarNodoHijo(C, 5.0);
		A.agregarNodoHijo(F, 12.0);
		B.agregarNodoHijo(C, 2.0);
		C.agregarNodoHijo(F, 3.0);


		System.out.println("\n======================");
		System.out.println("Algoritmo A* / A Star:");
		System.out.println("======================");

		AStar aStart = new AStar();
		aStart.buscar(I,F);

	}
}
