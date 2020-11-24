package json;

import java.util.HashMap;

public class User {
    private String title;
    private String startDate;
    private String endDate;
    private String description;
    private HashMap<String, String> affiliation;
    private String[] keywords;
    private String[] invites;
    private String inviteMessage;
    private String project;

    public User(String title, String startDate, String endDate, String description, HashMap<String, String> affiliation, String[] keywords, String[] invites, String inviteMessage, String project) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.affiliation = affiliation;
        this.keywords = keywords;
        this.invites = invites;
        this.inviteMessage = inviteMessage;
        this.project = project;
    }
}