package lr_3.Models;

import java.util.List;
import java.util.Objects;

public class University {
	private String name;
    private Human leader;
    private List<Faculty> faculties;

    public University(String name, Human leader, List<Faculty> faculties) {
        this.name = name;
        this.leader = leader;
        this.faculties = faculties;
    }
	
	public String getName() {
        return name;
    }

    public Human getLeader() {
        return leader;
    }
	
    public List<Faculty> getFaculties() {
        return faculties;
    }
	
    public void setName(String name) {
        this.name = name;
    }
	
    public void setLeader(Human leader) {
        this.leader = leader;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return String.format("University %s with leader %s\nFaculties:\n%s", name, leader.toString(), faculties.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
		
        University University = (University) o;
        return name == University.name &&
                leader.equals(University.leader) &&
                faculties.equals(University.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, leader, faculties);
    }
}