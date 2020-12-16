package lab.test;

import com.lab.test.Quote;
import com.lab.test.TStock;
import lab.jpa.JPATemplate;
import org.junit.Test;

public class Read extends JPATemplate {
     @Test
    public void t1() {
         TStock tStock=(TStock)session.get(TStock.class, 1);
         System.out.println( tStock.getPortfolios());
         Quote q=(Quote)session.get(Quote.class, 1);
         System.out.println(q.gettStock());
    }
}
