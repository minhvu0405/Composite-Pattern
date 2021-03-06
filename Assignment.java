public class Assignment extends Statement {
	private String variable;
	private Expr expr;
	public Assignment(String variable, Expr expr){
		this.variable = variable;
		this.expr = expr;
	}
	public void print(int indent) {
		printIndent(indent);
		System.out.print(variable);
		System.out.print(" := ");
		expr.print();
	}
}