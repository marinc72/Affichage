package affichage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan, Babujhi
 */


public class MagicDoor extends Door { 
    
    private String pwd; 
    private String pwd_user;
    private String name;
    private boolean lock;
    
    



/* The constructor allowed the creation of a MagicDoor
 * The magic door is closed and can only be open thanks to a code.
*/

    /**
     *
     * @param n
     * @param p
     * @param lock
     * @param Actual
     * @param Next
     */

    public MagicDoor(String n, String p, Boolean lock, Room Actual, Room Next )
{
            
        super(lock, Actual, Next);
        pwd = p;
        name = n; 
}

    /*
    The method resolve allowed the user to enter a string and compare the pwd
    with the code of the Magic door.
    */
    
    /**
     * @param pwd_user
     * @return boolean
     */
    
    public boolean resolve (String pwd_user) {
     
        if (pwd_user.equals(pwd))
        {
        return true;
        }
        else
        {
        return false;
        }
    }
    
    
    public String getMagicDoor() {
    
        return pwd;
    }
    
    
    // babujhi modif 25/11
    public boolean getlockdoor( MagicDoor m){
        return lock;
    }
}