/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerproject;

import java.util.*;

/**
 *
 * @author joese
 */
public class SoccerProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        Team[] teams = new Team[4];

        ArrayList<Game> gameList = new ArrayList<>();
        for (int x = 0; x < teams.length; x++) {
            teams[x] = new Team(" Team " + (x + 1));
        }
        int coldCounter = 0;
        int idCounter = 1;
       
        while (coldCounter < 3) {
            System.out.println("Enter today's temperature:");
            int temp = in.nextInt();
            if (temp > 0) {
                coldCounter = 0;
                ArrayList<Integer> valueList = new ArrayList<>();
                for (int x = 0; x < 4; x++) {
                    valueList.add(x);
                }
                int team1 = valueList.remove(rnd.nextInt(valueList.size()));
                int team2 = valueList.remove(rnd.nextInt(valueList.size()));
                int team3 = valueList.remove(rnd.nextInt(valueList.size()));
                int team4 = valueList.remove(0);
                Game g1 = new Game(teams[team1], teams[team2], temp, idCounter++, rnd);
                teams[team1] = g1.getT1();
                teams[team2] = g1.getT2();
                Game g2 = new Game(teams[team3], teams[team4], temp, idCounter++, rnd);
                gameList.add(g1);
                gameList.add(g2);

             
                System.out.println("Game 1 between " + g1.getT1().getName() + " and " + g1.getT2().getName());
                System.out.println("Game 2  between " + g2.getT1().getName() + " and " + g2.getT2().getName());
               
     
            } else {
                coldCounter++;
                System.out.println("It's too cold outside.");
            }
        }

        System.out.println("You have reached the End of the Season, these are the stats");
        for (Team x : teams) {
            System.out.println(x.getName());
            System.out.println("Goals Scored: " + x.getGoals_scored());
            System.out.println("Goals Alloweded: " + x.getGoals_allowed());
            System.out.println("Win Total: " + x.getWin_total());
            System.out.println("Loss Total: " + x.getLoss_total());
            System.out.println("Tie Total: " + x.getTie_total());

        }
          int hottest=0;
          int average=0;
        for (Game x : gameList) {
            System.out.println(x.getId());
            System.out.println(x.getTemp());
            average+=x.getTemp();
            if (hottest<x.getTemp()){
                hottest=x.getTemp();
                    
            }
        }
        average=average/gameList.size();
        System.out.printf("The hottest temp was %d and the average temp was %d", hottest,average);
    }
}
