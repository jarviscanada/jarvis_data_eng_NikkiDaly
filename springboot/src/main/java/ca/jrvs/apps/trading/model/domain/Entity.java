package ca.jrvs.apps.trading.model.domain;

public interface Entity<ID> {

  ID geId();

  void setId(ID id);
}
