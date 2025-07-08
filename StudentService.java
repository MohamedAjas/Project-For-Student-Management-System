package EM;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class StudentService {

    HashSet<Student> stdset = new HashSet<Student>();

    Student std1 = new Student(1001, "Ajas", 22,
            "First", "ICT", 4, 23);

    Student std2 = new Student(1002, "Abzan", 22,
            "First","ICT", 5, 26);

    Student std3 = new Student(1003, "Uma", 22,
            "First","ICT", 4, 27);

    Student std4 = new Student(1004, "Nasma", 22,
            "First","ICT", 6, 25);

    Student std5 = new Student(1005, "Dilmi", 22,
            "First","ICT", 8, 23);

    Scanner sc = new Scanner(System.in);

    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String year;
    float attendancePercentage;
    int present;
    int absent;


    public StudentService() {

        stdset.add(std1);
        stdset.add(std2);
        stdset.add(std3);
        stdset.add(std4);
        stdset.add(std5);

    }

    //view all students
    public void viewAllStd() {
        for(Student std: stdset) {
            System.out.println(std);
        }
    }

    //view students using id
    public void viewStd(){
        System.out.println("Enter id: ");
        id=sc.nextInt();
        for(Student std: stdset) {
            if(std.getId()==id) {
                System.out.println(std);
                found=true;
            }

        }
        if(!found) {
            System.out.println("Student with this id is not present");
        }
    }

    //update student
    public void updateStudent() {
        System.out.println("Enter id: ");
        id=sc.nextInt();
        boolean found=false;
        for(Student std: stdset) {
            if(std.getId()==id) {
                System.out.println("Enter name: ");
                name=sc.next();
                std.setName(name);

                System.out.println("Enter age: ");
                age=sc.nextInt();
                std.setAge(age);

                System.out.println("Enter year: ");
                year=sc.next();
                std.setYear(year);

                System.out.println("Enter department: ");
                department=sc.next();
                std.setDepartment(department);

                System.out.println("Updated Details of student are: ");
                System.out.println(std);
                found=true;
            }
        }
        if(!found) {
            System.out.println("Student is not present");
        }
        else {
            System.out.println("Student details updated successfully !!");
        }
    }


    //delete Student
    public void deleteStd() {
        System.out.println("Enter id:");
        id=sc.nextInt();
        boolean found=false;
        Student stdDelete=null;
        for(Student std: stdset) {
            if(std.getId()==id) {
                stdDelete=std;
                found=true;
            }
        }
        if(!found) {
            System.out.println("Student is not present");
        }
        else {
            stdset.remove(stdDelete);
            System.out.println("Student deleted successfully!!");
        }
    }


    //add student
    public void addStd() {
        System.out.print("Enter id: ");
        id=sc.nextInt();
        System.out.print("Enter name: ");
        name=sc.next();
        System.out.print("Enter age: ");
        age=sc.nextInt();
        System.out.print("Enter year: ");
        year =sc.next();
        System.out.print("Enter Department: ");
        department=sc.next();

        Student std=new Student(id, name, age, year, department);

        stdset.add(std);
        System.out.println(std);
        System.out.println("Student added successfully");

    }

    // Get Attendance of the student
    public void getAttendance() {
        System.out.print("Enter id: ");
        id=sc.nextInt();
        boolean found=false;

        for(Student std: stdset) {
            if(std.getId()==id) {

                System.out.print("Enter Day Present: ");
                present=sc.nextInt();
                System.out.print("Enter Absent: ");
                absent=sc.nextInt();

                int total = present + absent;
                attendancePercentage = present * 100 / total;
                System.out.println("The Attendance: "+ attendancePercentage+"%");
                found=true;
            }
        }

        if(!found) {
            System.out.println("Student is not present");
        }
        else {
            if (attendancePercentage > 80) {
                System.out.println("****Eligible to Exam****");
            } else {
                System.out.println("!****You are not eligible to write Exam****!");
            }
        }

    }

    // Get attendance of all students
    public void getAttendanceOfAvailableStudents() {
        for(Student std: stdset) {
            present = std.getDayPresent();
            absent = std.getDayAbsent();
            int total = present + absent;
            attendancePercentage = present * 100 / total;
            System.out.println("[ Attendance percentage of Student id "
                    + std.getId()+ ": "+attendancePercentage+"% ]");

            if(attendancePercentage > 80.0) {
                System.out.println("The student id "+ std.getId()+" is eligible for exam");
            } else {
                System.out.println("The student id "+ std.getId()+" is not eligible for exam");
            }

        }

    }

    // Get timetable of the students
    public void getTimeTable() {
        System.out.print("Enter your year: ");
        year=sc.next();

        if (Objects.equals(year, "first") || Objects.equals(year, "First")) {
            FirstYear firstYear = new FirstYear();
            firstYear.timeTable();
        } else if (Objects.equals(year, "second") || Objects.equals(year, "Second")) {
            SecondYear secondYear = new SecondYear();
            secondYear.timeTable();
        } else if (Objects.equals(year, "third") || Objects.equals(year, "Third")) {
            ThirdYear thirdYear = new ThirdYear();
            thirdYear.timeTable();
        } else if (Objects.equals(year, "fourth") || Objects.equals(year, "Fourth")) {
            FourthYear fourthYear = new FourthYear();
            fourthYear.timeTable();
        } else {
            System.out.println("Nothing Found...");
        }

    }

}
