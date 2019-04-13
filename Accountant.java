
/**
 * Nurse Class employee of a hospital
 * 
 * William Ellsworth
 */
public class Accountant extends Employee
{
    // instance variables - replace the example below with your own


    public Accountant(double salary, int floor, String name)
    {
        super(salary, floor, name);
    }
    
    public String getJobTitle()
    {
        return "Accountant";
    }

    public void fileBillingReports()
    {
        System.out.println("Filed billing reports for the hospital");
    }
}
