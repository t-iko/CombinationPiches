package com.ikomat.baseball.CombinationPiches.controller;

import com.ikomat.baseball.CombinationPiches.domain.model.MatchInfo;
import com.ikomat.baseball.CombinationPiches.domain.model.SituationEntity;
import com.ikomat.baseball.CombinationPiches.domain.repositories.Dao;
import com.ikomat.baseball.CombinationPiches.domain.repositories.DaoSituationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.transaction.Transactional;
import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private Dao dao;

    @Autowired
    private DaoSituationEntity daoSituationEntity;


    @RequestMapping(value="/register/match-data", method = RequestMethod.GET)
    public String getMatchData(@ModelAttribute MatchInfo matchInfo, Model model_mat, @ModelAttribute SituationEntity situationEntity, Model model_sit){
        return "register/match-data";
    }

    @RequestMapping(value="/register/pitch-data", method = RequestMethod.POST)
    public String postPitchData(@ModelAttribute MatchInfo matchInfo, Model model_mat, @ModelAttribute SituationEntity situationEntity, Model model_sit){
        situationEntity.setMatchInfoFK(matchInfo);
        dao.saveAndFlush(matchInfo);
        daoSituationEntity.saveAndFlush(situationEntity);
        return "register/pitch-data";
    }

    //
    //@RequestMapping(value="/register/pitch-data", method = RequestMethod.POST)
    //@Transactional
    //public String postPitchData(@ModelAttribute MatchInfo matchInfo, Model model_mat, @ModelAttribute SituationEntity situationEntity, Model model_sit){
    //    dao.saveAndFlush(matchInfo);
    //    return "register/pitch-data";
    //}

    //@RequestMapping(value="/test_connectdb", method = RequestMethod.GET)
    //@Transactional
    //public String testConnectDb(Model model){
    //    List<MatchInfo> matchlist= dao.findAll();
    //    model.addAttribute("matchlist",matchlist);
    //    return "test_connectdb";
    //}
}
