/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package affichage;

/**
 *
 * @author saspaanithy
 */
public class Move {
    
    private boolean Open;
    private Door d;
    private MagicDoor md;
    private LockedDoor ld;
    private Room Room_game;
    private String pwd_user;
    private Key mykey;
    private Room actualroom, nextroom;
    private Key key; 
    
    
public Move( ){
}    
    /* Room_Game() permet la modification de actual Room et de nextRoom. 
       Permet au player de changer de room en fonction du type de porte.
    */
    
    
    public void Room_Game(Door d){
        
        
        if(Type_Door(d) == 3){
            
            if(d.isLocked() == true){
                System.out.println("La porte est fermé");
                }
        
            else {
                System.out.println("La porte est ouverte");
                // code pour cliquer sur la porte alors replaceRoom fonction ( If)
                d.replaceRoom();
                }
        }
        
        if(Type_Door(d) == 1){
            if(d.isLocked() == true){
                System.out.println("La porte est fermé");
                    
                if (md.resolve(pwd_user) == true){
                        System.out.println("Bonne réponse, la porte s'ouvre");
                        d.replaceRoom();
                }
                
                else if (md.resolve(pwd_user) == false){
                        System.out.println("Mauvaise réponse, la porte reste fermé");
                    }
            }
            
        else {
                System.out.println("La porte est ouverte");
                d.replaceRoom();
             }    
        }
        
        if (Type_Door(d) == 2){
            
            if(d.isLocked() == true){
                System.out.println("La porte est fermé");
                
                if(ld.checkKey(key) == true){
                    System.out.println("La porte viens de s'ouvrir grâce à la clé");
                    d.replaceRoom();
                    }   
                
                else {
                    System.out.println("La porte ne s'ouvre pas avec la clé");
                }
            }
        
            else {
                System.out.println("La porte est ouverte");
                d.replaceRoom();
                }
        }
    }
    
    
  
        
    /*
        Type_Door() permet de savoir se type de porte et l'ouverture de la porte 
    */
    
    public int Type_Door(Door d){
        if (d.getClass() == MagicDoor.class){
            return 1;
        }
        else if (d.getClass() == LockedDoor.class){
            return 2;
            
    }
        else return 3;
    }
 
}


