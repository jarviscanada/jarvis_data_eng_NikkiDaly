package ca.jrvs.apps.trading.service;

import ca.jrvs.apps.trading.TestConfig;
import ca.jrvs.apps.trading.dao.QuoteDao;
import ca.jrvs.apps.trading.model.domain.Quote;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={TestConfig.class})
@Sql({"classpath:schema.sql"})
public class QuoteServiceIntTest {

  @Autowired
  private QuoteService quoteService;

  @Autowired
  private QuoteDao quoteDao;

  private Quote savedQuote;

  @Before
  public void setup() {
    quoteDao.deleteAll();
    savedQuote = new Quote();
    savedQuote.setAskPrice(10d);
    savedQuote.setAskSize((long)10);
    savedQuote.setBidPrice(10.2d);
    savedQuote.setBidSize((long)10);
    savedQuote.setId("AAPL");
    savedQuote.setLastPrice(10.1d);
    quoteDao.save(savedQuote);
  }

  @Test
  public void findIexQuoteByTicker() {

  }

  @Test
  public void updateMarketData() {

  }

  @Test
  public void saveQuotes() {

  }

  @Test
  public void saveQuote() {

  }

  @Test
  public void findAllQuotes() {

  }

}
