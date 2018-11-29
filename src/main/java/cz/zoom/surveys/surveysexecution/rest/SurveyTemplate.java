package cz.zoom.surveys.surveysexecution.rest;

import cz.zoom.surveys.surveysexecution.model.Survey;
import cz.zoom.surveys.surveysexecution.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dmitry on 29.11.18.
 */
@RestController
@RequestMapping("/surveys")
public class SurveyTemplate {
//    @Autowired(required = true)
//    private SurveyRepository repository;
//
//    @RequestMapping("/add")
//    public void addSurvey() {
//        Survey survey = new Survey();
//        survey.setSurveyId("id");
//        survey.setName("name of survey");
//        repository.save(survey);
//    }
}
