package com.bpi.services;

import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class DemoService {
  public String getGreeting() {
    return "Hello from DemoService!";
  }
}
