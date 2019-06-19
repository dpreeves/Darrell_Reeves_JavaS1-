package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class CSVWriteAndRead {
    public static void main(String[] args) {

        try {
            //mapper.readValue
            List<Car> carList = new ArrayList<>();

            carList.add(new Car(2012, "Toyota", "Camry", "Blue"));
            carList.add(new Car(2001, "Honda", "Civic", "Silver"));
            carList.add(new Car(2009, "Jeep", "Wrangler", "Rust"));
            carList.add(new Car(2018, "Tesla", "Roadster", "Black"));
            carList.add(new Car(1964, "Ford", "Mustang", "Red"));

            Writer writer = new FileWriter("cars.csv");
            new CsvToBeanBuilder<Car>(new FileReader("cars.csv"));
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            beanToCsv.write(carList);
            writer.close();


            for (Car temp : carList) {
                System.out.println("==============");
                System.out.println(temp.getMake());
                System.out.println(temp.getModel());
                System.out.println(temp.getColor());
                System.out.println(temp.getYear());
            }
        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage());


        }
    }


}