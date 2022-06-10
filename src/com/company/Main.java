package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
      Map<Car,Parameters> car = new HashMap<>();
      car.put(new Car(545,178),new Parameters(2011,85000,"Aston Martin Vantage","Grey"));
      car.put(new Car(634,187),new Parameters(2005,105000,"Porsche Cayenne","Black"));
      car.put(new Car(707,876),new Parameters(2020,90000,"Cadillac Escalade","Black"));
      car.put(new Car(426,978),new Parameters(2014,35000,"BMW X5","Blue"));
      car.put(new Car(942,111),new Parameters(2008,53000,"Mercedes-Benz AMG","White"));

      for (Map.Entry<Car,Parameters> item : car.entrySet()) {
          System.out.print("Key: " + item.getKey() + "\tParameters: " + item.getValue() + "\n");
      }

    }
}
