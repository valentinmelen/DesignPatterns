package singleton;

public enum OnlineMusicStore2 {
    INSTANCE;

    public void play(){
        System.out.println("Playing in enum");
    }
}
