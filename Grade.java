package project3;

public class Grade {
    private String position;
    private double payrate ,taxrate;
    private int workingHours;
    

    public Grade(String position, double payrate, double taxrate, int workingHours) {
        this.position = position;
        this.payrate = payrate;
        this.taxrate = taxrate;
        this.workingHours = workingHours;
    }
     public double calc_sal(Grade g1){
         double salary;
        salary = g1.getWorkingHours()*(g1.getPayrate()/g1.getTaxrate());
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public double getPayrate() {
        return payrate;
    }

    public double getTaxrate() {
        return taxrate;
    }

    public int getWorkingHours() {
        return workingHours;
    }
    
    
}
