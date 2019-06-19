package com.company;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ComputerReader {

    public static void main(String[] args) {


        try {
//            //mapper.readValue
//            List<Computer> computerList = new ArrayList<>();
//
//            BufferedReader br = new BufferedReader(new FileReader("computers.csv")) ;
//                String line = "";
//                while ((line = br.readLine()) != null) {
//                    String[] attribute = line.split(",");
//
//                    Computer computer = new Computer(attribute);
//
//                    computerList.add(computer);

            List<Computer> computerList;
                    computerList = new CsvToBeanBuilder<Computer>(new FileReader("computers.csv")).withType(Computer.class).build().parse();

                    for (Computer temp : computerList) {
                        System.out.println("==============");
                        System.out.println(temp.getBrand());
                        System.out.println(temp.getModel());
                        System.out.println(temp.getCPU());
                        System.out.println(temp.getRAM());
                        System.out.println(temp.getStorageSize());
                    }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR");


        }catch(IOException e){
        System.out.println("");
    }
    }
}
