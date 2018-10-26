package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String names[] = {"George", "Grace", "Felipe", "Todd", "Marie", "Bob", "Juan", "Anthony", "Jae", "Ethan"
                , "Eva", "Jeremy", "Nate", "Tyler", "Jason", "Dan", "Eden", "Fairuz", "Evan", "Katie"
                , "Abdel", "Mike", "Peter", "Victor", "Greg", "Jake", "John", "Jen", "Drake", "Josh"
                , "Meghan", "Anna", "Nick", "Ashley", "Jackson", "Craig", "Tupac", "Andy", "Andrew", "Drew"
                , "Rob", "Ariana", "William", "Cameron", "Jesse", "Alyssa", "Carly", "Sam", "Freddie", "Charlie"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
        System.out.println("Pick a name from the list");
        Scanner kbReader = new Scanner(System.in);
        String response = kbReader.nextLine();
        System.out.println("Is your person " + names[new Random().nextInt(names.length)] + "?");
        String response2 = kbReader.nextLine();
        for (int j = 0; j < 1; j++) {
            if (response2.equals("no")) {
                System.out.println("Is your person " + names[new Random().nextInt(names.length)] + "?");
                String response3 = kbReader.nextLine();
            }
        }
    }
}
