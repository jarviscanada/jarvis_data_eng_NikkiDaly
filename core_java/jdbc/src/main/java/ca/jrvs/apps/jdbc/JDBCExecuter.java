package ca.jrvs.apps.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCExecuter {

  final static Logger logger = LoggerFactory.getLogger(JDBCExecuter.class);

  public static void main(String[] args) {
    DatabaseConnectionManager dbcm = new DatabaseConnectionManager("localhost", "hplussport",
        "postgres", "password");
    try {
      Connection connection = dbcm.getConnection();
      OrderDAO orderDAO = new OrderDAO(connection);
      List<Order> orders = orderDAO.getOrdersForCustomer(789);
      orders.forEach(System.out::println);
    } catch (SQLException ex) {
      JDBCExecuter.logger.error("ERROR: Could not perform SQL query", ex);
    }
  }
}
