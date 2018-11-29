package cz.zoom.surveys.surveysexecution;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dmitry on 29.11.18.
 */
@Component
public class SomeModel {
//    @Value("${someName}")
    private String someName;

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }
}
