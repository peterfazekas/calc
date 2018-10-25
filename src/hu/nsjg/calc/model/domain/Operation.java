package hu.nsjg.calc.model.domain;

public class Operation {
	
	private final int op1;
	private final int op2;
	private final String operator;
	private final int result;
	
	public Operation(int op1, int op2, String operator, int result) {
		this.op1 = op1;
		this.op2 = op2;
		this.operator = operator;
		this.result = result;
	}

	public int getOp1() {
		return op1;
	}

	public int getOp2() {
		return op2;
	}

	public String getOperator() {
		return operator;
	}

	public int getResult() {
		return result;
	}

	@Override
	public String toString() {
		return String.format("%d %s %d = %d",op1, operator, op2, result);
	}
	
	
	
}
