
/**
 * Driver to show functionality of the employee classes
 *
 * William Ellsworth
 */
public class HospitalDriver
{
    public static void main()
    {
        Nurse aNurse = new Nurse(75000, 3, "Nick");
        Accountant anAccountant = new Accountant(150000, 10, "Sally");
        Surgeon aSurgeon = new Surgeon(200000, 6, "David");
        Janitor aJanitor = new Janitor(35000, 2, "Alex");

        System.out.println(aNurse.getName() + " works on floor: " + aNurse.getFloor());

        System.out.print(anAccountant.getName() + " is an " + anAccountant.getJobTitle() + " todeay she ");
        anAccountant.fileBillingReports();

        System.out.println(aSurgeon.getName() + " who works on floor " + aSurgeon.getFloor() + " has a salary of " + aSurgeon.getSalary());

        System.out.print(aJanitor.getName() + " the " + aJanitor.getJobTitle() + " used to make " + aJanitor.getSalary() + ".");
        aJanitor.setSalary(40000);
        System.out.println(" But now he makes " + aJanitor.getSalary());
    }
}
/*
 * output:
 * 
 * Nick works on floor: 3
 * Sally is an Accountant todeay she Filed billing reports for the hospital
 * David who works on floor 6 has a salary of 200000.0
 * Alex the Janitor used to make 35000.0. But now he makes 40000.0

 */