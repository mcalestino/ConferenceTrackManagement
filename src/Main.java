

import java.net.URISyntaxException;
import java.io.IOException;
/**
 * Maria Calestino
 * June 16, 2021
 */

/**
 * Main Class
 *
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException, URISyntaxException, InstantiationException {
        InputParser input = new InputParser("/resources/input.txt");
        ConferenceManager conferenceManager = new ConferenceManager();
        Conference conference = conferenceManager.scheduleTalks(input.talks());
        System.out.println(conference);
    }
}
