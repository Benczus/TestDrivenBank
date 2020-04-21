package hu.uni.eszterhazy;

public class Assistant implements Employee{

    private String name;

    public Assistant(String name) {
        this.name = name;
    }

    @Override
    public String operation() {
        return " My name is "+name+", an assistant,";
    }

    @Override
    public void addEmployee(Employee employee) throws TreeLeafChildCallException {
        throw new TreeLeafChildCallException();
    }

    @Override
    public void removeEmployee(Employee employee) throws TreeLeafChildCallException {
        throw new TreeLeafChildCallException();
    }

    @Override
    public Employee getChild(int i) throws TreeLeafChildCallException {
        throw new TreeLeafChildCallException();
    }
}
