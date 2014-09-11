package com.example.admin.crystalball;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Admin on 7/07/2014.
 */
public class CrystalBall {
    public String[] mAnswers = {
            "It is certain",
            "It is decidedly so",
            "All signs say YES",
            "The stars are not aligned",
            "My reply is no",
            "It is doubtful",
            "Better not to tell you now",
            "Concentrate and ask again",
            "Unable to answer now"
    };

    public String getAnAnswer() {
        //The button was clicked, so update the answer label with an answer
        String answer = "";

        //Randomly select an answer
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mAnswers.length);

        answer = mAnswers[randomNumber];

        return answer;
    }

    public int getColorCodeAnswer(String answer) {
        int colorCode;
        if (answer.equals(mAnswers[0])
                || answer.equals(mAnswers[1])
                || answer.equals(mAnswers[2])) {
            colorCode = Color.GREEN;
        } else if (answer.equals(mAnswers[3])
                || answer.equals(mAnswers[4])
                || answer.equals(mAnswers[5])) {
            colorCode = Color.RED;
        } else {
            colorCode = Color.MAGENTA;
        }
        return colorCode;
    }
}
