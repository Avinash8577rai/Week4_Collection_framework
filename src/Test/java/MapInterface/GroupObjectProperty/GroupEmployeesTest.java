package MapInterface.GroupObjectProperty;
import Day2.MapInterface.GroupObjectProperty.GroupEmployees;
import Day2.MapInterface.GroupObjectProperty.Employee;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class GroupEmployeesTest {

    @Test
    void testGroupByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> expectedOutput = new HashMap<>();
        expectedOutput.put("HR", Arrays.asList(new Employee("Alice", "HR"), new Employee("Carol", "HR")));
        expectedOutput.put("IT", Collections.singletonList(new Employee("Bob", "IT")));

        Map<String, List<Employee>> result = GroupEmployees.groupByDepartment(employees);

        assertEquals(2, result.size());
        assertEquals(2, result.get("HR").size());
        assertEquals(1, result.get("IT").size());
    }

    @Test
    void testGroupByDepartmentWithEmptyList() {
        List<Employee> employees = new ArrayList<>();
        assertTrue(GroupEmployees.groupByDepartment(employees).isEmpty());
    }
}
