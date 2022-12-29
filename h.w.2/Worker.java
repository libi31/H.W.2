public class Worker extends Employee
{
    public double wagePerHour;
    public int hours;

    public Worker()
    {

    }
    public Worker(String name, double wage)
    {
        super(name);
        this.wagePerHour = wage;
    }

    public double getWagePerHour()
    {
        return wagePerHour;
    }

    public int getHours()
    {
        return hours;
    }

    public void setWagePerHour(double wagePerHour)
    {
        this.wagePerHour = wagePerHour;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }

    @Override
    public String toString()
    {
        return "Employee's name: " + name + ", wage = " + wagePerHour + ", hours = " + hours;
    }

    public double salary()
    {
        return wagePerHour*hours;
    }
}