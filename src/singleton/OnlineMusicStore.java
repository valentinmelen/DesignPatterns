package singleton;

public class OnlineMusicStore {
    private static OnlineMusicStore INSTANCE = null;//am pus static pt ca nu am putea sa-l apelam din metoda statica

    private OnlineMusicStore() {
        System.out.println("In Online music store constructor");
    }

    public static OnlineMusicStore getInstance() {
        // daca e prima data cand apelam, creaza obiectul cu new
        //si returneaza-l
        //altfel, returneaza obiectul creat initial cu new, fara sa mai apelezi o data
        if (INSTANCE == null) {
            synchronized (OnlineMusicStore.class) {
                if (INSTANCE == null) {
                    INSTANCE = new OnlineMusicStore();//il instantiem. Se creaza instanta
                }
            }
        }
        return INSTANCE;
    }

    public void play() {
        System.out.println("Play");
    }
}
