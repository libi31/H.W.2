public class Manager extends Employee
{
    public double wage;
    public int numOfWorkers;

    public Manager()
    {

    }
    public Manager(String name, double wage, int workers)
    {
        super(name);
        this.wage = wage;
        this.numOfWorkers = workers;
    }

    public double getWage()
    {
        return wage;
    }

    public int getNumOfWorkers()
    {
        return numOfWorkers;
    }

    public void setWage(double wage)
    {
        this.wage = wage;
    }

    public void setNumOfWorkers(int workers)
    {
        this.numOfWorkers = workers;
    }

    @Override
    public String toString() {
        return "Employee's name :" + name +", wage = " + wage +", workers = " + numOfWorkers;
    }

    @Override
    public double salary() {
        if (numOfWorkers>0||numOfWorkers<=10)
        {
            return wage;
        }
         else if (numOfWorkers>10||numOfWorkers<=20)
           {
               return wage+(numOfWorkers*50);
           }
           else
           {
               return wage+(numOfWorkers*50)+500;
           }
    }
}
