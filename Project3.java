package project3;
import java.util.Scanner;

public class Project3 {
    Scanner input = new Scanner(System.in);
    Trai trainee = new Trai();
    Eng eng = new Eng();
    
    public void ENG_menu()
    {
         Project3 pr= new Project3();
        System.out.println("_________________________________________ENGINEER MENU __________________________________________");
         int choice;
        System.out.println("1. ADD");
        System.out.println("2. SEARCH");
        System.out.println("3. DISPLAY ALL");
        System.out.println("4. DELETE");
        System.out.println("5. UPDATE");
        System.out.println("6. EXIT");
        choice = input.nextInt();
        switch(choice)
                {
            case 1:
                eng.add_emp();
                break;
            case 2:
                eng.search_emp();
                break;
            case 3:
                eng.display_all_emp();
                break;
            case 4:
                eng.delete_emp();
                break;
            case 5:
                eng.update_emp();
                break;
            case 6:
                break;
            default:
                System.out.println("INVALID CHOICE!");
                pr.ENG_menu();
                break;
        }
    }
    public void Trainee_menu()
    {
        Project3 pr= new Project3();
        System.out.println("_________________________________________TRAINEE MENU __________________________________________");
        int choice;
        System.out.println("1. ADD");
        System.out.println("2. SEARCH");
        System.out.println("3. DISPLAY ALL");
        System.out.println("4. DELETE");
        System.out.println("5. UPDATE");
        System.out.println("6. EXIT");
        choice = input.nextInt();
        switch(choice)
                {
            case 1:
                trainee.add_emp();
                break;
            case 2:
                trainee.search_emp();
                break;
            case 3:
                trainee.display_all_emp();
                break;
            case 4:
                trainee.delete_emp();
                break;
            case 5:
                trainee.update_emp();
                break;
            case 6:
                break;
            default:
                System.out.println("INVALID CHOICE!");
                pr.Trainee_menu();
        }
    }
    public void main_menu()
    {
        Project3 pr2= new Project3();
        System.out.println("_________________________________________WELCOME TO MINIPYROLL SYSTEM __________________________________________");
        int choice;
        System.out.println("1. ENGINEER MENU:");
        System.out.println("2. TRAINEER MENU:");
        System.out.println("3. EXIT");
        choice = input.nextInt();
        switch(choice)
        {
            case 1:
                pr2.ENG_menu();
                break;
            case 2:
                pr2.Trainee_menu();
            case 3:
                break;
            default:
                System.out.println("INVALID CHOICE!");
                pr2.main_menu();
                break;
        }
        
    }
    
    public static void main(String[] args) {
       Project3 pr1 = new Project3();
       pr1.main_menu();
       
    }
}
