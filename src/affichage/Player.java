/*
 * This class that inherite from the character class represent the character that will be playable
 * @version 22/11/16
 */
package affichage;

/**
 * @author Marin
 */
public class Player extends Character
{
    private int karmaBar = 50;
    private Room actualRoom;
    
    /**
     * Constructor for the object Player
     * Stength and defense of character are using for battle
     * Money cannot be negative but has not positive limit
     * Armor and Weapon can be null at the begining
     * 
     * @param name : it is the name of character (NPC or Player)
     * @param stren : it is the strength point of the character
     * @param def : it is the defense point of the caracter
     * @param mon : it the money of character
     * @param r1 : it is the actual room where the character is
     * @param sizeInt : it is the size of inventory
     * @param wea : it is the weapon which is carried by character
     * @param amo : it is the armor which is carried by character
     */
    public Player(String name,int stren, int def, int mon,int sizeInt, Weapon wea, Armor amo,Room r1)
    {
        super(name,stren,def,mon,sizeInt,wea,amo);
        actualRoom=r1;
    }
    /*
    * get for karma attribute
    */

    /**
     *
     * @return 
     */

    public int getKarma(){
        return karmaBar;
    }
    /**
     * setter for the karma attribute
     * @param k which is the karma value that need to be set
     */
    public void setKarma(int k){
        karmaBar=k;
    }
    
    /*
    * This method allow to add 10 points to the karma bar of the player
    */   

    /**
     *
     */
   
    public void add10Karma()
    {
        if(karmaBar >= 90)
        {
            setKarma(100);
        }
        else setKarma(karmaBar+10);
    }
   
    /*
    * This method allow to delete 10 points to the karma bar of the player
    */

    /**
     *
     */

    public void del10Karma()
    {
        if(karmaBar <= 10)
        {
            setKarma(0);
        }
        else setKarma(karmaBar-10);
    }
    /**
     * 
     * @return the room where the player is
     */
    public Room getActualRoom()
    {
        return actualRoom;
    }
    /**
     * 
     * @param r which is the actualRoom value which will be set
     */
    public void setActualRoom(Room r)
    {
        actualRoom=r;
    }
}
