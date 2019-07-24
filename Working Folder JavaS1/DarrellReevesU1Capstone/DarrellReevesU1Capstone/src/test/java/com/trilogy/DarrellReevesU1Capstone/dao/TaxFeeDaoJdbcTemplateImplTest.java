package com.trilogy.DarrellReevesU1Capstone.dao;

import com.trilogy.DarrellReevesU1Capstone.model.Console;
import com.trilogy.DarrellReevesU1Capstone.model.Game;
import com.trilogy.DarrellReevesU1Capstone.model.SalesTaxRate;
import com.trilogy.DarrellReevesU1Capstone.model.TShirt;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaxFeeDaoJdbcTemplateImplTest {
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

    public void taxTest(){
        SalesTaxRate salesTaxRate = new SalesTaxRate();
        salesTaxRate.setIxStateRate(1);
        salesTaxRate.setState("NC");
        salesTaxRate.setRate(new BigDecimal(.05));
    }
}
