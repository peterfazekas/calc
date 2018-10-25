package hu.nsjg.calc.model.service.data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import hu.nsjg.calc.model.domain.Operation;

public class CalcResultWriter {

	private final String fileName;

	public CalcResultWriter(String fileName) {
		this.fileName = fileName;
	}
	
	public void printAll(List<Operation> results) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			results.forEach(pw::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
