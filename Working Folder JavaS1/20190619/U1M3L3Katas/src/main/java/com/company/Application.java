package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
public class Application {

    public static void main(String[] args) {
        int petIndex = Pets.choosePet();
        String chosenPet;
        try {
            System.out.println("Current saved animals file:");
            Pets.readPetsFromFile();


            chosenPet = Pets.retrievePet(petIndex);

            Pets.writePetToFile(chosenPet);

            System.out.println("New saved animals file:");
            Pets.readPetsFromFile();

        } catch (NumberFormatException e) {

            System.out.println("Please enter a valid number");

        } catch (FileNotFoundException e) {
            System.out.println("The following file does not seem to exist: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Please choose an available pet.");

        } catch (IOException e) {
            System.out.println("Something went wrong while writing your file.");

        } finally {
            System.out.println("Have a nice day!");
        }
    }
}