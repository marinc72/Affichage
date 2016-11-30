package affichage;

import java.util.*;

/**
 * This class allows to handle Room. Each Room has a name,a set of character, 
 * there is possibility that the room has chests in it. Each room has one or 
 * several exits in it. Finally it is possible to set a room as clear or not.
 * @author Jonathan, Babujhi
 */
public class Room {
    private boolean clear;
    private Set<NPC> characterRoom; //pas deux fois le meme
    private Set<Chest> chestRoom; // pas deux fois le meme
    private String nameRoom;
    private HashMap <String, Door> exit; //pas deux fois la meme porte


    /**
     * Constructor of a Room, the HashMap and the ArrayList are empty when the 
     * class is created.
     * @param name if there is no name, it automatically set to "Room"
     * @param empty set the boolean clear in the constructor
     */
    public Room(String name, boolean empty){
        clear = empty;
        nameRoom = name;
        exit = new HashMap <>();
        characterRoom = new HashSet<NPC>();
        chestRoom = new HashSet<Chest>();
    }

    /**
     * Get if the room is clear (true : clear, false : not clear)
     * @return a boolean depending if the room is clear or not
     */
    public boolean isClear(){
        return clear;
    }

    /**
     * Get the name of the Room
     * @return a String, the name of the Room
     */
    public String getNameRoom(){
        return nameRoom;
    }

    /**
     * Allows to modify the parameter clear, which is a boolean. If the boolean is 
     * true it becomes false and vice versa.
     */
    public void setClear(){
        clear = !clear;
    }

    /**
     * Create a new exit and put it in the exit Hashmap. If the name is empty, it is 
     * set to "North".
     * @param s the direction of the exit
     * @param d a Door between two Rooms (knows actual and next room)
     */
    public void setExit(String s, Door d){
        boolean bool = true;
        for (HashMap.Entry<String, Door> entry : exit.entrySet()) {
            String st = entry.getKey();
            if (exit.get(st)==d) {
                bool = false;
            }
        }
        if (bool) {
            exit.put(s,d);
        }
    }
    
    /**
     * Add a NPC in the ArrayList characterRoom
     * @param n a NPC who is in the room
     */
    public void addNPC (NPC n) {
        characterRoom.add(n);
    } 
    
    /**
     * Add a Chest in the ArrayList chestRoom
     * @param c a Chest which is in the Room
     */
    public void addChest (Chest c) {
        chestRoom.add(c);
    }
    
    /**
     * Get the whole HashMap
     * @return the HashMap containing the exits
     */
    public HashMap getHashMap() {
        return exit;
    }
    
    /**
     * Get the set of character who are present in the room
     * @return a set containing all the character in the room
     */
    public Set getCharcterRoom() {
        return characterRoom;
    }
    
    /**
     * Get the set of chest which are in the room
     * @return a set containing all he chest in the room
     */
    public Set getChestRoom() {
        return chestRoom;
    }
}