package practice_6.track_visitors;

public class Main {
    public static void main(String[] args) {
        Tracker session = new Tracker();

        session.addSession("1234");
        session.addSession("1234");
        session.addSession("1290");
        session.addSession("1290");
        session.addSession("4567");
        session.addSession("4567");
        session.addSession("4567");
        session.addSession("4567");
        session.addSession("4567");


        session.printSessions();
    }
}
