package collections;

import java.util.*;

class SocialNetwork {
    private Map<String, List<String>> userConnections;

    public SocialNetwork() {
        userConnections = new HashMap<>();
    }

    public void addUser(String user) {
        userConnections.putIfAbsent(user, new ArrayList<>());
    }

    public void addConnection(String user1, String user2) {
        userConnections.putIfAbsent(user1, new ArrayList<>());
        userConnections.putIfAbsent(user2, new ArrayList<>());

        userConnections.get(user1).add(user2);
        userConnections.get(user2).add(user1);
    }

    public void removeConnection(String user1, String user2) {
        List<String> connections1 = userConnections.get(user1);
        List<String> connections2 = userConnections.get(user2);

        if (connections1 != null) connections1.remove(user2);
        if (connections2 != null) connections2.remove(user1);
    }

    public void displayConnections() {
        for (String user : userConnections.keySet()) {
            System.out.print(user + " is connected to: ");
            for (String friend : userConnections.get(user)) {
                System.out.print(friend + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();

        network.addUser("John");
        network.addUser("Jane");
        network.addUser("Walter");
        network.addUser("Jessy");

        network.addConnection("John","Jane");
        network.addConnection("John","Walter");
        network.addConnection("Jessy","Walter");
        network.addConnection("Jessy","Jane");

        network.displayConnections();
        System.out.println();

        network.removeConnection("Jessy", "Jane");

        network.displayConnections();
    }
}
