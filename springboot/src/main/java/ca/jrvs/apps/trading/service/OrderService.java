package ca.jrvs.apps.trading.service;

import ca.jrvs.apps.trading.dao.AccountDao;
import ca.jrvs.apps.trading.dao.MarketDataDao;
import ca.jrvs.apps.trading.dao.PositionDao;
import ca.jrvs.apps.trading.dao.QuoteDao;
import ca.jrvs.apps.trading.dao.SecurityOrderDao;
import ca.jrvs.apps.trading.dto.MarketOrderDto;
import ca.jrvs.apps.trading.model.domain.Account;
import ca.jrvs.apps.trading.model.domain.Quote;
import ca.jrvs.apps.trading.model.domain.SecurityOrder;
import com.sun.org.apache.xpath.internal.operations.Quo;
import javax.transaction.Transactional;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderService {

  private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

  private AccountDao accountDao;
  private SecurityOrderDao securityOrderDao;
  private QuoteDao quoteDao;
  private PositionDao positionDao;

  @Autowired
  public OrderService(AccountDao accountDao, SecurityOrderDao securityOrderdao, QuoteDao quoteDao,
      PositionDao positionDao) {
    this.accountDao = accountDao;
    this.securityOrderDao = securityOrderdao;
    this.quoteDao = quoteDao;
    this.positionDao = positionDao;
  }

  /**
   * Execute a merket order
   *
   * - validate the order (e.g. size, and ticker)
   * - Create a securityOrder (for security_order table)
   * - Handle buy or sell order
   *    - buy order: check account balance (calls helper method)
   *    - sell order: check position for the ticker/symbol (call helper method)
   * - Save and return securityOrder
   *
   * Note: you will need to create some helper methods (protected or private)
   *
   * @param orderDto market order
   * @return SecurityOrder from security_order table
   * @throws org.springframework.dao.DataAccessException if unable to get data from DAO
   * @throws IllegalArgumentException for invalid input
   */
  public SecurityOrder executeMarketOrder(MarketOrderDto orderDto) {
    return null;
  }

  /**
   * Helper method that executes a buy order
   * @param marketDataDao user order
   * @param securityOrder to be saved in data database
   * @param account
   */
  protected void handleBuyMarketOrder(MarketDataDao marketDataDao, SecurityOrder securityOrder, Account account) {

  }

  /**
   * Helper method that executes a sell order
   * @param marketDataDao user order
   * @param securityOrder to be saved in the database
   * @param account
   */
  protected void handleSellMarketOrder(MarketDataDao marketDataDao, SecurityOrder securityOrder, Account account) {

  }
}
