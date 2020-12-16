package aop;

import com.mycompany.springbasic1102.aop.Calc;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mycompany.springbasic1102.aop.BMI;

public class Test2 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
        BMI bmi = ctx.getBean("bmiImpl", BMI.class);
        System.out.println(bmi.clac(170.0, 60.0));
        ctx.close();
    }
}
