package com.ragu.service1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ragu.dao.EmpRepo;
import com.ragu.entity.Employee;
import com.ragu.exception.EmployeAlreadyExistException;
import com.ragu.exception.NoSuchEmployeeExistException;

@Service
public class EmpService {
@Autowired
private EmpRepo emp;


public String create(Employee employe) {
	Employee existing = emp.findById(employe.getEmpid()).orElse(null);
	if(existing == null) {
		emp.save(employe);
		return"RECORD CREATED";	
	}
	else
		throw new EmployeAlreadyExistException("Data Already exist");
}
	


public String createemployees(List<Employee> employees) {
	 emp.saveAll(employees);
	 return"All Record has been created";
} 
@Cacheable(cacheNames = "users", key = "#emp_id")
public Employee getEmpById(int emp_id) { 
	 return emp.findById(emp_id).orElseThrow(()->new NoSuchEmployeeExistException("No such Employee present with id:"+emp_id));
}

public List<Employee> getEmps() {
//	if(emp.count()>1) { 
//		  throw new NoSuchEmployeeExistException("NO DATA IS AVAILABLE IN DATABASE"); 
//	  }
//	 else {
		  return emp.findAll();
	}

public String update(Employee employe) {
	Employee optionalemp=emp.findById(employe.getEmpid()).orElse(null);
	if(optionalemp!=null) {
	optionalemp.setName(employe.getName());
	optionalemp.setLocation(employe.getLocation());
	optionalemp.setAge(employe.getAge());
	optionalemp.setSkillset(employe.getSkillset());
	emp.save(optionalemp);
	return "RECORD HAS BEEN UPDATED";
	}
	else {
		throw new NoSuchEmployeeExistException("EMPL");
	}
}

public String delete(int emp_id) {
	Employee exist=emp.findById(emp_id).orElse(null);
	if(exist!=null) {
		 emp.deleteById(emp_id);
		 return "Employee got deleted";
	}
	else {
		throw new NoSuchEmployeeExistException("Employ");
	}
	
	
}


}
 