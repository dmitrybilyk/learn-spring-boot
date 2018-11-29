package cz.zoom.surveys.surveysexecution;

import cz.zoom.surveys.surveysexecution.model.Survey;
import cz.zoom.surveys.surveysexecution.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@EnableConfigurationProperties
@SpringBootApplication
//		(scanBasePackages={
//		"cz.zoom.surveys.surveysexecution.repository", "cz.zoom.surveys.surveysexecution.rest"})
@ConfigurationProperties(value = "application.yml")
@RestController
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SurveysExecutionApplication {


	@RequestMapping("/someModel")
	public SomeModel getSomeModel() {
		SomeModel someModel = new SomeModel();
		someModel.setSomeName("some name set");
		return someModel;
	}

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "Welcome home");
		return "welcome";
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SurveysExecutionApplication.class, args);
		SomeModel someModel = context.getBean(SomeModel.class);
		System.out.println(someModel.getSomeName());
		FlowsConfiguration configuration = context.getBean(FlowsConfiguration.class);
		System.out.println(configuration.getSomeValue());
		System.out.println(configuration.getFlows());
		RestTemplate restTemplate = new RestTemplate();
//		Conversation conversation = restTemplate.getForObject("http://localhost:8080/restClient/conversations/get",
//				Conversation.class);
//		System.out.println(conversation.getConversationId());
//		SurveyRepository surveyRepository = context.getBean(SurveyRepository.class);
//		Survey survey = new Survey();
//		survey.setName("survey 1");
//		survey.setSurveyId("some id");
//		surveyRepository.save(survey);
	}

}
