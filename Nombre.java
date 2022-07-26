
public class Nombre  extends Expression{
	private int valeurNombre ;

	public Nombre(int valeurNombre) {
		this.valeurNombre = valeurNombre;
	}

	public int valeur() {
		return valeurNombre;
	}

	@Override
	public String toString() {
		return String.valueOf(valeurNombre);
	}

	
}
   