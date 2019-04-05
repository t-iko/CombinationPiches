package com.ikomat.baseball.CombinationPiches.domain.model;

import javax.persistence.*;

@Entity
@Table(name="matchinfo")
public class MatchInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column(length = 30,nullable = true)
    private String batter;

    @Column(length = 30,nullable = true)
    private String pitcher;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getBatter(){
        return batter;
    }

    public void setBatter(String batter){
        this.batter = batter;
    }


    public String getPitcher(){
        return pitcher;
    }

    public void setPitcher(String pitcher){
        this.pitcher = pitcher;
    }
}
