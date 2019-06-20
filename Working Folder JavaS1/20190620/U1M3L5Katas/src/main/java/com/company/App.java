package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        //instantiate list with json

        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Television> tvList;
            tvList = mapper.readValue(new File("televisions.json"),
                    new TypeReference<List<Television>>() {
                    });
//                    .withType(Television.class)
//                    .build().parse();

            //filter screensize greater than 60 with forEach

            tvList
                    .stream()
                    .filter(t -> t.getScreenSize() > 60)
                    .forEach(t -> {
                        System.out.println("===========");
                        System.out.println("Make: " + t.getBrand());
                        System.out.println("Model: " + t.getModel());
                        System.out.println("Color: " + t.getPrice());
                        System.out.println("Year: " + t.getScreenSize());
                    });


            //groupby brand
            System.out.println("===Manufacturer ====");
            Map<String, List<Television>> groupedTVs =
                    tvList
                            .stream()
                            .collect(Collectors.groupingBy(t -> t.getBrand()));

            Set<String> keys = groupedTVs.keySet();
            for (String key : keys) {
                System.out.println(key);
            }

            //find and display average screensize
            System.out.println("Find and display average screensize.");
            double avgScreenSize =
                    tvList
                            .stream()
                            .mapToInt(t -> t.getScreenSize())
                            .average()
                            .getAsDouble();

            System.out.println("The average screensize is " + avgScreenSize);


            // largest screensize


            System.out.println("\n\nCaculating max screensize");

            int maxScreenSize = tvList
                    .stream()
                    .mapToInt(b -> b.getScreenSize())
                    .max()
                    .getAsInt();

            System.out.println("Max screensize: " + maxScreenSize);
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }


    }

}
