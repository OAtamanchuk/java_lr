package lr_4.Controllers;

import lr_4.Models.Department;
import lr_4.Models.Group;
import lr_4.Models.Human;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator {

    public Department createDepartment(String name, Human leader, List<Group> groups) {
        return new Department(name, leader, groups);
    }

    public Department createTypicalDepartment(int groupsCount) {
        HumanCreator humanCreator = new HumanCreator();
		GroupCreator groupCreator = new GroupCreator();
		List<Group> groups = new ArrayList<>();
		
		for (int i = 0; i < groupsCount; i++){
			groups.add(groupCreator.createTypicalGroup(6));
		}
        return createDepartment("Typical Department", humanCreator.createTypicalHuman(), groups);
    }
}