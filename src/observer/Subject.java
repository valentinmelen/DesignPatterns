package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    protected String name;
    protected List<Observator> observerList;
    protected String latestPost = null;

    public Subject(String name) {
        this.name = name;
        observerList = new ArrayList<>();

    }

    public void postNewEvent(String text) {
        latestPost = text;
        updateFollowers();
    }

    public void updateFollowers() {
        for (Observator observator : observerList) {
            observator.update();
        }
    }

    public void addFollower(Observator observator) {
        observerList.add(observator);

    }

    public void removeFollower(Observator observator) {
        observerList.remove(observator);
    }

    public String getName() {
        return name;
    }

    public String getLatestPost() {
        return latestPost;
    }
}
