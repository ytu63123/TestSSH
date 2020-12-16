package lab.test;

import com.lab.test.Classify;
import com.lab.test.Investor;
import com.lab.test.Portfolio;
import com.lab.test.Quote;
import com.lab.test.TStock;
import java.util.Date;
import lab.jpa.JPATemplate;
import org.junit.Test;

public class Create extends JPATemplate {

    @Test
    public void t1() {
        Investor investor = new Investor();
        investor.setUsername("ytu63123");
        investor.setPassword("123456789");
        investor.setEmail("ytu63123@yahoo.com.tw");

        Portfolio portfolio = new Portfolio();
        portfolio.setName("台積電");

        TStock tStock = new TStock();
        tStock.setSymbol("2330");

        Classify classify = new Classify();
        classify.setName("AAA");

        Quote quote = new Quote();
        quote.setName("台積電");
        quote.setChangeInPercent(1.21);
        quote.setChange(6.00);
        quote.setPrice(503.00);
        quote.setTradeTime(new Date());
        
        tStock.setClassify(classify);
        tStock.setQuote(quote);
        tStock.getPortfolios().add(portfolio);
        portfolio.setInvestor(investor);
        
        session.persist(tStock);
        session.persist(portfolio);
        
    }
}
