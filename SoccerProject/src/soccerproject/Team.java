/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerproject;

/**
 *
 * @author joese
 */
public class Team {
    private String name;
    private int win_total;
    private int loss_total;
    private int tie_total;
    private int goals_scored;
    private int goals_allowed;
    
    public Team (String n){
        this.name=n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin_total() {
        return win_total;
    }

    public void setWin_total(int win_total) {
        this.win_total = win_total;
    }

    public int getLoss_total() {
        return loss_total;
    }

    public void setLoss_total(int loss_total) {
        this.loss_total = loss_total;
    }

    public int getTie_total() {
        return tie_total;
    }

    public void setTie_total(int tie_total) {
        this.tie_total = tie_total;
    }

    public int getGoals_scored() {
        return goals_scored;
    }

    public void setGoals_scored(int goals_scored) {
        this.goals_scored = goals_scored;
    }

    public int getGoals_allowed() {
        return goals_allowed;
    }

    public void setGoals_allowed(int goals_allowed) {
        this.goals_allowed = goals_allowed;
    }
    
   
}
