package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class XMLWriteAndRead {
    public static void main(String[] args) {
        try {
            List<Car> carList = new ArrayList<>();

            PrintWriter writer = null;

            carList.add(new Car(2012, "Toyota", "Camry", "Blue"));
            carList.add(new Car(2001, "Honda", "Civic", "Silver"));
            carList.add(new Car(2009, "Jeep", "Wrangler", "Rust"));
            carList.add(new Car(2018, "Tesla", "Roadster", "Black"));
            carList.add(new Car(1964, "Ford", "Mustang", "Red"));

            ObjectMapper mapper = new ObjectMapper();
            String xmlCarList = mapper.writeValueAsString(carList);
            System.out.println(xmlCarList);
            writer = new PrintWriter(new FileWriter("cars.xml"));
            writer.println(xmlCarList);

        }catch(IOException e){
            System.out.println("");
        }

    }
}
