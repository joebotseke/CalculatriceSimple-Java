
public class Calculatrice {

	public static void main(String[] args) {
		Expression deux = new Nombre(2) ;
		Expression trois = new Nombre(3) ;
		Expression dixSept = new Nombre(17) ;
		Expression s = new Soustraction(dixSept, deux) ;
		Expression a = new Addition(deux, trois) ;
	    Expression d = new Division(s, a);
		System.out.println(d + " = " + d.valeur()) ;

	}

}
