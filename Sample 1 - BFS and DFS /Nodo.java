import java.util.ArrayList;
import java.util.List;

public class Nodo {

	private String nombre;
	private List<Nodo> vecinosList;
	
	Nodo(){
		vecinosList = new ArrayList<>();
	}
	
	public Nodo(String nombre) {
		this.nombre = nombre;
		vecinosList = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Nodo> getVecinosList() {
		return vecinosList;
	}

	public void setVecinosList(List<Nodo> vecinosList) {
		this.vecinosList = vecinosList;
	}

	public void agregarNodo(Nodo nodo){
		vecinosList.add(nodo);
	}

	@Override
	public String toString() {
		return this.nombre;
	}
	
}
