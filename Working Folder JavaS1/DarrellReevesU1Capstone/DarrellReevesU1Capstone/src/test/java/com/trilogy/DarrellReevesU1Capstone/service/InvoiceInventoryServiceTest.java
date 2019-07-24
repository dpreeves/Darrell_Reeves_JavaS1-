package com.trilogy.DarrellReevesU1Capstone.service;

import com.trilogy.DarrellReevesU1Capstone.dao.*;
import com.trilogy.DarrellReevesU1Capstone.model.Console;
import com.trilogy.DarrellReevesU1Capstone.model.Game;
import com.trilogy.DarrellReevesU1Capstone.model.Invoice;
import com.trilogy.DarrellReevesU1Capstone.model.TShirt;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class InvoiceInventoryServiceTest {
    ConsoleDao consoleDao;
    GameDao gameDao;
    TShirtDao tShirtDao;
    InvoiceDao invoiceDao;
    TaxFeeDao taxFeeDao;
    InvoiceInventoryService inventoryService;

    @Before
    public void setUp() throws Exception {

    }

    private void setUpConsoleDaoMock(){
        consoleDao = mock(ConsoleDaoJdbcTemplateImpl.class);

        Console console = new Console();
        console.setConsoleId(1);
        console.setModel("XBox");
        console.setManufacturer("Microsoft");
        console.setMemoryAmount("20 GB");
        console.setProcessor("X1");
        console.setPrice(new BigDecimal("200.00"));
        console.setQuantity(9);



        Console console1 = new Console();
        console1.setModel("XBox1");
        console1.setManufacturer("Microsoft");
        console1.setMemoryAmount("20 GB");
        console1.setProcessor("X1");
        console1.setPrice(new BigDecimal("200.00"));
        console1.setQuantity(9);

        List<Console> consoleList = new ArrayList<>();
        consoleList.add(console);

        doReturn(console).when(consoleDao).addConsole(console1);
        doReturn(console).when(consoleDao).getConsole(1);
        doReturn(consoleList).when(consoleDao).getAllConsoles();
        doReturn(consoleList).when(consoleDao).getConsolesByManufacturer("Microsoft");

    }

    public void setUpGameDaoMock(){
        Game game = new Game();
        game.setGameId(1);
        game.setTitle("Call of Duty");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(5);

        Game game1 = new Game();
        game1.setTitle("Call of Duty");
        game1.setEsrbRating("mature");
        game1.setDescription("first person shooter");
        game1.setPrice(new BigDecimal("20.00"));
        game1.setStudio("Ubisoft");
        game1.setQuantity(5);

        List<Game> gameList = new ArrayList<>();
        gameList.add(game);

        doReturn(game).when(gameDao).addGame(game1);
        doReturn(game).when(gameDao).getGame(1);
        doReturn(gameList).when(gameDao).getAllGames();
        doReturn(gameList).when(gameDao).getGamesByStudio("Ubisoft");
        doReturn(gameList).when(gameDao).getGamesByEsrbRating("mature");
        doReturn(gameList).when(gameDao).getGamesByTitle("Call of Duty");
    }

    public void setUpTShirtDaoMock(){
        TShirt tShirt = new TShirt();
        tShirt.settShirtId(1);
        tShirt.setSize("medium");
        tShirt.setColor("blue");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        TShirt tShirt1 = new TShirt();
        tShirt1.setSize("medium");
        tShirt1.setColor("blue");
        tShirt1.setDescription("Blue Berry Dream");
        tShirt1.setPrice(new BigDecimal("15.00"));
        tShirt1.setQuantity(20);

        List<TShirt> tShirtList = new ArrayList<>();
        tShirtList.add(tShirt);

        doReturn(tShirt).when(tShirtDao).addTShirt(tShirt1);
        doReturn(tShirt).when(tShirtDao).getTShirt(1);
        doReturn(tShirtList).when(tShirtDao).getAllTShirts();
        doReturn(tShirtList).when(tShirtDao).getTShirtsByColor("blue");
        doReturn(tShirtList).when(tShirtDao).getTShirtsBySize("medium");

    }

    public void setUpInvoiceDaoMock(){
        Invoice invoice = new Invoice();
        invoice.setInvoiceId(1);
        invoice.setName("Darrell");
        invoice.setStreet("100 main st");
        invoice.setCity("Charlotte");
        invoice.setState("NC");
        invoice.setZipcode("28211");
        invoice.setItemType("Consoles");
        invoice.setItemId(1);
        invoice.setUnitPrice(new BigDecimal("200.00"));
        invoice.setQuantity(2);
        invoice.setSubtotal(new BigDecimal("420"));
        invoice.setTax(new BigDecimal(".05"));
        invoice.setProcessingFee(new BigDecimal("14.99"));
        invoice.setTotal(new BigDecimal("434.99"));

        doReturn(invoice).when(invoiceDao).addInvoice(invoice);
    }

    @Test
    public void addGetDeleteConsole(){
        Console console = new Console();
        console.setConsoleId(1);
        console.setModel("XBox");
        console.setManufacturer("Microsoft");
        console.setMemoryAmount("20 GB");
        console.setProcessor("X1");
        console.setPrice(new BigDecimal("200.00"));
        console.setQuantity(9);



        Console console1 = new Console();
        console1.setModel("XBox1");
        console1.setManufacturer("Microsoft");
        console1.setMemoryAmount("20 GB");
        console1.setProcessor("X1");
        console1.setPrice(new BigDecimal("200.00"));
        console1.setQuantity(9);

        List<Console> consoleList = new ArrayList<>();
        consoleList.add(console);

        console = inventoryService.
    }
}
