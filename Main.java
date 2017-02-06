public class Main {
	public static void main(String[] args) {
		// default case
		Statement factorial = new Compound (
            new Assignment ("fact", new Expr ()),
	            new While (new Expr (), 
	            	new Compound (new Assignment ("fact", new Expr ()),new Assignment ("n", new Expr ()))
            				));
        factorial.print (0);
        System.out.println();

        // test case
        Statement[] myStm = {new Assignment("x",new Expr()), new Assignment("y",new Expr()),new Assignment("z",new Expr())};
        Statement myCase = new Compound(
        	new Assignment("n",new Expr()),
        		new Conditional(new Expr(),new Assignment("a",new Expr()),
        			new While(new Expr(),new Compound(myStm))));
       	myCase.print(0);
       	System.out.println();
	}
}