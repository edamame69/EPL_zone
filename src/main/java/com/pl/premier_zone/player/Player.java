package com.pl.premier_zone.player;
import jakarta.persistence.*;

@Entity
@Table(name = "player_statistic")
public class Player {

    @Id
    @Column(name = "player_name")
    private String name;

    @Column(name = "nation")
    private String nation;

    @Column(name = "position")
    private String position;

    @Column(name = "age")
    private Integer age;

    @Column(name = "matches_played")
    private Integer matchesPlayed;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "minutes_play")
    private Double minutesPlayed;

    @Column(name = "goals")
    private Double goals;

    @Column(name = "assists")
    private Double assist;

    @Column(name = "pen_scored")
    private Double pen;

    @Column(name = "yellow_cards")
    private Double yellow;

    @Column(name = "red_cards")
    private Double red;

    @Column(name = "expected_goals")
    private Double xG;

    @Column(name = "expected_assists")
    private Double xA;

    @Column(name = "team_name")
    private String teamName;

    public Player() {}

    public Player(String name, String nation, String position,
                  Integer age, Integer matchesPlayed, Integer starts,
                  Double minutesPlayed, Double goals, Double assist,
                  Double pen, Double yellow, Double red, Double xG, Double xA, String teamName) {
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.starts = starts;
        this.minutesPlayed = minutesPlayed;
        this.goals = goals;
        this.assist = assist;
        this.pen = pen;
        this.yellow = yellow;
        this.red = red;
        this.xG = xG;
        this.xA = xA;
        this.teamName = teamName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Double minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssist() {
        return assist;
    }

    public void setAssist(Double assist) {
        this.assist = assist;
    }

    public Double getPen() {
        return pen;
    }

    public void setPen(Double pen) {
        this.pen = pen;
    }

    public Double getYellow() {
        return yellow;
    }

    public void setYellow(Double yellow) {
        this.yellow = yellow;
    }

    public Double getRed() {
        return red;
    }

    public void setRed(Double red) {
        this.red = red;
    }

    public Double getxG() {
        return xG;
    }

    public void setxG(Double xG) {
        this.xG = xG;
    }

    public Double getxA() {
        return xA;
    }

    public void setxA(Double xA) {
        this.xA = xA;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", matchesPlayed=" + matchesPlayed +
                ", starts=" + starts +
                ", minutesPlayed=" + minutesPlayed +
                ", goals=" + goals +
                ", assist=" + assist +
                ", pen_scored=" + pen +
                ", yellow_cards=" + yellow +
                ", red_cards=" + red +
                ", xG=" + xG +
                ", xA=" + xA +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
