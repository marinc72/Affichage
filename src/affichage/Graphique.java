package affichage;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Insets;
import java.net.MalformedURLException;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Graphique {


    public void Affiche() {
        //final ImageIcon backgroundImage = new ImageIcon("C:/imgWoZ/ground.jpg");
        //JLabel gameGrid = new JLabel(backgroundImage) {
        //};
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        //----------------------------------------------------------------------
        //-----------------------------GAME GRID--------------------------------
        JLabel gameGrid = new JLabel();
        gameGrid.setLayout(new GridLayout(5,5));
        for(int row=0; row < 5; row ++){
            for(int col=0; col < 5; col ++){
                if((row+col)%2==0){
                   ImageIcon dalle1 = new ImageIcon(new ImageIcon("C:/imgWoz/dalleFinal.png").getImage().getScaledInstance(120,160, Image.SCALE_DEFAULT));
                   JButton button = new JButton(dalle1);
                   button.setPreferredSize(new Dimension(100,100));
                   button.setMinimumSize(new Dimension(100,100));
                   gameGrid.add(button);
                }
                else{
                    ImageIcon dalle2 = new ImageIcon(new ImageIcon("C:/imgWoz/monstre1.png").getImage().getScaledInstance(120,160, Image.SCALE_DEFAULT));
                    JButton button = new JButton(dalle2);
                    button.setPreferredSize(new Dimension(100,100));
                    button.setMinimumSize(new Dimension(100,100));
                    gameGrid.add(button);
                
                }
                }
            }
        gameGrid.setPreferredSize(new Dimension(600,500));//largeur,hauteur
        gameGrid.setMinimumSize(new Dimension(600,500));
        //----------------------------------------------------------------------
        //--------------------------TOP PANEL-----------------------------------
        JLabel hudTop = new JLabel();
        hudTop.setLayout(new GridLayout(1,3));        
        hudTop.setPreferredSize(new Dimension(700,200));
        hudTop.setMinimumSize(new Dimension(700,200));
        //----------------------------------------------------------------------
        JLabel hudTopLeft = new JLabel();
        hudTopLeft.setLayout(new GridLayout(3,1));
        hudTopLeft.add(new JButton("hp"));
        hudTopLeft.add(new JButton("karma"));
        hudTopLeft.add(new JButton("armor"));
        hudTop.add(hudTopLeft);
        //---------------------------------------------------------------------
        JLabel hudTopCenter = new JLabel();
        hudTopCenter.setLayout(new GridLayout(1,1));
        ImageIcon test = new ImageIcon(new ImageIcon("C:/imgWoz/babbu2.jpg").getImage().getScaledInstance(500,500, Image.SCALE_DEFAULT));
        hudTopCenter.add(new JButton(test));
        hudTop.add(hudTopCenter);
        //----------------------------------------------------------------------
        JLabel hudTopRight = new JLabel();
        hudTopRight.setLayout(new GridLayout(3,1));
        hudTopRight.add(new JButton("Inventory"));
        hudTopRight.add(new JButton("Armor Equiped"));
        hudTopRight.add(new JButton("Weapon Equiped"));
        hudTop.add(hudTopRight);

        //----------------------------------------------------------------------
        //----------------------------RIGHT PANEL-------------------------------
        JLabel hudRight = new JLabel();
        hudRight.setLayout(new GridLayout(3,1));
        JButton button1 = new JButton("Interaction 1");
       // button1.setBackground(Color.RGBtoHSB(102, 51, 0, null));//102.51
        hudRight.add(button1);
        hudRight.add(new JButton("Interaction 2"));
        hudRight.add(new JButton("Interaction 3"));
        hudRight.setPreferredSize(new Dimension(100,800));
        hudRight.setMinimumSize(new Dimension(100,800));
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        frame.add(gameGrid,BorderLayout.WEST);
        frame.add(hudTop,BorderLayout.NORTH);
        frame.add(hudRight,BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);
        //----------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    //----------------------Rescaling Image to JLabel---------------------------
    
    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    /**
    *    public static void main(String [ ] args) {
    * 
    * 
    *       TestBackgroundLayout2 test = new TestBackgroundLayout2();    
    *       test.Affiche();
    *    }
    */
}