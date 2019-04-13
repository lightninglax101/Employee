
/**
 * Nurse Class employee of a hospital
 * 
 * William Ellsworth
 */
public class Janitor extends Employee
{
    // instance variables - replace the example below with your own


    public Janitor(double salary, int floor, String name)
    {
        super(salary, floor, name);
    }

    public String getJobTitle()
    {
        return "Janitor";
    }
    public void cleanBathroom()
    {
        System.out.println("Cleaned the bathroom");
    }
}
