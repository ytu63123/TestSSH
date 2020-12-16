package lab.test1;

import com.lab.jpa.Student;
import lab.jpa.JPATemplate;
import org.junit.Test;

public class Read extends JPATemplate{
    @Test
    public void t1(){
    Student student=(Student)session.get(Student.class, 1);
        System.out.println(student.getSname());
    }
}
