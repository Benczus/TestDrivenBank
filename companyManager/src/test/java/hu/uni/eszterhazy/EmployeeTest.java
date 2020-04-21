package hu.uni.eszterhazy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

    Employee employee;

    @Before
    public void setUp() throws Exception {
        employee= new EmployeeImpl("Jozsef");
        employee.addEmployee(new EmployeeImpl("Bela"));
        employee.addEmployee(new Assistant("Ferenc"));
    }

    @Test
    public void compositeOperationBehaivour() {

        Assert.assertEquals("My name is Jozsef, an employee, my employees are: My name is Bela, an employee, My name is Ferenc, an assistant,", employee.operation() );
    }
}
