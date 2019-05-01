public class DistanciaNodoHijo {

	private Nodo nodoHijo;
	private Double distancia;

	DistanciaNodoHijo(Nodo nodo, Double distancia){
		this.nodoHijo = nodo;
		this.distancia = distancia;
	}

	public Nodo getNodoHijo() {
		return nodoHijo;
	}

	public void setNodoHijo(Nodo nodoHijo) {
		this.nodoHijo = nodoHijo;
	}

	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	@Override
	public String toString() {
		return this.nodoHijo.getNombre() + " " + distancia;
	}

}
