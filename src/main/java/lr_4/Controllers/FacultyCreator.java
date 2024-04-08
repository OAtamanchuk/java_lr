package lr_4.Controllers;

import lr_4.Models.Department;
import lr_4.Models.Faculty;
import lr_4.Models.Human;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator {

    public Faculty createFaculty(String name, Human leader, List<Department> departments) {
        return new Faculty(name, leader, departments);
    }

    public Faculty createTypicalFaculty(int departmentsCount) {
        HumanCreator humanCreator = new HumanCreator();
		DepartmentCreator departmentCreator = new DepartmentCreator();
		List<Department> departments = new ArrayList<>();
		
		for (int i = 0; i < departmentsCount; i++) {
            departments.add(departmentCreator.createTypicalDepartment(4));
        }
		
        return createFaculty("Typical Faculty", humanCreator.createTypicalHuman(), departments);
    }
}