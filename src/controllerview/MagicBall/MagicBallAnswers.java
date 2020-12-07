package controllerview.MagicBall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MagicBallAnswers {
    ArrayList<String> goodAnswers = new ArrayList<String>(Arrays.asList("It is certain.", "It is decidedly so.", "Without a doubt.", "Yes – definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes." ));
    ArrayList<String> neutralAnswers = new ArrayList<String>(Arrays.asList("Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again."));
    ArrayList<String> badAnswers = new ArrayList<String>(Arrays.asList("Don’t count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."));

    public int randomNumber(){
        Random rd = new Random();
        int rdRoll = rd.nextInt(20);
        return rdRoll;
    }

    public int randomGoodNumber(){
        Random rd = new Random();
        int rdRoll = rd.nextInt(10);
        return rdRoll;
    }
}
