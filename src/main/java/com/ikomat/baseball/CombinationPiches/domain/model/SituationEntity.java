package com.ikomat.baseball.CombinationPiches.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="situation")
public class SituationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

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

    @ManyToOne
    private MatchInfo matchInfo;

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
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

    public MatchInfo getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(MatchInfo matchInfo) {
        this.matchInfo = matchInfo;
    }
}
