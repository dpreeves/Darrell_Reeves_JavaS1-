package com.company.U1M4SummativeReevesDarrell.model;

public class Answer {
    private String answer;
    private String question;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer(String answer, String question) {
        this.answer = answer;
        this.question = question;
    }
}
