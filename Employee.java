
/**
 * parent class for hospital employee classes
 *
 * William Ellsworth
 */
public class Employee
{
    // instance variables - replace the example below with your own
    private double salary;
    private int floor;
    private String name;

    public Employee(double sal, int floorNum, String name)
    {
        salary = sal;
        floor = floorNum;
        this.name= name;
    }

    public void setSalary(double newSalary)
    {
        salary = newSalary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setFloor(int newFloor)
    {
        floor = newFloor;
    }

    public int getFloor()
    {
        return floor;
    }
    
    public String getName()
    {
        return name;
    }
}
