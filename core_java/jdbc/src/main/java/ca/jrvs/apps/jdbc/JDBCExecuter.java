package ca.jrvs.apps.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jdk.nashorn.internal.scripts.JD;
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
      Order order = orderDAO.findById(1000);
      System.out.println(order);

    } catch(SQLException ex){
      JDBCExecuter.logger.error("ERROR: Could not perform SQL query", ex);
    }
  }
}
