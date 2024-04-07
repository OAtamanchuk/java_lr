package lr_3.Models;

import java.util.Objects;

public class Human {
    protected String name;
    protected String surname;
    protected String patronymic;
    protected Sex sex;

    public Human(String name, String surname, String patronymic, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
	
	public String getSurname() {
        return surname;
    }
	
	public String getPatronymic() {
        return patronymic;
    }
	
	public Sex getSex() {
        return sex;
    }
	
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, %s", surname, name, patronymic, sex);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
		
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(patronymic, human.patronymic) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, sex);
    }
}