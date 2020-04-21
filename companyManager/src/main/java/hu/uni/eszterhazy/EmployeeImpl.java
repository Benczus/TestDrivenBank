package hu.uni.eszterhazy;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl implements Employee {

    private List<Employee> employees;
    private String name;

    public EmployeeImpl(String name) {

        this.name = name;
        this.employees= new ArrayList<>();
    }

    @Override
    public String operation() {
        return "My name is "+ name +", an employee,"+executeOperationOnChildren();
    }

    private String executeOperationOnChildren() {
        StringBuilder stringBuilder;
        if (employees.isEmpty()) {
            stringBuilder= new StringBuilder();
        }
        else{
            stringBuilder= new StringBuilder(" my employees are: ");
            for (Employee employee : employees) {
                stringBuilder.append(employee.operation());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return this.employees.get(i);
    }
}
