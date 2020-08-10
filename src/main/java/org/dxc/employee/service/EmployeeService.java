package org.dxc.employee.service;

import java.util.List;

import org.dxc.employee.dao.EmployeeDAO;
import org.dxc.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDao;

	public List<Employee> getEmployees() {
		
		List<Employee> listOfEmployees=employeeDao.getAllEmployees();
		
		return listOfEmployees;
	}

}
