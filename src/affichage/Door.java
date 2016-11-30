package affichage;


/**
 * This class allows to handle doors. Doors are the object between rooms so doors
 * knows the actual room and the room behind them. A door can be locked (physically
 * or magically). Actual room can be the same as next Room.
 * 
 * @author Jonathan, Babujhi
 */
public class Door {
    private boolean locked;
    private Room actualRoom, nextRoom;
    
    /**
     * Constructor of a Door
     * @param l a boolean to set the door to locked or not
     * @param actual the room in which the door is
     * @param next the room behind the door
     */
    public Door(boolean l, Room actual, Room next){     
        locked = l;
        actualRoom = actual;
        nextRoom = next;
    }
    
    /**
     * get the boolean locked (true : the door is locked, false : it is not)
     * @return the boolean locked
     */
    public boolean isLocked()
    {  
        return locked;
    }

    /**
     * Set the boolean locked to true or false, if it true it becomes false
     * and vice versa
     */
    public void setLocked(){    
        locked = !locked;
    }

    /**
     * Get which Room is behind the door
     * @return the next Room
     */
    public Room getNextRoom(){
        return nextRoom; 
    }

    /**
     * Get in which room the door is.
     * @return the actual room
     */
    public Room getActualRoom(){  
        return actualRoom;
    }
    
        
    public void replaceRoom(){
        actualRoom = nextRoom;
    }
    
}
