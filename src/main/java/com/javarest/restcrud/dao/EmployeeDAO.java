package com.javarest.restcrud.dao;
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.javarest.restcrud.model.Employee;
 
public class EmployeeDAO {
 
    private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Employee emp1 = new Employee("Emp01", "Sushant", "Java-Developer");
        Employee emp2 = new Employee("Emp02", "Yogesh", "Software Engineer");
        Employee emp3 = new Employee("Emp03", "saurabh", "CA");
        Employee emp4 = new Employee("Emp04", "Mrunali", "HR");

        empMap.put(emp1.getEmpNo(), emp1);
        empMap.put(emp2.getEmpNo(), emp2);
        empMap.put(emp3.getEmpNo(), emp3);
        empMap.put(emp4.getEmpNo(), emp4);

    }
 
    public static Employee getEmployee(String empNo) {
        return empMap.get(empNo);
    }
 
    public static Employee addEmployee(Employee emp) {
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }
 
    public static Employee updateEmployee(Employee emp) {
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }
 
    public static void deleteEmployee(String empNo) {
        empMap.remove(empNo);
    }
 
    public static List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }
     
    List<Employee> list;
 
}