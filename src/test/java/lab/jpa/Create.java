package lab.jpa;

import com.lab.jpa.Club;
import com.lab.jpa.Department;
import com.lab.jpa.Employee;
import com.lab.jpa.Salary;
import org.junit.Test;

public class Create extends JPATemplate {

    @Test
    public void t1() {
        Department dept1 = new Department();
        dept1.setName("IT");
        Department dept2 = new Department();
        dept2.setName("Sales");
        Salary salary1 = new Salary();
        salary1.setMoney(50000);
        Salary salary2 = new Salary();
        salary2.setMoney(40000);
        Salary salary3 = new Salary();
        salary3.setMoney(30000);
        Salary salary4 = new Salary();
        salary4.setMoney(20000);
        Club c1 = new Club();
        c1.setName("A");
        Club c2 = new Club();
        c2.setName("B");
        Employee emp1 = new Employee();
        emp1.setName("Vincent");
        Employee emp2 = new Employee();
        emp2.setName("Anita");
        Employee emp3 = new Employee();
        emp3.setName("Howard");
        Employee emp4 = new Employee();
        emp4.setName("Joanna");

        emp1.setDepartment(dept1);
        emp1.setSalary(salary1);
        emp1.getClubs().add(c1);
        emp1.getClubs().add(c2);

        emp2.setDepartment(dept2);
        emp2.setSalary(salary2);

        emp3.setDepartment(dept2);
        emp3.setSalary(salary3);
        emp3.getClubs().add(c2);

        emp4.setDepartment(dept1);
        emp4.setSalary(salary4);


        session.persist(emp1);
        session.persist(emp2);
        session.persist(emp3);
        session.persist(emp4);
    }
}
