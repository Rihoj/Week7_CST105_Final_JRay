/**
 * Program: NFLDraft
 * File: HasPlayers.java
 * Summary: Tells the class that it must support getting players.
 * Author: James Ray
 * Date: Dec 2, 2017
 */


import java.util.ArrayList;

public interface HasPlayers {

    /**
     * Tells the implementing class that it must support getting players through the
     * getPlayer method.
     *
     * @return ArrayList<NFLPlayer>
     */
    abstract ArrayList<NFLPlayer> getPlayers();
}
