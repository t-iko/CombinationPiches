package com.ikomat.baseball.CombinationPiches.domain.model;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany
    private List<SituationEntity> situationEntityList;

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

    public List<SituationEntity> getSituationEntityList() {
        return situationEntityList;
    }

    public void setSituationEntityList(List<SituationEntity> situationEntityList) {
        this.situationEntityList = situationEntityList;
    }

}
