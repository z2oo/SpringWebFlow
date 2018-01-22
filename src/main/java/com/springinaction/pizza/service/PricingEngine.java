package main.java.com.springinaction.pizza.service;

import main.java.com.springinaction.pizza.domain.Order;

public interface PricingEngine {
  public float calculateOrderTotal(Order order);
}
