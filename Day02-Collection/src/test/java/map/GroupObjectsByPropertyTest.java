package map;

//import group_objects_by_property.Department;
//import map.group_objects_by_property.Employees;
//import map.group_objects_by_property.GroupObjectsByProperty;
import org.example.map.group_objects_by_property.Department;
import org.example.map.group_objects_by_property.Employees;
import org.example.map.group_objects_by_property.GroupObjectsByProperty;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupObjectsByPropertyTest {

    @Test
    void invertMapTest(){
        Employees employees1=new Employees("Alice");
        Employees employees2=new Employees("Bob");
        Employees employees3=new Employees("Carol");

        Department department1=new Department("HR");
        Department department2=new Department("IT");

        Map<Employees,Department> map=new HashMap<>();
        map.put(employees1,department1);
        map.put(employees2,department2);
        map.put(employees3,department1);

        Map<Department, List<Employees>> invertMap= GroupObjectsByProperty.invertingMap(map);

        Map<Department, List<Employees>> expected=new HashMap<>();
        expected.put(department1, Arrays.asList(employees3,employees1));
        expected.put(department2,Arrays.asList(employees2));
        assertTrue(expected.equals(invertMap));

    }
}
