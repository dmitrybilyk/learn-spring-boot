package cz.zoom.surveys.surveysexecution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 29.11.18.
 */
@Component
@ConfigurationProperties(prefix="some")
public class FlowsConfiguration {
    @Value("${some-value}")
    private String someValue;

    private List<String> flows = new ArrayList<>();

    public List<String> getFlows() {
        return flows;
    }

    public String getSomeValue() {
        return someValue;
    }
}
