package lab.jpa;

import com.lab.jpa.Employee;
import org.hibernate.Query;
import org.junit.Test;

public class Read extends JPATemplate {

    @Test
    public void t1() {
        Query query = session.createQuery("From Employee e ");
        System.out.println(query.list());

        for (Object object : query.list()) {
            Employee employee = (Employee) object;
            if (!(employee.getClubs().isEmpty())) {
                System.out.printf("部門: %s 員工姓名: %s 員工薪資: %d 加入的社團: %s\n", employee.getDepartment().getName(),
                         employee.getName(), employee.getSalary().getMoney(), employee.getClubs());
            } else {
                System.out.printf("部門: %s 員工姓名: %s 員工薪資: %d 加入的社團: 無\n", employee.getDepartment().getName(),
                         employee.getName(), employee.getSalary().getMoney());
            }
        }
    }
}
