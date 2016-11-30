/*
 * This class allows the creation of the armor which is an object which is used by the character.
 * @Marion & Clément
 * version 22/11/2016
*/
package affichage;

//the class Armor is a heiress class of the class Item.

/**
 *
 * @author Paul
 */

public class Armor extends Item {
    private int defense; // creation of the object's defense


/**
 * Constructor with the parameteers of the class Item and the defense pararmeter.
 * @param nI name of the item
 * @param px price of the object
 * @param def defense 
 */
public Armor(String nI, int pc, int def){
    super(nI,pc);
    defense = def;   
}

/**
 * the method allows Characters to use an item allowing the defense.
 * @param character 
 */
public void use(Character character){}

//The method returns the value of the defense of the Character.

    /**
     *
     * @return
     */
public int getDefense(){
return defense;
}
}
