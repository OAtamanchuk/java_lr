package lr_3.Controllers;

import lr_3.Models.Human;
import lr_3.Models.Student;

public class StudentCreator {
    public Student createStudent(int identifier, Human human) {
        return new Student(human.getName(), human.getSurname(), human.getPatronymic(), human.getSex(), identifier);
    }

    public Student createTypicalStudent() {
        HumanCreator humanCreator = new HumanCreator();
        Student student = createStudent(123456, humanCreator.createTypicalHuman());
        return student;
    }
}