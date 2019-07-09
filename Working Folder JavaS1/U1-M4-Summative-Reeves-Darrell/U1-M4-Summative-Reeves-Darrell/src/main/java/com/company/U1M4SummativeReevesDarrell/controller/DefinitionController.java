package com.company.U1M4SummativeReevesDarrell.controller;

import com.company.U1M4SummativeReevesDarrell.model.Definition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DefinitionController {

    private List<Definition> definitionList = new ArrayList<>();

    Definition definition1 = new Definition("nonplussed", "filled with bewilderment");
    Definition definition2 = new Definition("inchoate", "only partly in existence; imperfectly formed");
    Definition definition3 = new Definition("cachet", "an indication of approved or superior status");
    Definition definition4 = new Definition("panache", "distinctive and stylish elegance");
    Definition definition5 = new Definition("indefatigable", "showing sustained enthusiastic action with unflagging vitality");
    Definition definition6 = new Definition("uncanny", "surpassing the ordinary or normal");
    Definition definition7 = new Definition("unabashed", "not embarrassed");
    Definition definition8 = new Definition("dilatory", "wasting time");
    Definition definition9 = new Definition("martinet", "someone who demands exact conformity to rules and forms");
    Definition definition10 = new Definition("hoi polloi", "the common people generally");

    Random rand = new Random();

    @RequestMapping(value = "/definition", method = RequestMethod.GET)
    public Definition getDefinition(){
        definitionList.add(definition1);
        definitionList.add(definition2);
        definitionList.add(definition3);
        definitionList.add(definition4);
        definitionList.add(definition5);
        definitionList.add(definition6);
        definitionList.add(definition7);
        definitionList.add(definition8);
        definitionList.add(definition9);
        definitionList.add(definition10);

        int definition = rand.nextInt(definitionList.size());

        return definitionList.get(definition);
    }

}
