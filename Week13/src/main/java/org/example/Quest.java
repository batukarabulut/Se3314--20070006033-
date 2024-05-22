package org.example;

import java.util.ArrayList;

public class Quest {
    // Encapsulation: Fields are made private to prevent direct access.
    private String questName;
    private Character leader;
    private ArrayList<Character> participants;
    private MiddleEarthMap map;

    public Quest(String questName, Character leader, MiddleEarthMap map) {
        // Bug Fix: Correctly assign values to instance variables, not to themselves.
        this.questName = questName;
        this.leader = leader;
        this.map = map;
        this.participants = new ArrayList<>();
    }

    // Accessor Methods: Allow controlled access to instance data.
    public String getQuestName() {
        return questName;
    }

    public Character getLeader() {
        return leader;
    }

    public ArrayList<Character> getParticipants() {
        return new ArrayList<>(participants); // Return a copy to prevent external modifications.
    }

    public MiddleEarthMap getMap() {
        return map;
    }

    // Add a participant to the quest.
    public void addParticipant(Character character) {
        participants.add(character);
    }

    // Start the quest, displaying details about the quest.
    public void start() {
        System.out.println("Starting quest: " + questName);
        System.out.println("Leader: " + leader.getName()); // Assuming Character has a getName method.
        System.out.println("Participants:");
        for (Character participant : participants) {
            System.out.println(participant.getName() + ", age: " + participant.getAge()); // Adjusted to show proper attributes.
        }
        System.out.println("Map locations:");
        for (String location : map.getLocations()) { // Use getter to access map locations.
            System.out.println(location);
        }
    }
}