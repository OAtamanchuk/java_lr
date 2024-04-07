package lr_3;

import lr_3.Controllers.*;
import lr_3.Models.*;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
		HumanCreator humanCreator = new HumanCreator();
		StudentCreator studentCreator = new StudentCreator();
		GroupCreator groupCreator = new GroupCreator();
		DepartmentCreator departmentCreator = new DepartmentCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        UniversityCreator universityCreator = new UniversityCreator();
		
		Human leader1 = humanCreator.createHuman("Atamanchuk", "Oleksandra", "Beautiful", Sex.FEMALE);
		Human leader2 = humanCreator.createHuman("Taylor", "James", "Friendly", Sex.MALE);
		Human leader3 = humanCreator.createHuman("Jackson", "Avery", "Joyful", Sex.MALE);
		Human leader4 = humanCreator.createHuman("White", "Charlotte", "Pleasant", Sex.FEMALE);
		Human leader5 = humanCreator.createHuman("Smith", "John", "Nice", Sex.MALE);
		Human leader6 = humanCreator.createHuman("Johnson", "Emily", "Thankful", Sex.FEMALE);
		Human leader7 = humanCreator.createHuman("Williams", "Michael", "Lively", Sex.MALE);
		
		Student student1 = studentCreator.createStudent(960163, humanCreator.createHuman("Evans", "Emery", "Strong", Sex.MALE));
		Student student2 = studentCreator.createStudent(850686, humanCreator.createHuman("Atamanchuk", "Oleksandra", "Smart", Sex.FEMALE));
		Student student3 = studentCreator.createStudent(743512, humanCreator.createHuman("Smith", "Ava", "Clever", Sex.FEMALE));
		Student student4 = studentCreator.createStudent(519304, humanCreator.createHuman("Johnson", "Liam", "Brave", Sex.MALE));
		Student student5 = studentCreator.createStudent(261807, humanCreator.createHuman("Williams", "Olivia", "Wise", Sex.FEMALE));
		Student student6 = studentCreator.createStudent(871942, humanCreator.createHuman("Brown", "Noah", "Cool", Sex.MALE));
		Student student7 = studentCreator.createStudent(629041, humanCreator.createHuman("Jones", "Emma", "Bright", Sex.FEMALE));
		Student student8 = studentCreator.createStudent(453278, humanCreator.createHuman("Garcia", "Ethan", "Happy", Sex.MALE));
		Student student9 = studentCreator.createStudent(372649, humanCreator.createHuman("Davis", "Sophia", "Kind", Sex.FEMALE));
		Student student10 = studentCreator.createStudent(707925, humanCreator.createHuman("Rodriguez", "Mason", "Sunny", Sex.MALE));
		Student student11 = studentCreator.createStudent(885734, humanCreator.createHuman("Martinez", "Isabella", "Cheerful", Sex.FEMALE));
		Student student12 = studentCreator.createStudent(135860, humanCreator.createHuman("Hernandez", "Jacob", "Calm", Sex.MALE));
		Student student13 = studentCreator.createStudent(673429, humanCreator.createHuman("Lopez", "Ava", "Jolly", Sex.FEMALE));
		Student student14 = studentCreator.createStudent(574638, humanCreator.createHuman("Gonzalez", "Michael", "Calm", Sex.MALE));
		Student student15 = studentCreator.createStudent(217896, humanCreator.createHuman("Wilson", "Emily", "Gentle", Sex.FEMALE));
		Student student16 = studentCreator.createStudent(491753, humanCreator.createHuman("Anderson", "William", "Merry", Sex.MALE));

		Group group1 = groupCreator.createGroup("122-20-1", leader1, Arrays.asList(new Student[]{student1, student2}));
		Group group2 = groupCreator.createGroup("122-20-2", leader1, Arrays.asList(new Student[]{student3, student4}));
		Group group3 = groupCreator.createGroup("122-20-3", leader1, Arrays.asList(new Student[]{student5, student6}));
		Group group4 = groupCreator.createGroup("122-20-4", leader1, Arrays.asList(new Student[]{student7, student8}));
		Group group5 = groupCreator.createGroup("033-20-1", leader2, Arrays.asList(new Student[]{student9, student10}));
		Group group6 = groupCreator.createGroup("033-20-2", leader2, Arrays.asList(new Student[]{student11, student12}));
		Group group7 = groupCreator.createGroup("033-20-3", leader2, Arrays.asList(new Student[]{student13, student14}));
		Group group8 = groupCreator.createGroup("033-20-4", leader2, Arrays.asList(new Student[]{student15, student16}));
		
		Department department1 = departmentCreator.createDepartment("Computer Sciences", leader3, Arrays.asList(new Group[]{group1, group2, group3, group4}));
		Department department2 = departmentCreator.createDepartment("Humanitarian Sciences", leader4, Arrays.asList(new Group[]{group5, group6, group7, group8}));
		
		Faculty faculty1 = facultyCreator.createFaculty("Technologies", leader5, Arrays.asList(new Department[]{department1}));
		Faculty faculty2 = facultyCreator.createFaculty("Humanitarian", leader6, Arrays.asList(new Department[]{department2}));
		
        University university = universityCreator.createUniversity("SmartUniversity", leader7, Arrays.asList(new Faculty[]{faculty1, faculty2}));

        System.out.println(university.toString());
    }
}