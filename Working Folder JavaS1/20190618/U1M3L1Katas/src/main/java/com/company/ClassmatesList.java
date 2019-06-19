package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClassmatesList {
    ArrayList<Classmate> classmates = new ArrayList<>();
    private ArrayList<Classmate> classmate;

    public ArrayList<Classmate> getClassmate() {
        return classmates;
    }

    public void add(Classmate classmate){
        classmates.add(classmate);
    }

    public Classmate get(int n){
        return classmates.get(n);
    }

    public ArrayList<Classmate> getAll(){
        return classmates;
    }

}
