package collections;

import java.util.HashMap;
import java.util.Map;

public class WebsiteTracker {
    Map<String, Integer> tracker;

    public WebsiteTracker() {
        tracker = new HashMap<>();
    }

    public void visitPage(String page) {
        tracker.put(page, tracker.getOrDefault(page,0) + 1);
    }

    public void display() {
        for (Map.Entry<String, Integer> entry : tracker.entrySet()) {
            System.out.println("Page: " + entry.getKey() + " | number of visits: " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        WebsiteTracker tracker = new WebsiteTracker();

        tracker.visitPage("home");
        tracker.visitPage("home");
        tracker.visitPage("home");
        tracker.visitPage("home");
        tracker.visitPage("home");
        tracker.visitPage("about");
        tracker.visitPage("home");
        tracker.visitPage("about");
        tracker.visitPage("contact");

        tracker.display();
    }

}
