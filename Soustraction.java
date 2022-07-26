
public class Soustraction extends  Operation  {

	public Soustraction(Expression oPerande1, Expression oPerande2){
		super(oPerande1, oPerande2);}
	
	@Override
	public int valeur() {
			int resulta = this.getOPerande1().valeur()-this.getOPerande2().valeur() ;   
		return resulta;}
	
	@Override
	public String toString() {
		return "("+this.getOPerande1().valeur()+"-"+this.getOPerande2().valeur()+")";
	}


}
