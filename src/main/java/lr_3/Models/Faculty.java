package lr_3.Models;

import java.util.List;
import java.util.Objects;

public class Faculty {
	private String name;
    private Human leader;
    private List<Department> departments;

    public Faculty(String name, Human leader, List<Department> departments) {
        this.name = name;
        this.leader = leader;
        this.departments = departments;
    }
	
	public String getName() {
        return name;
    }

    public Human getLeader() {
        return leader;
    }
	
    public List<Department> getDepartments() {
        return departments;
    }
	
    public void setName(String name) {
        this.name = name;
    }
	
    public void setLeader(Human leader) {
        this.leader = leader;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return String.format("Faculty %s with leader %s\nDepartments:\n%s\n", name, leader.toString(), departments.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
		
        Faculty faculty = (Faculty) o;
        return name == faculty.name &&
                leader.equals(faculty.leader) &&
                departments.equals(faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, leader, departments);
    }
}