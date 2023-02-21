package story_maker;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adjective, season;
        int cupsTea;

        System.out.println("Pick an adjective");
        adjective = scanner.next();
        System.out.println("Pick a season");
        season = scanner.next();
        System.out.println("Pick a number");
        cupsTea = scanner.nextInt();

        scanner.close();

        String story = String.format("On a %s %s day, I drink a minimum of %s cups of tea.", adjective, season, cupsTea);
        System.out.println(story);
    }
}
