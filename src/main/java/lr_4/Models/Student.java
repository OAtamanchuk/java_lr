package lr_4.Models;

import java.util.Objects;

public class Student extends Human {
    private int identifier;

    public Student(String name, String surname, String patronymic, Sex sex, int identifier) {
        super(name, surname, patronymic, sex);
        this.identifier = identifier;
    }

    public int getIdentifier() {
        return identifier;
    }
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return String.format("Student %s: %s\n", identifier, super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
		
        Student student = (Student) o;
        return identifier == student.identifier;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }
}