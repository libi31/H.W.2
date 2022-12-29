import javafx.concurrent.WorkerStateEvent;

import java.util.*;

public class Factory <T extends Employee>
{
    private List<T> emps;
    public int numOfEmps;
    private int MAX_EMPS;

    public Factory()
    {
        this.MAX_EMPS = 100;
        this.numOfEmps = 0;
        emps = new ArrayList<T>();
    }

    public boolean addEmployee(T t)
    {
        if(emps.size()<MAX_EMPS)
        {
            emps.add(t);
            return true;
        }
        else
        {
            return  false;
        }
    }

    public int numOfWorkers()
    {
        return emps.size();
    }

    public Manager mostManager()
    {
        return emps.stream()
        .filter(e -> e instanceof Manager)
        .map(e -> (Manager) e)
        .max(Comparator.comparingInt(Manager::getNumOfWorkers))
        .get();
    }

    public Worker minHours()
    {
        return emps.stream()
        .filter(e -> e instanceof Worker)
        .map(e -> (Worker) e)
        .min(Comparator.comparingInt(Worker::getHours))
        .get();
    }

    public Employee maxSalary()
    {
        return emps.stream()
        .filter(e -> e instanceof Employee)
        .map(e -> (Employee) e)
        .max(Comparator.comparingDouble(Employee::salary))
        .get();
    }

    public Employee getByName(String eName)
    {
        Employee emp = emps.stream()
                .filter(e -> e.getName().equals(eName))
                .findFirst().get();
        if (emp == null)
        {
           return null;
        }
        return emp;
    }

    public String toString()
    {
        String list = "";
        for(int i = 0; i < emps.size(); i++)
        {
            list += emps.toString() + "\n";
        }
        return "Workers in factory:\n" + list;
    }

    public double salaryByName(String eName)
    {
        Employee emp = emps.stream()
                .filter(e -> e.getName().equals(eName))
                .findFirst().get();
        if (emp == null)
        {
            return 0;
        }
        return emp.salary();
    }
}
