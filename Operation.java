
public abstract class Operation extends  Expression {
	private Expression OPerande1 ;
	private Expression OPerande2 ;

	public Operation(Expression deux, Expression trois) {
		OPerande1 = deux;
		OPerande2 = trois;
	}
	
	Expression getOPerande1() {
			return OPerande1 ;
		}
	Expression getOPerande2() {
			return OPerande2 ;
		}
}
