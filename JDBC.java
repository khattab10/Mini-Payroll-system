package project3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    
    static final String DB_URL = "jdbc:derby://localhost:1527/project3";
    static final String USER = "hh";
    static final String PASS = "hh";
    static Connection conn = null;
   public void connction()
   {
        System.out.println("Connecting to database...");
        try {
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (SQLException ex) {
            System.out.println("ERROR!");
            System.out.println("MAKE SURE THAT YOU GOT THE RIGHT CONNECTION!");
        }
   }
   public void display_all_Eng(){

         JDBC obj=new JDBC();
         Project3 pr= new Project3();
         obj.connction();
         int id,age,wh;
        String name,position;
        double salary,tax, payrate;
        Statement stmt = null;
        try {
            
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM HH.ENG";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
               //Retrieve by column name
                System.out.println("enter while loop");
               id  = rs.getInt("id");
               salary = rs.getDouble("salary");
               name = rs.getString("name");
               position = rs.getString("position");
               age = rs.getInt("id");
               tax=rs.getDouble("taxrate");
               payrate = rs.getDouble("payrate");
               wh = rs.getInt("workinghours");
               
               System.out.print("ID: " + id);
               System.out.print("\nSalary: " + salary);
               System.out.print("\nname: " + name);
               System.out.print("\nAge: " + age);
               System.out.print("\nWorking Hours: " + wh);
               System.out.print("\nPay rate: " + payrate);
               System.out.print("\nTax rate: " + tax);
               System.out.print("\nposition: " + position+"\n");
                System.out.println("______________________________________________________________________________");
            }
            pr.main_menu();
            rs.close();
            stmt.close();
            conn.close();
        } 
        catch (SQLException ex) {
            System.out.println("ERROR!");
            pr.main_menu();
        }
     }
   public void display_all_Trainee(){

         JDBC obj=new JDBC();
         Project3 pr= new Project3();
         obj.connction();
         Trai tr = new Trai();
         int id, age, academicY;
         double salary, gpa;
         String UN,name;
        Statement stmt = null;
        try {
           
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM HH.TRAINEE";
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
               //Retrieve by column name
               System.out.println("enter while loop");
               id  = rs.getInt("id");
               salary = rs.getDouble("salary");
               name = rs.getString("name");
               UN = rs.getString("universityname");
               age = rs.getInt("id");
               gpa=rs.getDouble("gpa");
               academicY = rs.getInt("academicyear");
               
               System.out.print("ID: " + id);
               System.out.print("\nSalary: " + salary);
               System.out.print("\nName: " + name);
               System.out.print("\nAge: " + age);
               System.out.print("\nUniversity name: " + UN);
               System.out.print("\nGPA: " + gpa);
               System.out.print("\nAcademic year: " + academicY+"\n");
                System.out.println("___________________________________________________________________________________");
            }
             pr.main_menu();
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } 
        catch (SQLException ex) {
           System.out.println("ERROR!");
            pr.main_menu();
        }
     }
     public void search_Eng(int id)
     {
         JDBC obj=new JDBC();
         Project3 pr= new Project3();
         obj.connction();
         String position, name;
         int age,wh,x=0;
         double salary,tax,payrate;
        Statement stmt = null;
        try {
            
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM HH.ENG where id ="+id; 
            ResultSet rs = stmt.executeQuery(sql);


            //STEP 5: Extract data from result set
            while(rs.next()){
                if(id==rs.getInt("id"))
                {
                    
                   salary = rs.getDouble("salary");
                   name = rs.getString("name");
                   position = rs.getString("position");
                   age = rs.getInt("id");
                   tax=rs.getDouble("taxrate");
                   payrate = rs.getDouble("payrate");
                   wh = rs.getInt("workinghours");
               
                   System.out.print("ID: " + id);
                   System.out.print("\nSalary: " + salary);
                   System.out.print("\nname: " + name);
                   System.out.print("\nAge: " + age);
                   System.out.print("\nWorking Hours: " + wh);
                   System.out.print("\nPay rate: " + payrate);
                   System.out.print("\nTax rate: " + tax);
                   System.out.print("\nposition: " + position+"\n");
                   x=1;
                }
                else
                {
                    x=0;
                }
            }
            if(x==1)
            {
               pr.main_menu(); 
            }
            else
            {
                System.out.println("THIS ID IS NOT FOUND!");
                pr.main_menu();
            }
            
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } 
        catch (SQLException ex) {
            System.out.println("ERROR!");
           // System.out.println("THIS ID IS NOT FOUND!");
        }
        
     }
     public void search_trainee(int id)
     {
         JDBC obj=new JDBC();
         Project3 pr= new Project3();
         obj.connction();
         int academicY,age, x=0;
         double salary,gpa;
         String UN,name;
        Statement stmt = null;
        try {
            
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM HH.TRAINEE where id ="+id;//"SELECT * FROM HH.TRAINEE";
            ResultSet rs = stmt.executeQuery(sql);


            //STEP 5: Extract data from result set
            while(rs.next()){
                 if(id==rs.getInt("id"))
                {
                    System.out.println("enter while loop");
               id  = rs.getInt("id");
               salary = rs.getDouble("salary");
               name = rs.getString("name");
               UN = rs.getString("universityname");
               age = rs.getInt("id");
               gpa=rs.getDouble("gpa");
               academicY = rs.getInt("academicyear");
               
               System.out.print("ID: " + id);
               System.out.print("\nSalary: " + salary);
               System.out.print("\nName: " + name);
               System.out.print("\nAge: " + age);
               System.out.print("\nUniversity name: " + UN);
               System.out.print("\nGPA: " + gpa);
               System.out.print("\nAcademic year: " + academicY+"\n");
               System.out.println("___________________________________________________________________________________");
               x=1;
                }
                else
                {
                    x=0;
                    
                }
            }
            if(x==1)
            {
               pr.main_menu(); 
            }
            else
            {
                System.out.println("THIS ID IS NOT FOUND!");
                pr.main_menu();
            }
                  
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } 
        catch (SQLException ex) {
            System.out.println("ERROR!");
            System.out.println("THIS ID IS NOT FOUND!");
        }
        
     }
        
     public void add_Eng(int id,String name, String position,int age, double salary,double tax,double payrate,double wh)
     {
         JDBC obj=new JDBC();
         Project3 pr= new Project3();
         obj.connction();
        Statement stmt = null;
         try {
            
               //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "insert into HH.ENG(id,SALARY,name,age,workinghours,position,payrate,taxrate)"+" VALUES("+id+","+salary+",'"+name+"',"+age+","+wh+",'"+position+"',"+payrate+","+tax+")";
            stmt.executeUpdate(sql);
            pr.main_menu();
            
     }  catch (SQLException ex) {
            System.out.println("ERROR!");
            System.out.println("MAKE SURE THAT YOU ENTERED THE DATA CORRECTELY!");
        }
    }
      public void add_Trainee(int id,int age,int academicY,double salary,double gpa,String UN,String name)
     {
         JDBC obj=new JDBC();
         Project3 pr= new Project3();
         obj.connction();
        Statement stmt = null;
         try {
            
            stmt = conn.createStatement();
            String sql = "insert into HH.TRAINEE(id,salary,name,age,gpa,universityname,academicyear)"+" VALUES("+id+","+salary+",'"+name+"',"+age+","+gpa+",'"+UN+"',"+academicY+")";
            stmt.executeUpdate(sql);
            pr.main_menu();
            
     }  catch (SQLException ex) {
            System.out.println("ERROR!");
            System.out.println("MAKE SURE THAT YOU ENTERED THE DATA CORRECTELY!");
        }
    }
      public void update_Trainee(int id,int age,int academicY,double salary,double gpa,String UN,String name)
      {
          JDBC obj=new JDBC();
          Project3 pr= new Project3();
         obj.connction();
         Statement stmt = null;
         try {
             
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "UPDATE HH.TRAINEE"+" SET salary = " +salary+ ",age = "+age+",academicyear = "+academicY+",gpa = "+gpa+",name = '"+name+"',universityname = '"+UN+"' WHERE id = "+id;
            stmt.executeUpdate(sql);
             pr.main_menu();
            
     }  catch (SQLException ex) {
            System.out.println("ERROR!");
            System.out.println("MAKE SURE THAT YOU ENTERED THE DATA CORRECTELY!");
        }
         
      }
      public void update_ENG(int id,String name, String position,int age, double salary,double taxrate,double payrate,int wh)
      {
          JDBC obj=new JDBC();
          Project3 pr= new Project3();
         obj.connction();
         Statement stmt = null;
         try {
            
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql ="UPDATE HH.ENG SET salary = "+salary+", age = "+age+", workinghours = "+wh+", taxrate = "+taxrate+", payrate = "+payrate+", name = '"+name+"', position = '"+position+"' WHERE ID = "+id;
            stmt.executeUpdate(sql);
            pr.main_menu();
            
     }  catch (SQLException ex) {
            System.out.println("ERROR!");
            System.out.println("MAKE SURE THAT YOU ENTERED THE DATA CORRECTELY!");
             System.out.println(ex);
        }
         
      }
      public void delete_ENG(int id)
      {
          JDBC obj=new JDBC();
          Project3 pr= new Project3();
         obj.connction();
         Statement stmt = null;
         try {
            
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql = "DELETE FROM HH.ENG"+" WHERE id= "+id;
            stmt.executeUpdate(sql);
            pr.main_menu();
            
     }  catch (SQLException ex) {
             System.out.println("ERROR!");
             
        }
      }
       public void delete_Trainee(int id)
      {
          JDBC obj=new JDBC();
          Project3 pr= new Project3();
          int x=0;
         obj.connction();
         Statement stmt = null;
         try {
            
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
           String sql = "DELETE FROM HH.TRAINEE"+" WHERE id= "+id;
            stmt.executeUpdate(sql);
            pr.main_menu();
            
            stmt.close();
            conn.close();
            
            
     }  catch (SQLException ex) {
           System.out.println("ERROR!");
            
        }
      }
}
