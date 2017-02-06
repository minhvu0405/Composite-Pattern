public class Conditional extends Statement {
	private Expr ifExpr;
	private Statement thenStatement;
	private Statement elseStatement;
	public Conditional(Expr ifExpr,Statement thenStatement,Statement elseStatement){
		this.ifExpr = ifExpr;
		this.thenStatement = thenStatement;
		this.elseStatement = elseStatement;
	}
	public void print(int indent) {
		printIndent(indent);
		System.out.print("if ");
		ifExpr.print();
		printIndent(indent);
		System.out.print("then");
		thenStatement.print(indent+1);
		printIndent(indent);
		System.out.print("else");
		elseStatement.print(indent+1);
	}
}