package com.trilogy.DarrellReevesU1Capstone.dao;

import com.trilogy.DarrellReevesU1Capstone.model.Console;
import com.trilogy.DarrellReevesU1Capstone.model.Game;
import com.trilogy.DarrellReevesU1Capstone.model.Invoice;
import com.trilogy.DarrellReevesU1Capstone.model.TShirt;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConsoleDaoJdbcTemplateImplTest {

    @Autowired
    ConsoleDao consoleDao;
    @Autowired
    GameDao gameDao;
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    TaxFeeDao taxFeeDao;
    @Autowired
    TShirtDao tShirtDao;

    @Before
    public void setUp() throws Exception {
        List<Game> gameList = gameDao.getAllGames();
        for (Game game: gameList){
            gameDao.deleteGame(game.getGameId());
        }

        List<Console> consoleList = consoleDao.getAllConsoles();
        for (Console console: consoleList){
            consoleDao.deleteConsole(console.getConsoleId());
        }

        List<TShirt> tShirtList = tShirtDao.getAllTShirts();
        for (TShirt tShirt: tShirtList){
            tShirtDao.deleteTShirt(tShirt.gettShirtId());
        }

//        List<Invoice> invoiceList = invoiceDao.getAllInvoices();
//        for (Invoice invoice: invoiceList){
//            invoiceDao.deleteInvoice(invoice.getInvoiceId());
//        }
    }

    @Test
    public void addGetDeleteConsole(){
        Console console = new Console();
        console.setModel("XBox");
        console.setManufacturer("Microsoft");
        console.setMemoryAmount("20 GB");
        console.setProcessor("X1");
        console.setPrice(new BigDecimal("200.00"));
        console.setQuantity(9);
        console = consoleDao.addConsole(console);

        Console console1 = consoleDao.getConsole(console.getConsoleId());
        assertEquals(console1, console);

        consoleDao.deleteConsole(console.getConsoleId());
        console1 = consoleDao.getConsole(console.getConsoleId());
        assertNull(console1);
    }

    @Test
    public void updateConsole() {
        Console console = new Console();
        console.setModel("XBox");
        console.setManufacturer("Microsoft");
        console.setMemoryAmount("20 GB");
        console.setProcessor("X1");
        console.setPrice(new BigDecimal("200.00"));
        console.setQuantity(9);

        console = consoleDao.addConsole(console);

        console.setModel("XBox");
        console.setManufacturer("Microsoft");
        console.setMemoryAmount("40 GB");
        console.setProcessor("X2");
        console.setPrice(new BigDecimal("200.00"));
        console.setQuantity(9);
        consoleDao.updateConsole(console);

        Console console1 = consoleDao.getConsole(console.getConsoleId());
        assertEquals(console1, console);

    }

    @Test
    public void getAllConsoles() {
        Console console = new Console();
        console.setModel("XBox");
        console.setManufacturer("Microsoft");
        console.setMemoryAmount("20 GB");
        console.setProcessor("X1");
        console.setPrice(new BigDecimal("200.00"));
        console.setQuantity(9);

        console = consoleDao.addConsole(console);

        console = new Console();
        console.setModel("XBox1");
        console.setManufacturer("Microsoft");
        console.setMemoryAmount("40 GB");
        console.setProcessor("X3");
        console.setPrice(new BigDecimal("200.00"));
        console.setQuantity(9);
        consoleDao.addConsole(console);

        List<Console> consoleList = consoleDao.getAllConsoles();
        assertEquals(2, consoleList.size());

    }

    @Test
    public void getAllConsolesByManufacturer() {
        Console console = new Console();
        console.setModel("XBox");
        console.setManufacturer("Microsoft");
        console.setMemoryAmount("20 GB");
        console.setProcessor("X1");
        console.setPrice(new BigDecimal("200.00"));
        console.setQuantity(9);

        console = consoleDao.addConsole(console);

        console = new Console();
        console.setModel("XBox1");
        console.setManufacturer("Microsoft");
        console.setMemoryAmount("40 GB");
        console.setProcessor("X3");
        console.setPrice(new BigDecimal(200));
        console.setQuantity(9);
        consoleDao.addConsole(console);

        console = new Console();
        console.setModel("Playstation");
        console.setManufacturer("Sony");
        console.setMemoryAmount("40 GB");
        console.setProcessor("X3");
        console.setPrice(new BigDecimal(200));
        console.setQuantity(9);
        consoleDao.addConsole(console);

        List<Console> consoleList = consoleDao.getConsolesByManufacturer("Microsoft");
        assertEquals(2, consoleList.size());

    }
}
