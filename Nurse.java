
/**
 * Nurse Class employee of a hospital
 * 
 * William Ellsworth
 */
public class Nurse extends Employee
{
    // instance variables - replace the example below with your own


    public Nurse(double salary, int floor, String name)
    {
        super(salary, floor, name);
    }

    public String getJobTitle()
    {
        return "Nurse";
    }
    public void giveMedication()
    {
        System.out.println("Gave a patient medication");
    }
}
