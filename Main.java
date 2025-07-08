package EM;

import java.util.Scanner;

public class Main {

    StudentService service = new StudentService();
    static boolean doing = true;
    public static void menu() {
        System.out.println("""
                
                **************** Welcome To Student Management System South Eastern University of Sri Lanka - AAUND Family Project ***********\s
                
                       *******************  The creators of this project:  Ajas Abzan Uma Nasma Dilmi  ******************\s
                       
                1. Add Student\s
                2. View Student\s
                3. Update Student\s
                4. Delete Student\s
                5. View All Student\s
                6. Attendance and Exam Eligibility\s
                7. Attendance of all Students\s
                8. Timetable\s
                9. Exit\s""");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        FirstYear firstYear = new FirstYear();

        do {
            menu();
            System.out.print("Please Enter your Choice: ");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Add Student");8
                    service.addStd();
                    break;
                case 2:
                    System.out.println("View Student");
                    service.viewStd();
                    break;
                case 3:
                    System.out.println("Update Student");
                    service.updateStudent();
                    break;
                case 4:
                    System.out.println("Delete Student");
                    service.deleteStd();
                    break;
                case 5:
                    System.out.println("View All Student");
                    service.viewAllStd();
                    break;
                case 6:
                    System.out.println("Student Attendance : ");
                    service.getAttendance();
                    break;
                case 7:
                    System.out.println("Attendance of Available students : ");
                    service.getAttendanceOfAvailableStudents();
                    break;
                case 8:
                    System.out.println("Student Timetable");
                    service.getTimeTable();
                    break;
                case 9:
                    System.out.println("Thank you for using application!!");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice");
                    break;

            }

        }while(doing);

    }


}
