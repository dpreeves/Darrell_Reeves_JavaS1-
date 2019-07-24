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

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InvoiceDaoJdbcTemplateImplTest {
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
    public void makePurchase(){
        TShirt tShirt = new TShirt();
        tShirt.settShirtId(1);
        tShirt.setSize("large");
        tShirt.setColor("blue");
        tShirt.setDescription("Blue Berry Dream");
        tShirt.setPrice(new BigDecimal("15.00"));
        tShirt.setQuantity(20);

        tShirt = tShirtDao.addTShirt(tShirt);

        Invoice invoice = new Invoice();
        invoice.setInvoiceId(1);
        invoice.setName("Darrell");
        invoice.setStreet("100 main st.");
        invoice.setCity("Charlotte");
        invoice.setState("NC");
        invoice.setZipcode("28211");
        invoice.setItemType("T-Shirts");
        invoice.setItemId(tShirt.gettShirtId());
        invoice.setUnitPrice(tShirt.getPrice());
        invoice.setQuantity(2);
        invoice.setSubtotal(tShirt.getPrice().multiply(new BigDecimal(invoice.getQuantity())));
        invoice.setTax(new BigDecimal(".05"));
        invoice.setProcessingFee(new BigDecimal("1.98"));
        invoice.setTotal(new BigDecimal("33.48"));

        invoiceDao.addInvoice(invoice);

        Invoice invoice1 = invoiceDao.getInvoice(invoice.getInvoiceId());
        assertEquals(invoice1, invoice);

    }



}
