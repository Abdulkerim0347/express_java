package practice_6.track_visitors;

import java.util.HashSet;

public class Tracker {
    private HashSet<String> sessions;

    public Tracker() {
        this.sessions = new HashSet<>();
    }

    public void addSession(String session) {
        sessions.add(session);
    }

    public HashSet<String> getSessions() {
        return this.sessions;
    }

    public void printSessions() {
        System.out.println("All unique sessions:");
        sessions.forEach(System.out::println);
    }

}
