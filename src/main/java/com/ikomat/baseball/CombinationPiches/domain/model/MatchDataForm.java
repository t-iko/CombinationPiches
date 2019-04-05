package com.ikomat.baseball.CombinationPiches.domain.model;

import lombok.Data;

import java.util.Date;


//@Data
public class MatchDataForm {
    private Date date;
    private String batter;
    private String pitcher;

    public Date getDate(){
        return this.date;
    }

    public String getBatter(){
        return this.batter;
    }

    public String getPitcher(){
        return this.pitcher;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public void setBatter(String batter){
        this.batter = batter;
    }

    public void setPitcher(String pitcher){
        this.pitcher = pitcher;
    }
}
