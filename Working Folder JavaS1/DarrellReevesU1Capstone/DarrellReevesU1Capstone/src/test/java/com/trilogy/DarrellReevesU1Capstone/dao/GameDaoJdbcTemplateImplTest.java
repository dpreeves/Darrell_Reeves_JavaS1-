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
public class GameDaoJdbcTemplateImplTest {

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
    public void addGetDeleteGame(){
        Game game = new Game();
        game.setTitle("Call of Duty");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(5);

        game = gameDao.addGame(game);

        Game game1 = gameDao.getGame(game.getGameId());
        assertEquals(game1, game);

        gameDao.deleteGame(game.getGameId());
        game1 = gameDao.getGame(game.getGameId());
        assertNull(game1);
    }

    @Test
    public void updateGame(){
        Game game = new Game();
        game.setTitle("Call of Duty");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(5);

        game = gameDao.addGame(game);

        game.setTitle("Call of Duty 2");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(6);
        gameDao.updateGame(game);

        Game game1 = gameDao.getGame(game.getGameId());
        assertEquals(game1, game);
    }

    @Test
    public void getAllGames(){
        Game game = new Game();
        game.setTitle("Call of Duty");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(5);

        game = gameDao.addGame(game);

        game = new Game();
        game.setTitle("Call of Duty 2");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(6);

        gameDao.addGame(game);

        List<Game> gameList = gameDao.getAllGames();
        assertEquals(2, gameList.size());
    }

    @Test
    public void getAllGamesByStudio(){
        Game game = new Game();
        game.setTitle("Call of Duty");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(5);

        game = gameDao.addGame(game);

        game = new Game();
        game.setTitle("Call of Duty 2");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(6);

        gameDao.addGame(game);

        game = new Game();
        game.setTitle("Call of Duty 3");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("UFOtable");
        game.setQuantity(6);

        gameDao.addGame(game);

        List<Game> gameList = gameDao.getGamesByStudio("Ubisoft");
        assertEquals(2, gameList.size());
    }

    @Test
    public void getAllGamesByEsrbRating(){
        Game game = new Game();
        game.setTitle("Call of Duty");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(5);

        game = gameDao.addGame(game);

        game = new Game();
        game.setTitle("Call of Duty 2");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(6);

        gameDao.addGame(game);

        game = new Game();
        game.setTitle("Call of Duty 3");
        game.setEsrbRating("teen");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("UFOtable");
        game.setQuantity(6);

        gameDao.addGame(game);

        List<Game> gameList = gameDao.getGamesByEsrbRating("mature");
        assertEquals(2, gameList.size());
    }

    @Test
    public void getAllGamesByTitle(){
        Game game = new Game();
        game.setTitle("Call of Duty");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(5);

        game = gameDao.addGame(game);

        game = new Game();
        game.setTitle("Call of Duty 2");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("Ubisoft");
        game.setQuantity(6);

        gameDao.addGame(game);

        game = new Game();
        game.setTitle("Call of Duty");
        game.setEsrbRating("mature");
        game.setDescription("first person shooter");
        game.setPrice(new BigDecimal("20.00"));
        game.setStudio("UFOtable");
        game.setQuantity(6);

        gameDao.addGame(game);

        List<Game> gameList = gameDao.getGamesByTitle("Call of Duty");
        assertEquals(2, gameList.size());
    }

}
