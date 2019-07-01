package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("hi")
public class MainTest {

	@GET
	public String display() {

		return "Hi............";
	}

	@POST
	@Produces("application/json")
	@Path("emp")
	public Employee employee() {

		Employee employee = new Employee();

		employee.setEmpId(1010);
		employee.setEmpName("Vickram");
		employee.setEmpSal(7.5);

		return employee;
	}

}
