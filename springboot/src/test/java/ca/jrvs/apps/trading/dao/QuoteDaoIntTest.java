package ca.jrvs.apps.trading.dao;

import static org.junit.Assert.assertEquals;

import ca.jrvs.apps.trading.TestConfig;
import ca.jrvs.apps.trading.model.domain.Quote;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestConfig.class})
@Sql({"classpath:schema.sql"})
public class QuoteDaoIntTest {

  @Autowired
  private QuoteDao quoteDao;

  private Quote savedQuote;

  @Before
  public void insertOne() {
    savedQuote = new Quote();
    savedQuote.setAskPrice(10d);
    savedQuote.setAskSize((long)10);
    savedQuote.setBidPrice(10.2d);
    savedQuote.setBidSize((long)10);
    savedQuote.setId("AAPL");
    savedQuote.setLastPrice(10.1d);
    quoteDao.save(savedQuote);
  }

  /*@After
  public void deleteOne() {
    quoteDao.deleteById(savedQuote.getTicker());
  }*/

  @Test
  public void testSave() {
    Quote testQuote = new Quote();
    testQuote.setAskPrice(11d);
    testQuote.setAskSize((long)11);
    testQuote.setBidPrice(11d);
    testQuote.setBidSize((long)11);
    testQuote.setId("GOOGL");
    testQuote.setLastPrice(11.1d);
    quoteDao.save(testQuote);
    Quote retrievedQuote = quoteDao.findById(testQuote.getTicker()).get();
    assertEquals(testQuote, retrievedQuote);
  }

}
