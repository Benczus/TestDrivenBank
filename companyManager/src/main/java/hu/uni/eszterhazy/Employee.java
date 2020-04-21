package hu.uni.eszterhazy;

public interface Employee {

String operation();
void addEmployee(Employee employee) throws TreeLeafChildCallException;
void removeEmployee(Employee employee) throws TreeLeafChildCallException;
Employee getChild(int i) throws TreeLeafChildCallException;
}
