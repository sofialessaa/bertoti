public static void main(String[] args) {
    CinemaSessionManager manager = CinemaSessionManager.getInstance();

    manager.addSession("Ainda Estou Aqui - 19:00");
    manager.addSession("Todo Tempo Que Temos - 21:30");
    manager.addSession("A Forja - 16:00");

    manager.listSessions();
}
