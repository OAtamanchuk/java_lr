package lr_3_4.Models;

import java.util.List;
import java.util.Objects;

public class Department {
	private String name;
    private Human leader;
    private List<Group> groups;

    public Department(String name, Human leader, List<Group> groups) {
        this.name = name;
        this.leader = leader;
        this.groups = groups;
    }
	
	public String getName() {
        return name;
    }

    public Human getLeader() {
        return leader;
    }
	
    public List<Group> getGroups() {
        return groups;
    }
	
    public void setName(String name) {
        this.name = name;
    }
	
    public void setLeader(Human leader) {
        this.leader = leader;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return String.format("Department %s with leader %s\nGroups:\n%s\n", name, leader.toString(), groups.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
		
        Department department = (Department) o;
        return name == department.name &&
                leader.equals(department.leader) &&
                groups.equals(department.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, leader, groups);
    }
}