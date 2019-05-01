import java.util.ArrayList;
import java.util.List;

public class Nodo {

	private String nombre;
	private boolean visitado;
	private final double h;
	private List<DistanciaNodoHijo> distanciaNodosHijo;

	Nodo(double h){
		this.h = h;
		distanciaNodosHijo = new ArrayList<DistanciaNodoHijo>();
	}

	public Nodo(String nombre, double h) {
		this.h = h;
		this.nombre = nombre;
		distanciaNodosHijo = new ArrayList<DistanciaNodoHijo>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getH() {
		return h;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public void agregarNodoHijo(Nodo nodo, Double distancia){
		DistanciaNodoHijo distanciaNodo = new DistanciaNodoHijo(nodo, distancia);
		distanciaNodosHijo.add(distanciaNodo);
	}

	public List<DistanciaNodoHijo> getNodosHijo() {
		return distanciaNodosHijo;
	}

	@Override
	public String toString() {
		return this.nombre;
	}

}
