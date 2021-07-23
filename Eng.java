package project3;

import java.util.Scanner;

public class Eng extends Emp {
    JDBC jd = new JDBC();
     Scanner input = new Scanner(System.in);

    public Eng( int Id, String Name, int Age, double Salary,Grade g) {
        super(Id, Name, Age, Salary);
        jd.add_Eng(Id, Name, g.getPosition(), Age, Salary, g.getTaxrate(), g.getPayrate(), g.getWorkingHours());
    }

    public Eng() {}
   
    @Override
    public void add_emp() {
     String name,position;
     int id,age,workinghours;
     double Taxrate,Payrate;
        System.out.println("enter Name:");
        name = input.next();
        System.out.println("enter Age:");
        age = input.nextInt();
        System.out.println("enter ID:");
        id = input.nextInt();
        System.out.println("enter Tax rate:");
        Taxrate=input.nextDouble();
        System.out.println("enter Pay rate:");
        Payrate = input.nextDouble();
        System.out.println("enetr working hours:");
        workinghours = input.nextInt();
        System.out.println("enter position:");
        position = input.next();
        Grade g2 = new Grade(position,Payrate,Taxrate,workinghours);
        g2.calc_sal(g2);
        Eng eng = new Eng(id,name,age,g2.calc_sal(g2),g2);  
        
    }

    @Override
    public void delete_emp() {
        Eng eng = new Eng();
        int id;
        System.out.println("ENTER ID OF ENGINEER YOU WANT TO DELETE:");
        id = input.nextInt();
        jd.delete_ENG(id);
    }

    @Override
    public void update_emp() {
        Eng eng = new Eng();
        String name,position;
        int id,age,workinghours;
        double Taxrate,Payrate,salary;
        System.out.println("ENTER ID OF ENGINEER YOU WANT TO UPDATE:");
        id = input.nextInt();
        System.out.println("ENTER NAME:");
        name = input.next();
        System.out.println("ENTER AGE:");
        age = input.nextInt();
        System.out.println("ENTER TAX RATE:");
        Taxrate=input.nextDouble();
        System.out.println("enter PAY RATE:");
        Payrate = input.nextDouble();
        System.out.println("ENTER WORHING HOURS:");
        workinghours = input.nextInt();
        System.out.println("ENTER POSITION:");
        position = input.next();
         Grade g2 = new Grade(position,Payrate,Taxrate,workinghours);
        jd.update_ENG(id, name, position, age, g2.calc_sal(g2), Taxrate, Payrate, workinghours);
          
    }

    @Override
    public void search_emp() {
       Eng eng = new Eng();
        int id;
        System.out.println("ENTER ID OF ENGINEER YOU WANT TO SEARCH FOR:");
        id = input.nextInt();
        jd.search_Eng(id);
    }

    
    @Override
    public void display_all_emp() {
        jd.display_all_Eng();
    }
    
}
