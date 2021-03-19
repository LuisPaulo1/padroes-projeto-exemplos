package br.com.cod3r.bridge.converter.converters;

import java.util.Locale;

import br.com.cod3r.bridge.converter.employees.Employee;

public class JsonConverter implements Converter {

	@Override
	public String getEmployeeFormated(Employee emp) {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n")
			.append("\t\"name\": \"").append(emp.getName()).append("\",\n")
			.append("\t\"age\": \"").append(emp.getAge()).append("\",\n")
			.append("\t\"salary\": \"").append(String.format(Locale.US, "%.2f", emp.getSalary())).append("\"\n")
		.append("}");
		
		return builder.toString();
	}

}
