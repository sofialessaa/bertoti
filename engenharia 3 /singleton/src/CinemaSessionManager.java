public class CinemaSessionManager {
    private static CinemaSessionManager instance;

    private List<String> sessions;

    private CinemaSessionManager() {
        sessions = new ArrayList<>();
    }

    public static CinemaSessionManager getInstance() {
        if (instance == null) {
            instance = new CinemaSessionManager();
        }
        return instance;
    }

    public void addSession(String session) {
        sessions.add(session);
    }

    public void listSessions() {
        System.out.println("Sessões disponíveis:");
        for (String session : sessions) {
            System.out.println("- " + session);
        }
    }
}
