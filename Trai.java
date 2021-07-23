package project3;

import java.util.Scanner;

public class Trai extends Emp {
    private String universityName;
    private int academicYear;
    private float GPA;
    JDBC jd = new JDBC();
    Scanner input = new Scanner(System.in);

    public Trai(String universityName, int academicYear, float GPA, int Id, String Name, int Age, float Salary) {
        super(Id, Name, Age, Salary);
        this.universityName = universityName;
        this.academicYear = academicYear;
        this.GPA = GPA;
        jd.add_Trainee(Id, Age, academicYear, Salary, GPA, universityName, Name);
    }
    public Trai(){}
    
    @Override
    public void add_emp() {
     String universityName,name,position;
     int academicYear,id,age;
     float GPA,salary;
        System.out.println("ENTER NAME:");
        name = input.next();
        System.out.println("ENTER AGE:");
        age = input.nextInt();
        System.out.println("ENTER ID:");
        id = input.nextInt();
        System.out.println("ENETR SALARY:");
        salary = input.nextFloat();
        System.out.println("ENTER UNIVERSITY NAME:");
        universityName = input.next();
        System.out.println("ENTER ACADEMIC YEAR:");
        academicYear = input.nextInt();
        System.out.println("ENTER GPA:");
        GPA = input.nextFloat();
        Trai trai = new Trai(universityName,academicYear,GPA,id,name,age,salary);
       
    }

    @Override
    public void delete_emp() {
       
        int id;
        System.out.println("ENTER ID OF TRAINEE YOU WANT TO DELETE");
        id = input.nextInt();
        jd.delete_Trainee(id);
    }

    @Override
    public void update_emp() {
        
        String universityName,name;
        int academicYear,age,id;
        float GPA,salary;
        System.out.println("ENTER ID OF TRAINEE YOU WANT TO UPDATE:");
        id = input.nextInt();
        System.out.println("ENTER NAME:");
        name = input.next();
        System.out.println("ENTER AGE:");
        age = input.nextInt();
        System.out.println("ENTER SALARY:");
        salary = input.nextFloat();
        System.out.println("ENTER UNIVERSITY NAME:");
        universityName = input.next();
        System.out.println("ENTER ACADEMIC YEAR:");
        academicYear = input.nextInt();
        System.out.println("ENTER GPA:");
        GPA = input.nextFloat();
        jd.update_Trainee(id, age, academicYear, salary, GPA,universityName ,name);
    }

    @Override
    public void search_emp() {
       // Trai trai = new Trai();
       int id;
       System.out.println("ENTER ID OF TRAINEE YOU WANT TO SEARCH FOR");
        id = input.nextInt();
        jd.search_trainee(id);
    }

    @Override
    public void display_all_emp() {
        System.out.println("DISPLAYING ALL TRAINEE:");
        jd.display_all_Trainee();
    }
}
