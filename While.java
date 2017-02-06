public  class While extends Statement {
	private Expr whileExpr;
	private Statement doStatement;
	public While(Expr whileExpr,Statement doStatement){
		this.whileExpr = whileExpr;
		this.doStatement = doStatement;
	}
	public void print(int indent) {
		printIndent(indent);
		System.out.print("while ");
		whileExpr.print();
		System.out.print(" do");
		doStatement.print(indent+1);
	}
}