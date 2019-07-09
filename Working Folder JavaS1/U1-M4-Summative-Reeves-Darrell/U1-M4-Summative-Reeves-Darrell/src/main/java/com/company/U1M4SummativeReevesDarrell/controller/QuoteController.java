package com.company.U1M4SummativeReevesDarrell.controller;

import com.company.U1M4SummativeReevesDarrell.model.Quote;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteController {

    List<Quote> quoteList = new ArrayList<>();

    Quote quote1 = new Quote("Og Mandino", "Failure will never overtake me if my determination to succeed is strong enough.");
    Quote quote2 = new Quote("Carol Burnett", "Only I can change my life. No one can do it for me.");
    Quote quote3 = new Quote("Dr. Seuss", "Don't cry because it's over, smile because it happened.");
    Quote quote4 = new Quote("Oscar Wilde", "Be yourself; everyone else is already taken.");
    Quote quote5 = new Quote("Frank Zappa", "So many books, so little time.");
    Quote quote6 = new Quote("Marcus Tullius Cicero", "A room without books is like a body without a soul.");
    Quote quote7 = new Quote("Mae West", "You only live once, but if you do it right, once is enough.");
    Quote quote8 = new Quote("Mahatma Gandhi", "Be the change that you wish to see in the world.");
    Quote quote9 = new Quote("Mark Twain", "If you tell the truth, you don't have to remember anything.");
    Quote quote10 = new Quote("Eleanor Roosevelt", "No one can make you feel inferior without your consent.");

    Random rand = new Random();

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quote getQuote(){
        quoteList.add(quote1);
        quoteList.add(quote2);
        quoteList.add(quote3);
        quoteList.add(quote4);
        quoteList.add(quote5);
        quoteList.add(quote6);
        quoteList.add(quote7);
        quoteList.add(quote8);
        quoteList.add(quote9);
        quoteList.add(quote10);

        int quote = rand.nextInt(quoteList.size());

        return quoteList.get(quote);
    }

}
