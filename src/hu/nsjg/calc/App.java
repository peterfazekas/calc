package hu.nsjg.calc;

import java.util.List;

import hu.nsjg.calc.model.domain.Operation;
import hu.nsjg.calc.model.service.data.CalcDataParser;
import hu.nsjg.calc.model.service.data.CalcFileReader;
import hu.nsjg.calc.model.service.data.CalcResultWriter;

public class App {

	private final List<Operation> operations;
	private final CalcResultWriter writer;
	
	public App() {
		writer = new CalcResultWriter("eredmenyek.txt");
		CalcFileReader file = new CalcFileReader();
		CalcDataParser data = new CalcDataParser();
		operations = data.parse(file.read("muveletek.txt"));
	}

	public static void main(String[] args) {
		App app = new App();
		app.run();
	}

	private void run() {
		operations.forEach(i -> System.out.println(i));
		writer.printAll(operations);
	}

}
