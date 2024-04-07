package lr_3_4.Controllers;

import lr_3_4.Models.Human;
import lr_3_4.Models.University;
import lr_3_4.Models.Faculty;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {

    public University createUniversity(String name, Human leader, List<Faculty> faculties) {
        return new University(name, leader, faculties);
    }

    public University createTypicalUniversity(int facultiesCount) {
        HumanCreator humanCreator = new HumanCreator();
		List<Faculty> faculties = new ArrayList<>();
        FacultyCreator facultyCreator = new FacultyCreator();
		
		for (int i = 0; i < facultiesCount; i++) {
            faculties.add(facultyCreator.createTypicalFaculty(4));
        }
		
        return createUniversity("Typical University", humanCreator.createTypicalHuman(), faculties);
    }
}