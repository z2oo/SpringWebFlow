package main.resources.scripts

import main.java.com.springinaction.pizza.domain.Order
import main.java.com.springinaction.pizza.service.PricingEngine

import java.io.Serializable;

class PricingEngineImpl implements PricingEngine, Serializable {
  public float calculateOrderTotal(Order order) {
    print "IN GROOVY";
  
    retun 99.99;
  }
}
