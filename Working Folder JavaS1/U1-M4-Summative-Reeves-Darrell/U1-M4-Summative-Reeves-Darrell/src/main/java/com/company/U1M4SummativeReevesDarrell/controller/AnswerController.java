package com.company.U1M4SummativeReevesDarrell.controller;

import com.company.U1M4SummativeReevesDarrell.model.Answer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {

    List<String> answerList = new ArrayList<>();

    String answer1 = "it is certain";
    String answer2 = "it is not looking good";
    String answer3 = "things are hazy";
    String answer4 = "Signs point to yes";
    String answer5 = "Outlook poor";
    String answer6 = "Outcome unknown";
    String answer7 = "Without a doubt";
    String answer8 = "It is decidedly so";

    Random rand = new Random();

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    public Answer getAnswer(@RequestBody Answer answer){
        answerList.add(answer1);
        answerList.add(answer2);
        answerList.add(answer3);
        answerList.add(answer4);
        answerList.add(answer5);
        answerList.add(answer6);
        answerList.add(answer7);
        answerList.add(answer8);

        int response = rand.nextInt(answerList.size());

        answer.setAnswer(answerList.get(response));

        return answer;
    }
}
