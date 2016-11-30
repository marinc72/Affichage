package affichage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Babujhi, Jonathan
 * 
 * This class allowed to have a Locked Door in a Room. 
 * The Locked door could be open thanks to a key. 
 */


public class LockedDoor extends Door {
    
    private final Key key;
    private final String name;
    private LockedDoor Lock_Door; // Ajout pour extraire le locked door.

     
    
    /**
    * This constructor allowed the creation of a Locked Door
     * @param open
     * @param actual
     * @param next
     * @param doorName
     * @param keyName
     * @param keyPrice
     *
    */   
    
    public LockedDoor(boolean open, Room actual, Room next, String doorName, String keyName, int keyPrice){
        
        super(open,actual,next);
        name = doorName;
        key = new Key (keyName, keyPrice, this);

        
    }

    

    /**
     * @param keyInserted
    * @return a boolean 
    * This method allowed to check if the Key of the player can open a locked door
    *  If key and the door as the same name, the method open the lockedDoor.
    */
    
    public boolean checkKey(Key keyInserted){
        return key==keyInserted;
    }
    
    /**
     *
     * @return
     */
    public Key getKey(){
    
        return key;
    }
    
    public String getName(){
       return name;
    }
    
    
    // modif 25/11
    // Lock_Door;
   
    public LockedDoor getLockedDoor(){
        return Lock_Door;
    }
    

}

