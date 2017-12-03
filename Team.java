/**
 * Program: NFLDraft
 * File: Team.java
 * Summary: Creates and manages teams.
 * Author: James Ray
 * Date: Nov 18, 2017
 */

import java.util.ArrayList;

public class Team implements HasPlayers {

    //Name of the team
    private final String name;
    //full name of the owner
    private final String owner;
    //ArrayList of the players in the team.
    private ArrayList<NFLPlayer> players = new ArrayList<>();

    //Generate a team
    public Team() {
        name = NameHelper.generateTeamName();
        owner = NameHelper.generateFullName();
    }

    //create a team with predefined data.
    public Team(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    //create a team with predefined data and players.
    public Team(String name, String owner, ArrayList<NFLPlayer> players) {
        this.name = name;
        this.owner = owner;
        this.players = players;
    }

    @Override
    public String toString() {
        return name;
    }

    //return the name of the team.
    public String getName() {
        return name;
    }

    //return all players in the team.
    @Override
    public ArrayList<NFLPlayer> getPlayers() {
        return players;
    }

    //Set all players for the team.
    public void setPlayers(ArrayList<NFLPlayer> players) {
        this.players = players;
    }

    //Add a single player to the team.
    public void addPlayer(NFLPlayer player) {
        if (players.indexOf(player) == -1) {
            player.setTeam(this);
            this.players.add(player);
        }
    }

    //remove a signle player from the team.
    public void removePlayer(NFLPlayer player) {
        if (players.indexOf(player) > -1) {
            players.remove(player);
        }
    }

    public void firePlayer(NFLPlayer player) {
        if (players.indexOf(player) > -1) {
            players.remove(player);
            player.setTeam(null);
        }
    }

    //Get the owner of the team,
    public String getOwner() {
        return owner;
    }

}
