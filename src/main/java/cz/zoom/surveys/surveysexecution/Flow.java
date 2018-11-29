package cz.zoom.surveys.surveysexecution;

/**
 * Created by dmitry on 29.11.18.
 */
public class Flow {
    public enum TYPE {
        EMAIL , SMS
    }
    private String urlToPush;
    private String urlToDelete;

    public String getUrlToPush() {
        return urlToPush;
    }

    public void setUrlToPush(String urlToPush) {
        this.urlToPush = urlToPush;
    }

    public String getUrlToDelete() {
        return urlToDelete;
    }

    public void setUrlToDelete(String urlToDelete) {
        this.urlToDelete = urlToDelete;
    }
}
