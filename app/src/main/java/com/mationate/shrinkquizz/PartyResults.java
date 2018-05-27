package com.mationate.shrinkquizz;

public class PartyResults extends PartyAnswer {


    public PartyResults(String answer) {
        super(answer);
    }

    public String score (){return processing();}

    private String processing() {
        String answer = getAnswer();

        if (answer.contains("5")) {

            return "Eres un niño";
        } else if (answer.contains("10")) {
            return "Bien, dale campeón";

        } else {
            return "Consigue ayuda";

        }
    }

}
