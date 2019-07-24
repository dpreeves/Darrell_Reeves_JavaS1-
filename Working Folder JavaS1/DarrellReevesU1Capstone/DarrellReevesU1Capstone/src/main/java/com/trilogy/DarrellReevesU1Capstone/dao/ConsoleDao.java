package com.trilogy.DarrellReevesU1Capstone.dao;

import com.trilogy.DarrellReevesU1Capstone.model.Console;

import java.util.List;

public interface ConsoleDao {
    Console addConsole(Console console);
    Console getConsole(int consoleId);
    List<Console> getAllConsoles();
    void updateConsole(Console console);
    void deleteConsole(int consoleId);
    List<Console> getConsolesByManufacturer(String manufacturer);

}
