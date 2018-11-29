package cz.zoom.surveys.surveysexecution.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dmitry on 29.11.18.
 */
@Entity
@Table(name = "surveys")
public class Survey {
    @Id
    @Column
    private String surveyId;
    @Column
    private String name;

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Survey() {
    }
}
