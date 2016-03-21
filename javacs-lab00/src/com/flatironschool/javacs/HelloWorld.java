package com.flatironschool.javacs;

public class HelloWorld {

  public static Double getVersion() {
    String property = System.getProperty("java.version").substring(0, 3);
    return Double.parseDouble(property);
  }

  public static void main(String[] args) {
    // you can test the output of getVersion() here
  }
}
