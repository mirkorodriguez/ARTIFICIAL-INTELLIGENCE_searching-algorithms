
import java.util.ArrayList;
import java.util.List;

public class Nodo {

	private int valor;
	private boolean visitado;
	private List<Nodo> vecinosList;

	public Nodo(int valor, boolean visitado){
		this.valor=valor;
		this.visitado=visitado;
		this.vecinosList = new ArrayList<>();
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public List<Nodo> getVecinosList() {
		return vecinosList;
	}

	public void setVecinosList(List<Nodo> vecinosList) {
		this.vecinosList = vecinosList;
	}

	public void agregarVecinos(Nodo vecino) {
		this.vecinosList.add(vecino);
	}

	@Override
	public String toString() {
		return ""+this.valor;
	}
}
