package hu.nsjg.calc.model.service.data;

import java.util.List;
import java.util.stream.Collectors;

import hu.nsjg.calc.model.domain.Operation;

public class CalcDataParser {

	public List<Operation> parse(List<String> lines) {
		return lines.stream().map(this::createOperation).collect(Collectors.toList());
	}
	
	private Operation createOperation(String line) {
		String[] items = line.split(" ");
		String operator = items[0];
		int op1 = Integer.parseInt(items[1]);
		int op2 = Integer.parseInt(items[2]);
		int result = getResult(op1, op2, operator);
		return new Operation(op1, op2, operator, result);
	}
	
	private int getResult(int op1, int op2, String operator) {
		int result = 0;
		if ("+".equals(operator)) {
			result = op1 + op2;
		} else if ("-".equals(operator)) {
			result = op1 - op2;
		} else if ("/".equals(operator)) {
			result = op1 / op2;
		} else if ("*".equals(operator)) {
			result = op1 * op2;
		}
		return result;
	}
}
