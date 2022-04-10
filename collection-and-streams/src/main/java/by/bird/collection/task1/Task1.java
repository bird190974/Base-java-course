package by.bird.collection.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        List<String> competitors = new ArrayList<>();
        competitors.add("Ivan 5");
        competitors.add("Petr 3");
        competitors.add("Alex 10");
        competitors.add("Petr 8");
        competitors.add("Ivan 6");
        competitors.add("Alex 5");
        competitors.add("Ivan 1");
        competitors.add("Petr 5");
        competitors.add("Alex 1");

        showWinner(competitors);
    }

    public static void showWinner(List<String> competitors) {
        Map<String, Integer> resultMap = new HashMap<>();
        String winnerName = "";
        int winnerScore = 0;
        for (String competitor : competitors) {
            String[] score = competitor.split(" ");
            String currentName = score[0];
            Integer currentScore = Integer.parseInt(score[1]);
            resultMap.merge(currentName, currentScore, Integer::sum);
            if (resultMap.get(currentName) > winnerScore) {
                winnerName = currentName;
                winnerScore = resultMap.get(currentName);
            }
        }
        System.out.println(winnerName);

    }
}


