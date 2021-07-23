package project3;

public abstract class Emp {
    private int Id;
    private String Name;
    private int Age;
    private double Salary;

    public Emp(int Id, String Name, int Age, double Salary) {
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
    }
    public Emp(){}
    
    public abstract void add_emp();
    public abstract void delete_emp();
    public abstract void update_emp();
    public abstract void search_emp();
    public abstract void display_all_emp();
}
