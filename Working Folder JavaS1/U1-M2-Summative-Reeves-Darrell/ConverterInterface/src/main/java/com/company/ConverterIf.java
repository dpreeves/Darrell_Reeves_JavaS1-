package com.company;

import com.company.interfaces.Converter;

public class ConverterIf implements Converter {
    public String convertMonth(int monthNumber) {



            if (monthNumber == 1){
                return "January";
            }
            if (monthNumber == 2){
                return "February";
            }
            if (monthNumber == 3){
                return "March";
            }
            if (monthNumber == 4){
                return "April";
            }
            if (monthNumber == 5){
                return "May";
            }
            if (monthNumber == 6){
                return "June";
            }
            if (monthNumber == 7){
                return "July";
            }
            if (monthNumber == 8){
                return "August";
            }
            if (monthNumber == 9){
                return "September";
            }
            if (monthNumber == 10){
                return "October";
            }
            if (monthNumber == 11){
                return "November";
            }
            if (monthNumber == 12){
                return "December";
            } else return "Error: You have entered an invalid number.";




    }

    public String convertDay(int dayNumber) {

        if (dayNumber == 1){
            return "Sunday";
        }
        if (dayNumber == 2){
            return "Monday";
        }
        if (dayNumber == 3){
            return "Tuesday";
        }
        if (dayNumber == 4){
            return "Wednesday";
        }
        if (dayNumber == 5){
            return "Thursday";
        }
        if (dayNumber == 6){
            return "Friday";
        }
        if (dayNumber == 7){
            return "Saturday";
        } else return "Error: You entered an invalid choice";
    }
}
