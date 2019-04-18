package com.ikomat.baseball.CombinationPiches.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="situation")
public class SituationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "situation_id")
    private int situationId;

    @Column
    private int outcount;

    @Column(nullable = true)
    private boolean firstbase;

    @Column(nullable = true)
    private boolean secondbase;

    @Column(nullable = true)
    private boolean thirdbase;

    @Column
    private int myscore;

    @Column
    private int opponetscore;

    @Column
    private String inning;

    @ManyToOne
    @JoinColumn(name = "matchinfo_fk", referencedColumnName = "matchinfoId")
    private MatchInfo matchInfoFK;

    public int getId() {
        return situationId;
    }

    public int getOutcount() {
        return outcount;
    }

    public boolean isFirstbase() {
        return firstbase;
    }

    public boolean isSecondbase() {
        return secondbase;
    }

    public boolean isThirdbase() {
        return thirdbase;
    }

    public int getMyscore() {
        return myscore;
    }

    public int getOpponetscore() {
        return opponetscore;
    }

    public String getInning() {
        return inning;
    }

    public MatchInfo getMatchInfoFK() {
        return matchInfoFK;
    }

    public void setId(int situationId) {
        this.situationId = situationId;
    }

    public void setOutcount(int outcount) {
        this.outcount = outcount;
    }

    public void setFirstbase(boolean firstbase) {
        this.firstbase = firstbase;
    }

    public void setSecondbase(boolean secondbase) {
        this.secondbase = secondbase;
    }

    public void setThirdbase(boolean thirdbase) {
        this.thirdbase = thirdbase;
    }

    public void setMyscore(int myscore) {
        this.myscore = myscore;
    }

    public void setOpponetscore(int opponetscore) {
        this.opponetscore = opponetscore;
    }

    public void setInning(String inning) {
        this.inning = inning;
    }

    public void setMatchInfoFK(MatchInfo matchInfoFK) {
        this.matchInfoFK = matchInfoFK;
    }
}
