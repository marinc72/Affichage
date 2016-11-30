/*
*This class allows the creation of a chest which is an object which is used by the character 
* @Marion & Clément
* version 22/11/2016
*/
package affichage;

/**
 *
 * @author Paul
 */
public class Chest {
    
    private int money;//the money contained in the chest.
    private Inventory inv; // inventary presents in the chest created
    private String nameChest; // name of the chest created
    
    /**
     * Constructor which allows the creation of the chest
     * @param name name of the chest to do a difference between the different chest
     * @param m money presents in the chest
     */
    public Chest(String name, int m, int sizeInv){
        money = m;
        nameChest = name;
        inv = new Inventory(sizeInv);
    }
    
    //method which allows to change the money in the chest
    public void setMoney(int mt)
    {  
        money = mt;
    }
    
    //method which returns the money in the chest 

    /**
     *
     * @return
     */
    public int getMoney() 
    {
        return money;
    }
    
    //method which returns the name of the chest 

    /**
     *
     * @return
     */
    public String getNameChest()
    {
        return nameChest;
    }
    

    
    //method which returns the inventory presents in the chest 

    /**
     *
     * @return
     */
    public Inventory getInventory()
    {
        return inv;
    }
}

