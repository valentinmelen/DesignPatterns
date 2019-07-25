package observer;

public class RussianSpammer extends Subject{

    protected String name;
    public RussianSpammer(String name) {
        super(name);
    }

    public void setLatestPost(String latestPost) {
        this.latestPost = latestPost;
    }
}
