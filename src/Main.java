import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Employee willy = new Employee("Willy", 4000, new Date());

        System.out.println(willy.getName());
        System.out.println(willy.getDescription());

        Boss sara = new Boss("Sara", 9000, new Date());

        System.out.println(sara.getName());
        System.out.println(sara.getDescription());
        sara.setCharge("Gerente");
        System.out.println(sara.getCharge());

        Student juana = new Student("Juana", "Historia", "Aula 2");

        System.out.println(juana.getName());
        System.out.println(juana.getDescription());

        Employee[] losEmpleados = new Employee[5];
        losEmpleados[0] = new Employee("Maria", 5000, new Date());
        losEmpleados[1] = new Employee("Juan", 4500, new Date());
        losEmpleados[2] = new Employee("Pedro", 2000, new Date());
        losEmpleados[3] = new Employee("Santi", 8000, new Date());
        losEmpleados[4] = new Employee("Joana", 10000, new Date());

        Arrays.sort(losEmpleados);
        for (Employee employee : losEmpleados) {
            System.out.println(employee.getDescription());
        }

        Boss guillermo = new Boss("Guillermo", 7000, new Date());
        Employee sonia = new Employee("Sonia", 5600, new Date());

        System.out.println("El trabajador " + guillermo.getName() + " tiene un bonus de " + guillermo.setBonus(500));
        System.out.println("La trabajadora " + sonia.getName() + " tiene un bonus de " + sonia.setBonus(700));
    }
}