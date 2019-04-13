
/**
 * Nurse Class employee of a hospital
 * 
 * William Ellsworth
 */
public class Surgeon extends Employee
{
    // instance variables - replace the example below with your own


    public Surgeon(double salary, int floor, String name)
    {
        super(salary, floor, name);
    }
    
    public String getJobTitle()
    {
        return "Surgeon";
    }
    public void doSurgery()
    {
        System.out.println("Perfromed surgery on a patient");
    }
}
