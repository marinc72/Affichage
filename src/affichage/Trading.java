/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package affichage;

/**
 *
 * @author Jonathan
 */
public class Trading {

    public Trading(){
        
    }
//money contre objet, objet vs objet, objet vs rien, money vs rien, rien vs objet,
//rien vs money, objet vs money
//
    public void tradeObjectPlayerToChest(Player p, Chest ch, Item obj){ 

        if(ch.getInventory().getInv().size()!= ch.getInventory().getSize()){
            ch.getInventory().addObject(obj);
            p.getInventory().deleteObject(obj);
        }
        else {
            System.out.println("Le coffre est plein !");
        }
    }

    public void tradeObjectChestToPlayer(Player p, Chest ch, Item obj){ 

        if(p.getInventory().getInv().size()!= p.getInventory().getSize()){
            p.getInventory().addObject(obj);
            ch.getInventory().deleteObject(obj);
        }
        else {
            System.out.println("Votre inventaire est plein !");
        }
    }

    public void tradeMoneyChestToPlayer(Player p, Chest ch){
        p.setMoney(ch.getMoney());
        ch.setMoney(0);
    }

    public int tradeObjectCharacterToPlayer(Player p, NPC chara, Item obj) {

        if(p.getInventory().getInv().size()!= p.getInventory().getSize()){
            p.getInventory().addObject(obj);
            chara.getInventory().deleteObject(obj);
            return obj.getPrice();
        }
        else {
            System.out.println("Votre inventaire est plein !");
        }
        return 0;
    }

    public int tradeObjectPlayerToCharacter(Player p, NPC chara, Item obj) {

        if(chara.getInventory().getInv().size()!= chara.getInventory().getSize()){
            chara.getInventory().addObject(obj);
            p.getInventory().deleteObject(obj);
            return obj.getPrice();
        }
        else {
            System.out.println("L'inventaire de "+chara.getName()+" est plein !");
        }
        return 0;
    }

    public void tradeMoneyDeadCharacterToPlayer(Player p, NPC chara){
        p.setMoney(chara.getMoney());
        chara.setMoney(0);
    }

    public void tradeMoneyCharacterToPlayer(Player p, NPC chara, int price){
        p.setMoney(price);
        chara.setMoney(-price);
    }

    public void tradeMoneyPlayerToCharacter(Player p, NPC chara, int price){
        p.setMoney(-price);
        chara.setMoney(price);
    }

    public void tradeObjectDeadCharacterToPlayer(Player p, NPC chara, Item obj) {

        if(p.getInventory().getInv().size()!= p.getInventory().getSize()){
            p.getInventory().addObject(obj);
            chara.getInventory().deleteObject(obj);
        }
        else {
            System.out.println("Votre inventaire est plein !");
        }
    }

    public void tradeObjectPlayerToDeadCharacter(Player p, NPC chara, Item obj) {

        if(chara.getInventory().getInv().size()!= chara.getInventory().getSize()){
            chara.getInventory().addObject(obj);
            p.getInventory().deleteObject(obj);
        }
        else {
            System.out.println("L'inventaire de "+chara.getName()+" est plein !");
        }
    }
}
