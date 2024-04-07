package lr_3.Models;

import java.util.List;
import java.util.Objects;

public class Group {
	private String name;
    private Human leader;
    private List<Student> students;

    public Group(String name, Human leader, List<Student> students) {
        this.name = name;
        this.leader = leader;
        this.students = students;
    }
	
	public String getName() {
        return name;
    }

    public Human getLeader() {
        return leader;
    }
	
    public List<Student> getStudents() {
        return students;
    }
	
    public void setName(String name) {
        this.name = name;
    }
	
    public void setLeader(Human leader) {
        this.leader = leader;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return String.format("Group %s with leader {%s}\nStudents:\n%s\n", name, leader.toString(), students.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
		
        Group group = (Group) o;
        return name == group.name &&
                leader.equals(group.leader) &&
                students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, leader, students);
    }
}