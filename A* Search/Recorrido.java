import java.util.Stack;

public class Recorrido {

	private Stack<Nodo> recorrido;
	private Double h;
	private Double costo;

	Recorrido(){
		this.recorrido = new Stack<Nodo>();
	}

	Recorrido(Stack<Nodo> recorrido){
		this.recorrido = new Stack<Nodo>();
		for (Nodo nodo : recorrido) {
			this.recorrido.add(nodo);
		}

	}

	public void agregarNodosYCosto(Double costo, Double h, Nodo... nodos){
		this.h = h;
		this.costo = costo;
		for (Nodo nodo : nodos) {
			this.recorrido.add(nodo);
		}
	}

	public Stack<Nodo> getRecorrido() {
		return recorrido;
	}

	public void setRecorrido(Stack<Nodo> recorrido) {
		this.recorrido = recorrido;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Double getH() {
		return h;
	}

	public void setH(Double h) {
		this.h = h;
	}

	@Override
	public String toString() {
		return String.valueOf(this.recorrido) + ", Costo: " + costo;
	}

}
