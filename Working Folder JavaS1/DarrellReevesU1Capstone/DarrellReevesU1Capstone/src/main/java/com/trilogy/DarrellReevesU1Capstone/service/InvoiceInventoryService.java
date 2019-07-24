package com.trilogy.DarrellReevesU1Capstone.service;

import com.trilogy.DarrellReevesU1Capstone.dao.*;
import com.trilogy.DarrellReevesU1Capstone.model.*;
import com.trilogy.DarrellReevesU1Capstone.viewmodel.ConsoleViewModel;
import com.trilogy.DarrellReevesU1Capstone.viewmodel.GameViewModel;
import com.trilogy.DarrellReevesU1Capstone.viewmodel.InvoiceViewModel;
import com.trilogy.DarrellReevesU1Capstone.viewmodel.TShirtViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class InvoiceInventoryService {

    ConsoleDao consoleDao;
    GameDao gameDao;
    InvoiceDao invoiceDao;
    TShirtDao tShirtDao;
    TaxFeeDao taxFeeDao;

    @Autowired
    public InvoiceInventoryService(ConsoleDao consoleDao, GameDao gameDao, InvoiceDao invoiceDao, TShirtDao tShirtDao, TaxFeeDao taxFeeDao) {
        this.consoleDao = consoleDao;
        this.gameDao = gameDao;
        this.invoiceDao = invoiceDao;
        this.taxFeeDao = taxFeeDao;
        this.tShirtDao = tShirtDao;
    }

    public ConsoleViewModel saveConsole(ConsoleViewModel consoleViewModel) {
        Console console = new Console();
        console.setModel(consoleViewModel.getModel());
        console.setManufacturer(consoleViewModel.getManufacturer());
        console.setMemoryAmount(consoleViewModel.getMemoryAmount());
        console.setProcessor(consoleViewModel.getProcessor());
        console.setPrice(consoleViewModel.getPrice());
        console.setQuantity(consoleViewModel.getQuantity());
        console = consoleDao.addConsole(console);

        consoleViewModel.setConsoleId(console.getConsoleId());

        return consoleViewModel;
    }

    public void updateConsole(ConsoleViewModel consoleViewModel) {
        Console console = new Console();
        console.setConsoleId(consoleViewModel.getConsoleId());
        console.setModel(consoleViewModel.getModel());
        console.setManufacturer(consoleViewModel.getManufacturer());
        console.setMemoryAmount(consoleViewModel.getMemoryAmount());
        console.setProcessor(consoleViewModel.getProcessor());
        console.setPrice(consoleViewModel.getPrice());
        console.setQuantity(consoleViewModel.getQuantity());

        consoleDao.updateConsole(console);
    }

    public ConsoleViewModel findConsoleById(int consoleId) {
        Console console = consoleDao.getConsole(consoleId);
        if (console == null)
            return null;
        else return buildConsoleViewModel(console);
    }

    public List<ConsoleViewModel> findAllConsoles() {
        List<Console> consoleList = consoleDao.getAllConsoles();
        List<ConsoleViewModel> consoleViewModelList = new ArrayList<>();
        for (Console console : consoleList) {
            consoleViewModelList.add(buildConsoleViewModel(console));
        }
        return consoleViewModelList;
    }

    public List<ConsoleViewModel> findConsoleByManufacturer(String manufacturer) {
        List<Console> consoleList = consoleDao.getConsolesByManufacturer(manufacturer);
        List<ConsoleViewModel> consoleViewModelList = new ArrayList<>();
        for (Console console : consoleList) {
            consoleViewModelList.add(buildConsoleViewModel(console));
        }
        return consoleViewModelList;
    }

    public void removeConsole(int consoleId) {
        consoleDao.deleteConsole(consoleId);
    }

    public GameViewModel saveGame(GameViewModel gameViewModel) {
        Game game = new Game();
        game.setTitle(gameViewModel.getTitle());
        game.setEsrbRating(gameViewModel.getEsrbRating());
        game.setDescription(gameViewModel.getDescription());
        game.setPrice(gameViewModel.getPrice());
        game.setStudio(gameViewModel.getStudio());
        game.setQuantity(gameViewModel.getQuantity());
        game = gameDao.addGame(game);

        gameViewModel.setGameId(game.getGameId());
        return gameViewModel;
    }

    public void updateGame(GameViewModel gameViewModel) {
        Game game = new Game();
        game.setGameId(gameViewModel.getGameId());
        game.setTitle(gameViewModel.getTitle());
        game.setEsrbRating(gameViewModel.getEsrbRating());
        game.setDescription(gameViewModel.getDescription());
        game.setPrice(gameViewModel.getPrice());
        game.setStudio(gameViewModel.getStudio());
        game.setQuantity(gameViewModel.getQuantity());

        gameDao.updateGame(game);
    }

    public GameViewModel findGameById(int gameId) {
        Game game = gameDao.getGame(gameId);
        if (game == null)
            return null;
        else return buildGameViewModel(game);
    }

    public List<GameViewModel> findAllGames() {
        List<Game> gameList = gameDao.getAllGames();
        List<GameViewModel> gameViewModelList = new ArrayList<>();
        for (Game game : gameList) {
            gameViewModelList.add(buildGameViewModel(game));
        }
        return gameViewModelList;
    }

    public List<GameViewModel> findGameByStudio(String studio) {
        List<Game> gameList = gameDao.getGamesByStudio(studio);
        List<GameViewModel> gameViewModelList = new ArrayList<>();
        for (Game game : gameList) {
            gameViewModelList.add(buildGameViewModel(game));
        }
        return gameViewModelList;
    }

    public List<GameViewModel> findGameByEsrbRating(String esrbRating) {
        List<Game> gameList = gameDao.getGamesByEsrbRating(esrbRating);
        List<GameViewModel> gameViewModelList = new ArrayList<>();
        for (Game game : gameList) {
            gameViewModelList.add(buildGameViewModel(game));
        }
        return gameViewModelList;
    }

    public List<GameViewModel> findGameByTitle(String title) {
        List<Game> gameList = gameDao.getGamesByTitle(title);
        List<GameViewModel> gameViewModelList = new ArrayList<>();
        for (Game game : gameList) {
            gameViewModelList.add(buildGameViewModel(game));
        }
        return gameViewModelList;
    }

    public void removeGame(int gameId) {
        gameDao.deleteGame(gameId);
    }

    public TShirtViewModel saveTShirt(TShirtViewModel tShirtViewModel) {
        TShirt tShirt = new TShirt();
        tShirt.setSize(tShirtViewModel.getSize());
        tShirt.setColor(tShirtViewModel.getColor());
        tShirt.setDescription(tShirtViewModel.getDescription());
        tShirt.setPrice(tShirtViewModel.getPrice());
        tShirt.setQuantity(tShirtViewModel.getQuantity());
        tShirt = tShirtDao.addTShirt(tShirt);

        tShirtViewModel.settShirtId(tShirt.gettShirtId());
        return tShirtViewModel;
    }

    public void updateTShirt(TShirtViewModel tShirtViewModel) {
        TShirt tShirt = new TShirt();
        tShirt.settShirtId(tShirtViewModel.gettShirtId());
        tShirt.setSize(tShirtViewModel.getSize());
        tShirt.setColor(tShirtViewModel.getColor());
        tShirt.setDescription(tShirtViewModel.getDescription());
        tShirt.setPrice(tShirtViewModel.getPrice());
        tShirt.setQuantity(tShirtViewModel.getQuantity());

        tShirtDao.updateTShirt(tShirt);
    }

    public TShirtViewModel findTShirtById(int tShirtId) {
        TShirt tShirt = tShirtDao.getTShirt(tShirtId);
        if (tShirt == null)
            return null;
        else return buildTShirtViewModel(tShirt);
    }

    public List<TShirtViewModel> findAllTShirts() {
        List<TShirt> tShirtList = tShirtDao.getAllTShirts();
        List<TShirtViewModel> tShirtViewModelList = new ArrayList<>();

        for (TShirt tShirt : tShirtList) {
            tShirtViewModelList.add(buildTShirtViewModel(tShirt));
        }
        return tShirtViewModelList;
    }

    public List<TShirtViewModel> findTShirtByColor(String color) {
        List<TShirt> tShirtList = tShirtDao.getTShirtsByColor(color);
        List<TShirtViewModel> tShirtViewModelList = new ArrayList<>();

        for (TShirt tShirt : tShirtList) {
            tShirtViewModelList.add(buildTShirtViewModel(tShirt));
        }
        return tShirtViewModelList;
    }

    public List<TShirtViewModel> findTShirtBySize(String size) {
        List<TShirt> tShirtList = tShirtDao.getTShirtsBySize(size);
        List<TShirtViewModel> tShirtViewModelList = new ArrayList<>();

        for (TShirt tShirt : tShirtList) {
            tShirtViewModelList.add(buildTShirtViewModel(tShirt));
        }
        return tShirtViewModelList;
    }

    public void removeTShirt(int tShirtId) {
        tShirtDao.deleteTShirt(tShirtId);
    }

    public InvoiceViewModel makePurchase(InvoiceViewModel invoiceViewModel) {
        Invoice invoice = new Invoice();
        invoice.setInvoiceId(invoiceViewModel.getInvoiceId());
        invoice.setName(invoiceViewModel.getName());
        invoice.setStreet(invoiceViewModel.getStreet());
        invoice.setCity(invoiceViewModel.getCity());
        invoice.setState(invoiceViewModel.getState());
        invoice.setZipcode(invoiceViewModel.getZipcode());
        invoice.setItemType(invoiceViewModel.getItemType());
        invoice.setItemId(invoiceViewModel.getItemId());
        invoice.setQuantity(invoiceViewModel.getQuantity());


        switch (invoice.getItemType()) {
            case "Consoles":
                Console console = consoleDao.getConsole(invoiceViewModel.getItemId());
                if (console.getQuantity() < invoiceViewModel.getQuantity()){
                    return null;
                } else console.setQuantity(console.getQuantity() - invoiceViewModel.getQuantity());
                invoice.setUnitPrice(console.getPrice());
                consoleDao.updateConsole(console);
                break;
            case "T-Shirts":
                TShirt tShirt = tShirtDao.getTShirt(invoiceViewModel.getItemId());
                if (tShirt.getQuantity() < invoiceViewModel.getQuantity()){
                    return null;
                }tShirt.setQuantity(tShirt.getQuantity() - invoiceViewModel.getQuantity());
                invoice.setUnitPrice(tShirt.getPrice());
                tShirtDao.updateTShirt(tShirt);
                break;
            case "Games":
                Game game = gameDao.getGame(invoiceViewModel.getItemId());
                if (game.getQuantity() < invoiceViewModel.getQuantity()){
                    return null;
                }game.setQuantity(game.getQuantity() - invoiceViewModel.getQuantity());
                invoice.setUnitPrice(game.getPrice());
                gameDao.updateGame(game);
                break;
        }
        SalesTaxRate taxRate = taxFeeDao.getSalesTaxRate(invoice.getState());
        invoice.setTax(taxRate.getRate());

        invoice.setSubtotal(invoice.getUnitPrice().multiply(new BigDecimal(invoice.getQuantity()))
                .multiply(invoice.getTax().add(new BigDecimal(1))));

        ProcessingFee processingFee = taxFeeDao.getProcessingFee(invoice.getItemType());
        invoice.setProcessingFee(processingFee.getFee());


        invoice.setTotal(invoice.getSubtotal().add(invoice.getProcessingFee()));

//            if (invoice.getQuantity() <= console.getQuantity())
//                invoiceViewModel.setTotal(invoiceViewModel.getSubtotal().add(invoiceViewModel.getProcessingFee()));
        if (invoice.getQuantity() > 10) {
            invoice.setTotal(invoice.getTotal().add(new BigDecimal("15.49")));
        }
        invoiceDao.addInvoice(invoice);
        return invoiceViewModel;
    }


    private ConsoleViewModel buildConsoleViewModel(Console console) {
        ConsoleViewModel consoleViewModel = new ConsoleViewModel();
        consoleViewModel.setConsoleId(console.getConsoleId());
        consoleViewModel.setModel(console.getModel());
        consoleViewModel.setManufacturer(console.getManufacturer());
        consoleViewModel.setMemoryAmount(console.getMemoryAmount());
        consoleViewModel.setProcessor(console.getProcessor());
        consoleViewModel.setPrice(console.getPrice());
        consoleViewModel.setQuantity(console.getQuantity());

        return consoleViewModel;
    }

    private GameViewModel buildGameViewModel(Game game) {
        GameViewModel gameViewModel = new GameViewModel();
        gameViewModel.setGameId(game.getGameId());
        gameViewModel.setTitle(game.getTitle());
        gameViewModel.setEsrbRating(game.getEsrbRating());
        gameViewModel.setDescription(game.getDescription());
        gameViewModel.setPrice(game.getPrice());
        gameViewModel.setStudio(game.getStudio());
        gameViewModel.setQuantity(game.getQuantity());

        return gameViewModel;
    }

    private TShirtViewModel buildTShirtViewModel(TShirt tShirt) {
        TShirtViewModel tShirtViewModel = new TShirtViewModel();
        tShirtViewModel.settShirtId(tShirt.gettShirtId());
        tShirtViewModel.setSize(tShirt.getSize());
        tShirtViewModel.setColor(tShirt.getColor());
        tShirtViewModel.setDescription(tShirt.getDescription());
        tShirtViewModel.setPrice(tShirt.getPrice());
        tShirtViewModel.setQuantity(tShirt.getQuantity());

        return tShirtViewModel;
    }

    private InvoiceViewModel buildInvoiceViewModel(Invoice invoice) {
        InvoiceViewModel invoiceViewModel = new InvoiceViewModel();
        invoiceViewModel.setInvoiceId(invoice.getInvoiceId());
        invoiceViewModel.setName(invoice.getName());
        invoiceViewModel.setStreet(invoice.getStreet());
        invoiceViewModel.setCity(invoice.getCity());
        invoiceViewModel.setState(invoice.getState());
        invoiceViewModel.setZipcode(invoice.getZipcode());
        invoiceViewModel.setItemType(invoice.getItemType());
        invoiceViewModel.setItemId(invoice.getItemId());
        invoiceViewModel.setQuantity(invoice.getQuantity());
        invoiceViewModel.setUnitPrice(invoice.getUnitPrice());
        invoiceViewModel.setSubtotal(invoice.getSubtotal());
        invoiceViewModel.setTax(invoice.getTax());
        invoiceViewModel.setProcessingFee(invoice.getProcessingFee());
        invoiceViewModel.setTotal(invoice.getTotal());

        return invoiceViewModel;
        }

    }

