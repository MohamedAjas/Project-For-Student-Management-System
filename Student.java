package EM;

public class Student {

    private int id;
    private String name;
    private int  age;
    private String year;
    private String department;
    private int dayPresent;
    private int dayAbsent;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public int getDayPresent() {
        return dayPresent;
    }

    public void setDayPresent(int dayPresent) {
        this.dayPresent = dayPresent;
    }

    public int getDayAbsent() {
        return dayAbsent;
    }

    public void setDayAbsent(int dayAbsent) {
        this.dayAbsent = dayAbsent;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", age=" + age + ", year=" + year
                + ", department=" + department + "]";
    }
    public Student(int id, String name, int age,
                   String year, String department) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.year = year;
        this.department = department;
    }

    public Student(int id, String name, int age, String year,
                   String department, int dayPresent, int dayAbsent) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.year = year;
        this.department = department;
        this.dayPresent = dayPresent;
        this.dayAbsent = dayAbsent;
    }
}
