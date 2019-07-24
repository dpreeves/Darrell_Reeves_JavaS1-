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
public class TShirtDaoJdbcTemplateImplTest {

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
    public void addGetDeleteTShirt(){
        TShirt tShirt = new TShirt();
        tShirt.setSize("large");
        tShirt.setColor("blue");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

        TShirt tShirt1 = tShirtDao.getTShirt(tShirt.gettShirtId());
        assertEquals(tShirt1, tShirt);

        tShirtDao.deleteTShirt(tShirt.gettShirtId());
        tShirt1 = tShirtDao.getTShirt(tShirt.gettShirtId());
        assertNull(tShirt1);
    }

    @Test
    public void updateTShirt(){
        TShirt tShirt = new TShirt();
        tShirt.setSize("large");
        tShirt.setColor("blue");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

//        tShirt = new TShirt();
        tShirt.setSize("large");
        tShirt.setColor("black");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirtDao.updateTShirt(tShirt);

        TShirt tShirt1 = tShirtDao.getTShirt(tShirt.gettShirtId());
        assertEquals(tShirt1, tShirt);
    }

    @Test
    public void getAllTShirts(){
        TShirt tShirt = new TShirt();
        tShirt.setSize("large");
        tShirt.setColor("blue");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

        tShirt = new TShirt();
        tShirt.setSize("large");
        tShirt.setColor("black");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

        List<TShirt> tShirtList = tShirtDao.getAllTShirts();
        assertEquals(2, tShirtList.size());
    }

    @Test
    public void getAllTShirtsByColor(){
        TShirt tShirt = new TShirt();
        tShirt.setSize("large");
        tShirt.setColor("blue");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

        tShirt = new TShirt();
        tShirt.setSize("medium");
        tShirt.setColor("blue");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

        tShirt = new TShirt();
        tShirt.setSize("large");
        tShirt.setColor("black");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

        List<TShirt> tShirtList = tShirtDao.getTShirtsByColor("blue");
        assertEquals(2, tShirtList.size());
    }

    @Test
    public void getAllTShirtsBySize(){
        TShirt tShirt = new TShirt();
        tShirt.setSize("large");
        tShirt.setColor("blue");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

        tShirt = new TShirt();
        tShirt.setSize("medium");
        tShirt.setColor("blue");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

        tShirt = new TShirt();
        tShirt.setSize("large");
        tShirt.setColor("black");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

        List<TShirt> tShirtList = tShirtDao.getTShirtsBySize("large");
        assertEquals(2, tShirtList.size());
    }
}
