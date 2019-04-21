package com.ikomat.baseball.CombinationPiches.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="matchinfo")
public class MatchInfo {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "matchinfo_id_seq")
    @SequenceGenerator(
            name = "matchinfo_id_seq",
            sequenceName = "matchinfo_id_seq",
            initialValue = 1,
            allocationSize = 1)
    @Column
    private int matchinfoId;

    @Column(length = 30,nullable = true)
    private String batter;

    @Column(length = 30,nullable = true)
    private String pitcher;

    @OneToMany(mappedBy = "situationId")
    private List<SituationEntity> situationEntityList;

    public int getId(){
        return matchinfoId;
    }

    public void setId(int matchinfoId){
        this.matchinfoId = matchinfoId;
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
