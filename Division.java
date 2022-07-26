
public class Division  extends  Operation {


	public Division(Expression oPerande1, Expression oPerande2) {
		super(oPerande1, oPerande2);
		if (oPerande2.equals(null) ) {
				try {
					throw new Exception("L'opération divisée par null n'est pas possiblee");
				} catch (Exception e) {
					e.printStackTrace();
				}}
	}

	public int valeur() {
		 int  resulta = 0 ;
		try {
			resulta  =this.getOPerande1().valeur()/this.getOPerande2().valeur() ;
            
        }
        catch (ArithmeticException e) {
            System.err.println("L'opération divisée par zéro n'est pas possiblee");
        }
		return resulta;
	}
	
	
	public String toString() {
		return "("+this.getOPerande1().valeur()+"/"+this.getOPerande2().valeur()+")";
	}


}
