//nCSVReadObjects
//        package com.company.csv;
//        ​
//import com.company.Motorcycle;
//import com.opencsv.bean.CsvToBeanBuilder;
//import com.opencsv.bean.StatefulBeanToCsv;
//import com.opencsv.bean.StatefulBeanToCsvBuilder;
//import com.opencsv.exceptions.CsvDataTypeMismatchException;
//import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
//​
//import java.io.*;
//import java.util.List;
//​
//public class AppOpenCSVReadObjects {
//​
//    public static void main(String[] args) {
//        try {
//            List<Motorcycle> bikes =
//                    new CsvToBeanBuilder<Motorcycle>(new FileReader("motorcycles.csv")).withType(Motorcycle.class).build().parse();
//​
//            for (Motorcycle bike : bikes) {
//                System.out.println("=================================");
//                System.out.println(bike.getMake());
//                System.out.println(bike.getModel());
//                System.out.println(bike.getYear());
//                System.out.println(bike.getColor());
//                System.out.println(bike.getDisplacement());
//                System.out.println(bike.getHorsepower());
//                System.out.println(bike.getWeight());
//​
//                // Now let's write the motorcycle list to another file
//                Writer writer = new FileWriter("new_moto_file.csv");
//                StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
//                beanToCsv.write(bikes);
//                writer.close();
//​
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Could not find CSV file: " + e.getMessage());
//        }catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
//            System.out.println("ERROR: Something went wrong writing your CSV file: " + e.getMessage());
//        }
//    }
//}
//Collapse
//
//
//        Kesh [1:41 PM]
//        https://fasterxml.github.io/jackson-databind/javadoc/2.7/com/fasterxml/jackson/databind/ObjectMapper.html
//
//        Deep Patel [2:27 PM]
//        AppJacksonWriteObjects
//        package com.company.json;
//        ​
//        import com.company.Motorcycle;
//        import com.fasterxml.jackson.core.JsonProcessingException;
//        import com.fasterxml.jackson.databind.ObjectMapper;
//        ​
//        import java.io.FileWriter;
//        import java.io.IOException;
//        import java.io.PrintWriter;
//        import java.util.ArrayList;
//        import java.util.List;
//        ​
//public class AppJacksonWriteObjects {
//​
//    public static void main(String[] args) {
//​
//        PrintWriter writer = null;
//​
//        Motorcycle bike = new Motorcycle();
//        bike.setMake("Ducati");
//        bike.setModel("Panigale V4R");
//        bike.setYear("2019");
//        bike.setColor("Red");
//        bike.setDisplacement(1103);
//        bike.setHorsepower(214);
//        bike.setWeight(379);
//​
//        Motorcycle bike2 = new Motorcycle();
//        bike2.setMake("Triumph");
//        bike2.setModel("Tiger XCa");
//        bike2.setYear("2019");
//        bike2.setColor("Blue");
//        bike2.setDisplacement(1215);
//        bike2.setHorsepower(139);
//        bike2.setWeight(547);
//​
//        List<Motorcycle> bikeList = new ArrayList<>();
//​
//        bikeList.add(bike);
//        bikeList.add(bike2);
//​
//​
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            String jsonBikeList = mapper.writeValueAsString(bikeList);
//​
//            System.out.println(jsonBikeList);
//​
//​
//            writer = new PrintWriter(new FileWriter("motorcycles.json"));
//​
//            writer.println(jsonBikeList);
//​
//​
//        } catch (JsonProcessingException e) {
//            System.out.println("ERROR: Trouble converting object to JSON string: " + e.getMessage());
//        } catch (IOException e) {
//            System.out.println("ERROR: Could not write to file: " + e.getMessage());
//        } finally {
//            if (writer != null) {
//                writer.flush();
//                writer.close();
//            }
//        }
//​
//    }
//}