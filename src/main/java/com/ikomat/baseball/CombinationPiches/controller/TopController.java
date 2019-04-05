package com.ikomat.baseball.CombinationPiches.controller;


import com.ikomat.baseball.CombinationPiches.domain.model.MatchDataForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TopController {

    @RequestMapping(value="/",  method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
