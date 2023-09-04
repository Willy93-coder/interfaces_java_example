import java.util.Date;

public class Employee extends Person implements Comparable, ForEmployee {

    // Attributes
    private double salary;
    private Date entry_date;

    // Constructor
    public Employee(String name, double salary, Date entryDate) {
        super(name);
        this.salary = salary;
        entry_date = entryDate;
    }

    // Methods
    @Override
    public String getDescription() {
        return "El empleado " + this.getName() + " tiene un sueldo de " + this.salary + "€" +
                " y entró a trabajar en " + this.entry_date;
    }

    @Override
    public int compareTo(Object o) {
        Employee otroEmpleado = (Employee) o;

        if (this.salary < otroEmpleado.salary) return -1;
        if (this.salary > otroEmpleado.salary) return 1;
        return 0;
    }

    @Override
    public double setBonus(double gratification) {
        return gratification + ForEmployee.bonus;
    }
}
