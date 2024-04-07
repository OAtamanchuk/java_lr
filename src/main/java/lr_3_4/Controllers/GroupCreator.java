package lr_3_4.Controllers;

import lr_3_4.Models.Student;
import lr_3_4.Models.Group;
import lr_3_4.Models.Human;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator {

    public Group createGroup(String name, Human leader, List<Student> students) {
        return new Group(name, leader, students);
    }

    public Group createTypicalGroup(int studentsCount) {
        HumanCreator humanCreator = new HumanCreator();
		StudentCreator studentCreator = new StudentCreator();
		List<Student> students = new ArrayList<>();
		
		for (int i = 0; i < studentsCount; i++){
			students.add(studentCreator.createTypicalStudent());
		}
		
        return createGroup("Typical Group", humanCreator.createTypicalHuman(), students);
    }
}