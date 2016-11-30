/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package affichage;

/**
 *
 * @author Paul
 */
public class Battle {
    
    private NPC myEnemy;
    private Player myPlayer;
    
    public Battle(NPC enemy, Player player){
        myEnemy = enemy;
        myPlayer = player;
    }
    
    public void beat(){
        boolean again = true;
        System.out.println("Battle GO !!!");
        int cpt =0;
        while (again){
            
            if(myPlayer.getHP()!=0&&myEnemy.getHP()!=0){
                playerAttack(2);
                cpt+=1;
            }
            if(myPlayer.getHP()!=0&&myEnemy.getHP()!=0){
                enemyAttack(1);
                cpt+=1;
            }
            if(myPlayer.getHP()==0||myEnemy.getHP()==0){
                again=false;
            }
            if(myPlayer.getHP()==0){
                System.out.println("Player KO en "+cpt+" tours");
            }
            if(myEnemy.getHP()==0){
                System.out.println("Enemy KO en "+cpt+" tours");
            }
        }
        
        
        
    }
    
    public void enemyAttack(int intensity){
        int damage = (int)((myEnemy.getTotalStr()*intensity*myEnemy.getHP()*0.01)/(myPlayer.getTotalDef()*myPlayer.getHP()*0.01));
        if(damage==0){
            myPlayer.LoseHP(1);
        }
        else{
            myPlayer.LoseHP(damage);
        }
        System.out.println("PV Player = "+myPlayer.getHP());
        System.out.println("PV Enemy = "+myEnemy.getHP());
        System.out.println("----------------------");
    }
    
    public void playerAttack(int intensity){
        int damage = (int)((myPlayer.getTotalStr()*intensity*myPlayer.getHP()*0.01)/(myEnemy.getTotalDef()*myEnemy.getHP()*0.01));
        if(damage==0){
            myEnemy.LoseHP(1);
        }
        else{
            myEnemy.LoseHP(damage);
        }
        System.out.println("PV Player = "+myPlayer.getHP());
        System.out.println("PV Enemy = "+myEnemy.getHP());
        System.out.println("----------------------");
    }
}
