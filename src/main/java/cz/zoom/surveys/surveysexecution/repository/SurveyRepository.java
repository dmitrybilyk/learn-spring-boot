package cz.zoom.surveys.surveysexecution.repository;

import cz.zoom.surveys.surveysexecution.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
    List<Survey> findByQuestionId(Long questionId);
}