import greenfoot.*;
import java.util.HashMap;

public class HighScoreScreen extends World {
    private HashMap<String, Integer> highScores;

    public HighScoreScreen() {    
        super(600, 400, 1);
        highScores = new HashMap<>();
        highScores.put("Player1", 100);
        highScores.put("Player2", 200);
        highScores.put("Player3", 150);

        displayScores();
    }

    private void displayScores() {
        int y = 100;
        for (String name : highScores.keySet()) {
            int score = highScores.get(name);
            Label scoreLabel = new Label(name + ": " + score, 24);
            addObject(scoreLabel, 300, y);
            y += 50;
        }
    }
}